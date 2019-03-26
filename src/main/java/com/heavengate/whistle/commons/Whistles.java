/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.commons;

import java.util.List;
import java.util.Date;
import com.heavengate.whistle.service.WhistleEntity;

/**
 *
 * @author JayDee
 */
public class Whistles {
    
    private String whistleid;
    private String whistlename;
    private String whistle;
    private Date creationdate;
    
    
    public String getWhistleid() {
        return whistleid;
    }
    
    public void setWhistleid(String id) {
        this.whistleid = id;
    }
    
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
    
    public Date getCreationdate() {
        return this.creationdate;
    }
    
    public void setCreationdate(Date date) {
        this.creationdate = date;
    }
    
    
}
