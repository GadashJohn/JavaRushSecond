package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;

public class NimrodAi {
    
    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (PastryLoader pastryLoader : pastryLoaders) {
            for (String[][] memoryBank : pastryLoader.memory) {
                for (String[] memory : memoryBank) {
                    for (int i = 0; i < memory.length ; i++) {
                        if(memory[i].toLowerCase().contains("nimrod")){
                            memory[i] = memory[i].toLowerCase().replaceAll("nimrod","pirate ship");
                        }
                    }
                }
            }
        }

    }
}
 