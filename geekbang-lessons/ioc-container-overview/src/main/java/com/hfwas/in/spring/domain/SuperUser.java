package com.hfwas.in.spring.domain;

import com.hfwas.in.spring.annotation.Super;

/**
 * @ClassName SuperUser
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 5:20 下午
 * @Version: 1.0
 **/
@Super
public class SuperUser extends User{

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
