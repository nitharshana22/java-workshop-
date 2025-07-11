package com.java.workshop.bacisc.java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingBinary {
    public static void main(String[]args){
        try(FileInputStream inputStream=new FileInputStream("vijay.jpeg");
        FileOutputStream OutputStream=new FileOutputStream("mhj.jpeg")){
            byte[]chunk=new byte[2048];
            int byteRead;
            while((byteRead=inputStream.read(chunk))!=-1){
                OutputStream.write(chunk,0,byteRead);
            }
        }catch(IOException e){
            System.out.println("Error in reading or writing the file");
        }
    }
}
