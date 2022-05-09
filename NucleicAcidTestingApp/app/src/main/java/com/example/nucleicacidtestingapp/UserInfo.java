package com.example.nucleicacidtestingapp;

public class UserInfo {
    protected static String name = null;
    protected static String id = null;
    protected static String password = null;
    protected static String phone = null;
    protected static boolean state = false;
    protected static boolean isOP = false;
    public static  boolean getIsOP(){
        return UserInfo.isOP;
    }

    public UserInfo get(){
        return this;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static String getPhone() {
        return phone;
    }
    public static boolean getState(){
        return state;
    }
    public static void setId(String id) {
        UserInfo.id = id;
    }

    public static void setName(String name) {
        UserInfo.name = name;
    }

    public static void setPassword(String password) {
        UserInfo.password = password;
    }

    public static void setPhone(String phone) {
        UserInfo.phone = phone;
    }

    public static void setState(boolean state) {
        UserInfo.state = state;
    }

    public static boolean login(String password){
        if(UserInfo.password == password){
            setState(true);
            if(OPChecker()){
                setIsOP(true);
            }
            return true;
        }
        else
            return false;
    }

    public static boolean OPChecker(){
        return false;
    }

    public static void setIsOP(boolean isOP) {
        UserInfo.isOP = isOP;
    }
}