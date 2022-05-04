package com.abucloud.entity;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/3 16:49
 */
public class StuEntity {

    private Integer age;

    public StuEntity(Integer age) {
        this.age = age;
    }

    public StuEntity() {
    }

    @Override
    public String toString() {
        return "StuEntity{" +
                "age=" + age +
                '}';
    }
}
