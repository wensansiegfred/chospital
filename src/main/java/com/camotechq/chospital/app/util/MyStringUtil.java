package com.camotechq.chospital.app.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyStringUtil {
	
	public static String strHash(String str) {		
        try {           
			MessageDigest md = MessageDigest.getInstance("MD5");
			    
			md.update(str.getBytes());
			    
			byte[] bytes = md.digest();
			   
			StringBuilder sb = new StringBuilder();
			    
			for(int i=0; i< bytes.length ;i++) {
			    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			   
			return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
	}
}
