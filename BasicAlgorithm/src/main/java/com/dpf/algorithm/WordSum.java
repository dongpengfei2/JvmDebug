package com.dpf.algorithm;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 一个文件每个单词出现次数从大到小排序
 */
public class WordSum {

    public Map<String, Integer> fileToMap(File file) throws IOException {
        if (file==null) return null;
        Map<String, Integer> wordMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null) {
            final String[] splits = line.split(" ");
            for (String word : splits) {
                if (word.length() > 0) {
                    if (wordMap.containsKey(word)) {
                        wordMap.put(word, wordMap.get(word));
                    } else {
                        wordMap.put(word, 1);
                    }
                }
            }
        }
        return wordMap;
    }

}
