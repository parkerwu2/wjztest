package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.IDao.IwAgentMapper;
import test.domain.IwAgent;
import test.domain.IwAgentExample;

import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
@Service
public class TestServiceImpl {
    @Autowired
    private IwAgentMapper iwAgentMapper;
    public List<IwAgent> query(List<Long> ids) {
        IwAgentExample example = new IwAgentExample();
        example.createCriteria().andIdIn(ids);
        return iwAgentMapper.selectByExample(example);
    }
}
