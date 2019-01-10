package com.dome.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/1/2.
 */
public class Student implements Serializable{

    private String name;
    private Integer age;
    private String sex;

    public Student(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
