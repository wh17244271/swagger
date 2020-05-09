package com.swagger.entity;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author DDS
 * @date 2019/9/10 13:55
 */
@ApiModel("用户实体")
@Data
public class User {

    /**
     * 用户Id
     */
    @ApiModelProperty("用户id")
    private int id;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户姓名", example = "zhangdan", required = true)
    private String name;

    /**
     * 用户地址
     */
    @ApiModelProperty(value = "用户地址", example = "北京市海淀区", required = true)
    private String address;

    /**
     * 用户手机号
     */
    @ApiModelProperty(value = "用户手机号", example = "15689652367", required = true)
    private String phone;

    /**
     * 用户年龄
     */
    @ApiModelProperty(value = "用户年龄", example = "24", required = true)
    private Integer age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
