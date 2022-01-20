package com.francisco.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DataManipulation {

    private final Map<String, Integer> counter = new TreeMap<>();
    private int maxValueFoundInMap;
    private String dataFoundInMap = null;

    protected String retrieveData(List<String> listOfData) {

        for (String data : listOfData)
            counter.compute(data, (key, value) -> value == null ? 1 : value + 1);

        maxValueFoundInMap = (Collections.max(counter.values()));

        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == maxValueFoundInMap) {
                dataFoundInMap = entry.getKey();
            }
        }
        return dataFoundInMap;
    }

    protected Integer maxValueFoundInMap() {
        maxValueFoundInMap = (Collections.max(counter.values()));
        return maxValueFoundInMap;
    }
}
