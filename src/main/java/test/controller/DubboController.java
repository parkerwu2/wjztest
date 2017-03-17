package test.controller;

import dubbolearn.testapi.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by parker on 2017/3/17.
 */
@Controller
@RequestMapping("dubbo")
public class DubboController {
    private static final Logger logger = LoggerFactory.getLogger(DubboController.class);
    @Autowired
    private IProductService productService;
    @RequestMapping("test")
    @ResponseBody
    public String test() {
        String productName = this.productService.getProductName();
        return productName;
    }
}
