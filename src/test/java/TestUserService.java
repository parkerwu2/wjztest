
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import test.domain.IwAgent;
import test.service.TestServiceImpl;

/**
 * 创建时间：2015-1-27 下午10:45:38
 *
 * @author andy
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
        "classpath:spring-mybatis.xml" })
public class TestUserService {

    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private TestServiceImpl testService;

    @Test
    public void testQueryAll() {
        System.out.println("hello world");
        List<Long> ids = new ArrayList<Long>();
        ids.add(1l);
        ids.add(2l);
        ids.add(391l);
        List<IwAgent> list = testService.query(ids);
        LOGGER.info(JSON.toJSON(list));
    }


}
