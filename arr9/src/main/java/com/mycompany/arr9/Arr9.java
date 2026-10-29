package com.mycompany.arr9;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Arr9 {

    public static void main(String[] args) {
        Map<Integer, Integer> num = new HashMap<>();
        
        int[] arreglo = {2, 14, 6, 11, 8, 15, 7};
        int objetivo = 9;
        
        for (int i = 0; i < arreglo.length; i++) {
            int comp = objetivo - arreglo[i];
            
            if (num.containsKey(comp)) {
                System.out.println("Indices encontrados: " + num.get(comp) + " y " + i);
                return;
            }
            
            num.put(arreglo[i], i);
        }
    }
}
