package com.xdc.mybatis.bean;

/**
 * Created by Administrator on 2017/6/3.
 * 定义student表所对应的实体类
 */
public class Student {
    //定义属性，和student表中的字段对应
    private int id;            //id===>s_id
    private String name;    //name===>s_name
    private int class_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String s_name) {
        this.name = s_name;
    }
    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}
