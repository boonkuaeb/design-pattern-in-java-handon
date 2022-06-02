package com.bk.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable {

    // Step 3
    private static volatile DateUtil instance;

    // Step 1
    private DateUtil() {
    }

    // Step 2
    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    public Object readResolve()
    {
        return  instance;
    }
}
