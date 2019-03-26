/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.service;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import com.heavengate.whistle.commons.GetWhistleRequest;
import com.heavengate.whistle.commons.*;
import com.heavengate.whistle.commons.Result;
/**
 *
 * @author JayDee
 */
public interface WhistleService {
    
    ResponseEntity<Result<GetWhistleResponse>> getWhistle(RequestEntity<GetWhistleRequest> request);
    
    ResponseEntity<Result<AddWhistleResponse>> addNewWhistle(RequestEntity<AddWhistleRequest> request);
    
}
