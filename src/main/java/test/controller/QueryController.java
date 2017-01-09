package test.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.domain.IwAgent;
import test.service.TestServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */

@Controller
@RequestMapping("/test")
public class QueryController {
    @Autowired
    private TestServiceImpl testService;

    @RequestMapping("/query")
    @ResponseBody
    public Object testQuery() {
        List<Long> ids = new ArrayList<Long>();
        ids.add(1l);
        ids.add(2l);
        ids.add(381l);
        List<IwAgent> l = testService.query(ids);
        return l;
    }
}
