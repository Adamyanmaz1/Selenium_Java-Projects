package com.Java_Techincal_Excer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RetrieveMostfreqW {


    public static void main(String[] args) {


        System.out.println(retriveMostFrequentlyUsedWords("Purchase Order Item Help can't find item item is too much part of purchase need fix for image item delivered too fast purchase order too big is purchase order coming?Too big why", Arrays.asList("IS")));

    }

    public static List<String> retriveMostFrequentlyUsedWords(String helpText, List<String> wordsToExclude) {

        ArrayList<String> listliteratureText = new ArrayList<String>(Arrays.asList(helpText.split("\\s+")));

        // Removing the words to be excluded
        listliteratureText.removeAll(wordsToExclude);

        // Create map with words as key and frequency as value

        Map<String, Long> map = listliteratureText.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Get the max frequency from map value
        Long maxFreq = Collections.max(map.values());
        // Filter the map for removing the key not having max frequency and send the key as list
        return map.keySet().stream().filter(key -> map.get(key) == maxFreq).collect(Collectors.toList());
    }
}



