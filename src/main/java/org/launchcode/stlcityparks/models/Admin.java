package org.launchcode.stlcityparks.models;

public class Admin {

    private String userId;
    private String password;

    //constructor
    public Admin(String userId, String password){
        this.userId = userId;
        this.password = password;
    }

    //getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
