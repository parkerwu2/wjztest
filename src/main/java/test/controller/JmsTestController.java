package test.controller;

/**
 * Created by parker on 2017/3/11.
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.jms.Destination;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.common.activemq.ProducerServiceImpl;
import test.domain.entity.TestEntity;


@Controller
@RequestMapping("jms")
public class JmsTestController {

    @Autowired
    private ProducerServiceImpl producerService;
    @Autowired
    @Qualifier("topicDestination")
    private Destination destination;

    @RequestMapping("test")
    public @ResponseBody String testSend() throws Exception {

        //系统业务需要， 需要更新用户表中信息，根据id更新name
        List<TestEntity> list = new LinkedList<TestEntity>();

        TestEntity en = new TestEntity();
        en.setId(100);
        en.setName("name1");
        list.add(en);

        TestEntity en2 = new TestEntity();
        en2.setId(1002);
        en2.setName("name2");
        list.add(en2);

        Map<String,Object> mapEntity = new HashMap<String, Object>();
        mapEntity.put("user", list);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("update", mapEntity);

        System.out.println("发送方发送内容为：" + JSON.toJSONString(map));
        //发送更新数据请求
        producerService.sendMessage(destination, JSON.toJSONString(map));

        return "jms exute complete";
    }
}
