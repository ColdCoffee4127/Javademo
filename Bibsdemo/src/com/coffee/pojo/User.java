package com.coffee.pojo;

/**
 * @ClassName User
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 09:37
 * @Version 1.0
 **/
public class User {
    private String userName;
    private String password;
    private String realName;
    private String userRole;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
