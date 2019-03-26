/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.commons;

import com.heavengate.whistle.service.WhistleEntity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JayDee
 */
public class GetWhistleResponse {
    
       private List<Whistles> whistles;
    
    public void setWhistles(List<Whistles> whistles) {
        this.whistles = whistles;
    }
    
    public List<Whistles> getWhistles() {
        return this.whistles;
    }

    
}
