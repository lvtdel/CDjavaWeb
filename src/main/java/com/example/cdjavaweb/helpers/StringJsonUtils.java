package com.example.cdjavaweb.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class StringJsonUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();


    public static String objectToJson(Object object) {
        // Cho phép định dạng
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
