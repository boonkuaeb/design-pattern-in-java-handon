package com.bk.patterns.singleton;

public class DateUtil {

    // Step 3
    private static DateUtil instance;

    // Step 1
    private DateUtil() {
    }

    // Step 2
    public static DateUtil getInstance() {
        if (instance == null) {
            instance = new DateUtil();
        }
        return instance;
    }
}
