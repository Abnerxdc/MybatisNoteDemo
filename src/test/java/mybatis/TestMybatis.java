package mybatis;

import com.xdc.mybatis.bean.Classes;
import com.xdc.mybatis.bean.Student;
import com.xdc.mybatis.bean.User;
import com.xdc.mybatis.dao.GetSqlSessionFactory;
import com.xdc.mybatis.interfac.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/5.
 */
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);

    @Test
    public void getAll(){
        SqlSession openSession = GetSqlSessionFactory.getSqlSession();
        UserMapper mapper = openSession.getMapper(UserMapper.class);
        List<User> use = mapper.getAllUsers();
        logger.debug("use:" +use);
    }

    @Test
    public void getAllStudentClass(){
        SqlSession openSession = GetSqlSessionFactory.getSqlSession();
        UserMapper mapper = openSession.getMapper(UserMapper.class);
        List<Classes> classes = mapper.getAllStudentClass();
        logger.debug("use:" +classes);
    }
}
