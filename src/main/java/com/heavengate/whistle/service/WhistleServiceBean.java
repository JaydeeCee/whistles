/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.service;

import com.heavengate.whistle.commons.GetWhistleRequest;
import com.heavengate.whistle.commons.GetWhistleResponse;
import com.heavengate.whistle.commons.*;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.apache.commons.lang3.RandomStringUtils;
import java.math.BigDecimal;
import java.util.Calendar;
import org.slf4j.Logger;import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;



import java.util.List;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JayDee
 */
@Service
public class WhistleServiceBean implements WhistleService {
    
    
    private static final Logger logger = LoggerFactory.getLogger(WhistleServiceBean.class);
    
    @Autowired
    private WhistleRepository whistleRpository;
    
    
    
    
    
    @Override
    public  ResponseEntity<Result<GetWhistleResponse>> getWhistle(RequestEntity<GetWhistleRequest> request) {
        Result<GetWhistleResponse> result =  new Result<>();
        
        try {
        GetWhistleRequest whistleRequest = request.getBody();
        List<Whistles> whistles = null;
        List<WhistleEntity> whistleEntities = this.whistleRpository.findByWhistleid(whistleRequest.getWhistleid());
        
        for(WhistleEntity entity : whistleEntities) {
            String decryptedWhistle = Encryption.decrypt(entity.getWhistle(), whistleRequest.getWhistlepassword());
            Whistles whistle = new Whistles();
            whistle.setWhistleid(entity.getWhistleid());
            whistle.setWhistlename(entity.getWhistlename());
            whistle.setWhistle(decryptedWhistle);
            
            whistles.add(whistle);
        }
        
        GetWhistleResponse whistleResponse = new GetWhistleResponse();
        whistleResponse.setWhistles(whistles);
        
        result.setData(whistleResponse);
        result.setStatus(Boolean.TRUE);
        result.setMessage("successful");
        
        
        } catch(Exception ex) {
            result.setStatus(Boolean.FALSE);
            result.setMessage("Internal Server Error");
            ex.printStackTrace(System.err);
        } 
        return ResponseEntity.ok(result);
    };
    
    
    @Override
    public ResponseEntity<Result<AddWhistleResponse>> addNewWhistle(RequestEntity<AddWhistleRequest> request ) {
        Result<AddWhistleResponse> result = new Result<>();
       try {
        logger.debug(Json.toJson(request));
        
        AddWhistleRequest addWhistleRequest = request.getBody();
        
        WhistleEntity whistleEntity = new WhistleEntity();
        String whistle = Encryption.encrypt(addWhistleRequest.getWhistle(), addWhistleRequest.getWhistlepassword());
        
        whistleEntity.setWhistleid(addWhistleRequest.getWhistleid());
        whistleEntity.setWhistlename(addWhistleRequest.getWhistlename());
        whistleEntity.setWhistle(whistle);
        whistleEntity.setCreationdate(Calendar.getInstance().getTime());
        
        this.whistleRpository.save(whistleEntity);
        AddWhistleResponse addWhistleResponse = new AddWhistleResponse();
        addWhistleResponse.setStatus(Boolean.TRUE);
        
        result.setData(addWhistleResponse);
        result.setStatus(Boolean.TRUE);
        result.setMessage("Whistle Added");
        
       } catch(Exception e) {
           result.setStatus(Boolean.FALSE);
           result.setMessage("Internal Server Error");
           e.printStackTrace(System.err);
       }
       return ResponseEntity.ok(result);
    }
    
}
