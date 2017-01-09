package test.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.IwAgent;
import test.domain.IwAgentExample;

public interface IwAgentMapper {
    int deleteByExample(IwAgentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IwAgent record);

    int insertSelective(IwAgent record);

    List<IwAgent> selectByExample(IwAgentExample example);

    IwAgent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IwAgent record, @Param("example") IwAgentExample example);

    int updateByExample(@Param("record") IwAgent record, @Param("example") IwAgentExample example);

    int updateByPrimaryKeySelective(IwAgent record);

    int updateByPrimaryKey(IwAgent record);
}