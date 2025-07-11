package com.vetias.java.workshop.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ListExample {
            public static void main (String[]args){
                List<String> names = new ArrayList<>();
                names.add("keerthi");
                names.add("mathi");
                names.add("nithu");
                names.add("sabi");

                names.forEach(System.out::println);
                names.sort(Comparator.reverseOrder());
                System.out.println(names);
                }


                }