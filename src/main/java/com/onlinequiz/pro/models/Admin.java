package com.onlinequiz.pro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
     @Column(name = "adminusername")
    String adminusername;
    @Column(name = "adminpassword")
     String adminpassword;

    public Admin() {

    }

    public Admin(String adminusername, String adminpassword) {
        this.adminusername = adminusername;
        this.adminpassword = adminpassword;
    }

    public String getAdminusername() {
        return adminusername;
    }

    public void setAdminusername(String adminusername) {
        this.adminusername = adminusername;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }
}
