package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for(Integer i:source){
            if(i >= threshold){
                result.add(i);
                logger.log("Элемент " + i + " проходит");
            } else{
                logger.log("Элемент " + i + " не проходит");
            }
        }
        return result;
    }
}