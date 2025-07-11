package com.vetias.java.workshop.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListMarks {
    public static void main(String[]args){
        List<Integer>marks=new ArrayList<>();
        marks.add(90);
        marks.add(78);
        marks.add(60);
        marks.add(90);
        Collections.sort(marks);
        System.out.println("Sorted List of marks in ascending:"+marks);
        System.out.println(marks);
        System.out.println("Sorted List of marks in decending"+marks);
    }
}
