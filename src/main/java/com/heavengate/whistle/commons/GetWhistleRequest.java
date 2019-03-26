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
public class GetWhistleRequest {
    
    private String whistleid, whistlepassword;
    
    public String getWhistleid() {
        return this.whistleid;
    }
    
    public void SetWhistleid(String whistleid) {
        this.whistleid = whistleid;
    }
    
     public String getWhistlepassword() {
        return this.whistlepassword;
    }
    
    public void setWhistlepassword(String password) {
        this.whistlepassword = password;
    }
    
}
