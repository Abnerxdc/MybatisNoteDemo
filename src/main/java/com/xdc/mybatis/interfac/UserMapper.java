package com.xdc.mybatis.interfac;

import com.xdc.mybatis.bean.Classes;
import com.xdc.mybatis.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
public interface UserMapper {
    @Insert("insert into users(name, age) values(#{name}, #{age})")
    public int add(User user);

    @Delete("delete from users where id = #{id}")
    public int deleteById(int id);

    @Update("update users set name = #{name}, age = #{age} where id = #{id}")
    public int update(User user);

    @Select("select * from users where id = #{id}")
    public User getUserById(int id);

    @Select("select * from tb_user")
    @Results(
            {
            @Result(column = "mobile",property = "mobilePhone"),
            @Result(column = "username",property = "userName")
    }
    )
    public List<User> getAllUsers();

    @Select("select c.id cid,c.name,s.s_name from class c,student s where c.id = s.class_id ")
    @Results(
            {
                    @Result(column = "cid",property = "id"),
                    @Result(column = "name",property = "name")
                    //一对多尚未实现
                    //@Result(column = "s_name",property = "s_name")
            }
    )
    public List<Classes> getAllStudentClass();
}
