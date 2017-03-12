package test.controller;

import client.SimpleChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by parker on 2017/3/12.
 */
@Controller
@RequestMapping("/netty")
public class NttyController {
    @Autowired
    private SimpleChatClient simpleChatClient;

    @RequestMapping("/run")
    public void test() {
        try {
            simpleChatClient.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
