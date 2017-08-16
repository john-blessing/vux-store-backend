package com.xiaofu;

import javax.annotation.Generated;

/**
 * Created by keifc on 2017/8/16.
 */
@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String username;
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
