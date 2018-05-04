package com.example.demo.bo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * Created by dell on 2018/5/4.
 */
@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    @JSONField(format="yyyy-MM-dd")
    private Date birthday;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {

        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthday() {
        return birthday;
    }
}
