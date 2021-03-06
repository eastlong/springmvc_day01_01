package cn.itcast.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private String username;
    private String password;
    private Double money;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Double getMoney() {
        return money;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }
}
