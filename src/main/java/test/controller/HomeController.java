package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/10.
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String welcome() {
        return "/index";
    }
}
