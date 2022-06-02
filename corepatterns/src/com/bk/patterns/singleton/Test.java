package com.bk.patterns.singleton;

public class Test {
    public static void main(String[] args) {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        // == is checking the same object in the memory
        System.out.println(dateUtil1==dateUtil2);
    }
}
