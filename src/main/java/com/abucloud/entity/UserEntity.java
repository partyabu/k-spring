package com.abucloud.entity;

import java.io.Serializable;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/3 16:41
 */
public class UserEntity implements Serializable {

    private StuEntity stuEntity;

    private String name;

    public UserEntity() {
    }

    public UserEntity(String name) {
        this.name = name;
    }

    public StuEntity getStuEntity() {
        return stuEntity;
    }

    public void setStuEntity(StuEntity stuEntity) {
        this.stuEntity = stuEntity;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "stuEntity=" + stuEntity +
                ", name='" + name + '\'' +
                '}';
    }
}
