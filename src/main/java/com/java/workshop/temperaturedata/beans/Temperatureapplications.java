package com.java.workshop.temperaturedata.beans;


public class Temperatureapplications {
    public static void main(String[]args){
        Organaizaton vet=new Organaizaton("Vellalar",
        "Thindal","www.vet.com","contact@vet.com",
        "+91-987654321",200938473);

    System.out.println(vet);
    System.out.println(vet.name());
    System.out.println(vet.completeAddress());
    System.out.println(vet.website());
    System.out.println(vet.email());
    System.out.println(vet.contactnumber());
    System.out.println(vet.registrationNumber());
    }
}
