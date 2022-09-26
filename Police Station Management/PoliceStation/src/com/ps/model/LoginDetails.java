package com.ps.model;

public class LoginDetails {
   private String police_id;
   private String user_name;
   private String password;
   private String email;
   private String designation;
   private String recovery_code;

    public LoginDetails(String police_id, String user_name, String password, String email, String designation, String recovery_code) {
        this.police_id = police_id;
        this.user_name = user_name;
        this.password = password;
        this.email = email;
        this.designation = designation;
        this.recovery_code = recovery_code;
    }

    public String getPolice_id() {
        return police_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignation() {
        return designation;
    }

    public String getRecovery_code() {
        return recovery_code;
    }

    public void setPolice_id(String police_id) {
        this.police_id = police_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setRecovery_code(String recovery_code) {
        this.recovery_code = recovery_code;
    }
   
   
   
   
    
    
}
