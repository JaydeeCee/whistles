/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.service;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author JayDee
 */
@Entity
@Table(schema="whistleschema", name="whistle")
public class WhistleEntity implements Serializable {
    
    /**
	 * @author JayDee
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String whistleid;
    
    @Column(nullable=false)
    private String whistlename;
    
    @Column(nullable=false, columnDefinition = "LONGTEXT")
    private String whistle;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationdate;
    
    
    public Long getId() {
        return this.id;
    }
    
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
