package test.IDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.SchoolInfo;
import test.domain.SchoolInfoExample;

public interface SchoolInfoMapper {
    int deleteByExample(SchoolInfoExample example);

    int deleteByPrimaryKey(Integer schoolid);

    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    List<SchoolInfo> selectByExample(SchoolInfoExample example);

    SchoolInfo selectByPrimaryKey(Integer schoolid);

    int updateByExampleSelective(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByExample(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByPrimaryKeySelective(SchoolInfo record);

    int updateByPrimaryKey(SchoolInfo record);
}