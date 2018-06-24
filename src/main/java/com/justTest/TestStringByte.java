package com.justTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class TestStringByte {
    public static  void main (String[] args){
//        Integer.toHexString(5)
        File file = new File("d:\\test.txt");
        //方法一(java 获取系统中默认的编码) 获取系统默认编码
        System.out.println(System.getProperty("file.encoding"));

        //方法二(java 获取系统中默认的编码) 获取系统默认的字符编码
        System.out.println(Charset.defaultCharset());
        InputStream input = null;
        try {
            input = new FileInputStream(file);
            StringBuffer buffer = new StringBuffer();
            byte[] bytes = new byte[1024];
            for(int n ; (n = input.read(bytes))!=-1 ; ){
                buffer.append(new String(bytes,0,n));
            }
            System.out.println(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
