package src.com.java.workshop;

import java.util.Scanner;
public class Namegenerated {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=length.name();
        System.out.println("Enter your gender");
        String gender=length.next();
        System.out.println("Enter your qualification");
        String qualification=length.next();
        StringBuilder sb=new StringBuilder();
        if("female".equalsIgnoreCase(gender)){
            sb.append("miss").append(gender);
        }
    }

}
