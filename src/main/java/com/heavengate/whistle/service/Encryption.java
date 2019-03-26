/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heavengate.whistle.service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author JayDee
 */
public class Encryption {
	
	private static final String UNICODE_FORMAT  = "UTF-8";	
    
    public static String encrypt(String strClearTxt, String strKey) {
        String strData = "";
        
        try {
            SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
            byte[] encrypted = cipher.doFinal(strClearTxt.getBytes(UNICODE_FORMAT));
            strData = new String(encrypted);
        } catch(Exception ex) {
            ex.printStackTrace(System.err);
        } 
        return strData;
    }
    
    
    public static String decrypt(String strEncrypted, String strKey) {
        String strData = "";
        
        try {
             
            SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, skeyspec);
            byte[] decrypted = cipher.doFinal(strEncrypted.getBytes(UNICODE_FORMAT));
            strData = new String(decrypted);
            
        } catch( Exception ex) {
            ex.printStackTrace(System.err);
        }
        
        return strData;
    }
    
    
}
