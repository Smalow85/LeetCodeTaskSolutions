package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegers {

    public static int romanToInteger(String roman) {
        Map<String, Integer> latinSymbols = new HashMap<>();
        latinSymbols.put("I", 1);
        latinSymbols.put("V", 5);
        latinSymbols.put("X", 10);
        latinSymbols.put("L", 50);
        latinSymbols.put("C", 100);
        latinSymbols.put("D", 500);
        latinSymbols.put("M", 1000);

        int sum = 0;
        String [] symbols = roman.split("");
        for(int i = 0; i < symbols.length; i++){
            if (i < symbols.length - 1 && latinSymbols.get(symbols[i]) < latinSymbols.get(symbols[i+1])){
                sum -= latinSymbols.get(symbols[i]);
            }
            else{
                sum += latinSymbols.get(symbols[i]);
            }
        }
        return sum;
    }
}
