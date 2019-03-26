/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.service;

import org.springframework.stereotype.Controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import com.heavengate.whistle.commons.GetWhistleRequest;
import com.heavengate.whistle.commons.*;
import com.heavengate.whistle.commons.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author JayDee
 */

@Controller
public class WhistleController {
    
    @Autowired
    private WhistleService whistleService;
    
    @PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE, value="getwhistle")
    public ResponseEntity<Result<GetWhistleResponse>> getWhistle(RequestEntity<GetWhistleRequest> request) {
        return this.whistleService.getWhistle(request); 
    }
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE, value="addwhistle") 
    public ResponseEntity<Result<AddWhistleResponse>> addNewWhistle(RequestEntity<AddWhistleRequest> request) {
        return this.whistleService.addNewWhistle(request);
}
    
    @GetMapping(consumes= MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, value="getAwhistle")
    public ResponseEntity<Result<AddWhistleResponse>> getAWhistle() {
        return null;
    }
    
}
