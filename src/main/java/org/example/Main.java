package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nameAges =  new HashMap<>();
        //insert
        nameAges.put("Elisha", 23);
        nameAges.put("Dudu", 16);

        //retrieve
        int ageOfElisha = nameAges.get("Elisha");

        //loop through map
        for (Map.Entry nameAndAge : nameAges.entrySet()){
            System.out.println(nameAndAge);
        }

        // Check if contains something
     for(Map.Entry<String, Integer> nameAndAges : nameAges.entrySet()){
         if(nameAndAges.getValue() > 16){
             System.out.println(nameAndAges.getKey());
         }
     }
    }
}