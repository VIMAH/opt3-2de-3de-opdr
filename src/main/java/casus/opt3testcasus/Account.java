package casus.opt3testcasus;

import java.util.ArrayList;

public class Account {

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public static ArrayList<Account> accounts = new ArrayList<>();
    private String userName;

    private String passWord;


    public Account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        accounts.add(this);
    }
}
