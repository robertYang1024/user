package com.justTest;

import java.io.UnsupportedEncodingException;

public class Test02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "我是 cm";
        Test02.printChart(string.toCharArray());  
        Test02.printChart(string.getBytes("ISO-8859-1"));  
        Test02.printChart(string.getBytes("GBK"));  
        Test02.printChart(string.getBytes("UTF-8"));  
    }  
      
    /** 
     * char转换为16进制 
     */  
    public static void printChart(char[] chars){  
        for(int i = 0 ; i < chars.length ; i++){
            System.out.print(Integer.toHexString(chars[i]) + " ");
//            System.out.print(Integer.toHexString(new char);
        }
        System.out.println("");
    }
      
    /** 
     * byte转换为16进制 
     */  
    public static void printChart(byte[] bytes){  
        for(int i = 0 ; i < bytes.length ; i++){  
            String hex = Integer.toHexString(bytes[i] & 0xFF);   
             if (hex.length() == 1) {   
               hex = '0' + hex;   
             }   
             System.out.print(hex.toUpperCase() + " ");
        }
        System.out.println("");
    }
}  