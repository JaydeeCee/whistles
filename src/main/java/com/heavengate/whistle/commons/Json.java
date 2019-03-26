/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.commons;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author JayDee
 */
public class Json {
    
    public static String toJson(Object object) {
		try {
			return new ObjectMapper().writeValueAsString(object);
		} catch(JsonProcessingException ex) {
			ex.printStackTrace(System.err);
		}
		return null;
	}
    
    
    
}
