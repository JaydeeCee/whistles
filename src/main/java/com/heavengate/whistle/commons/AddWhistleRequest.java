/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.commons;

/**
 *
 * @author JayDee
 */
public class AddWhistleRequest {
    
    private String whistlename, whistle, whistleid, whistlepassword;
    
     public String getWhistlename() {
        return this.whistlename;
    }
    
    public void setWhistlename(String name) {
        this.whistlename = name;
    }
    
    public String getWhistle() {
        return this.whistle;
    }
    
    public void setWhistle(String whistle) {
        this.whistle = whistle;
    }
    
     public String getWhistleid() {
        return whistleid;
    }
    
    public void setWhistleid(String id) {
        this.whistleid = id;
    }
    
    public String getWhistlepassword() {
        return this.whistlepassword;
    }
    
    public void setWhistlepassword(String password) {
        this.whistlepassword = password;
    }
    
    
    
}
