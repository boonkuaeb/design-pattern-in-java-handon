package com.bk.patterns.singleton;

import java.io.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new File("C:\\WorkSpace\\design-pattern-in-java\\Design-Pattern-Hand-On\\corepatterns\\singleton\\dateUtil.ser")));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(new File("C:\\WorkSpace\\design-pattern-in-java\\Design-Pattern-Hand-On\\corepatterns\\singleton\\dateUtil.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        // == is checking the same object in the memory
        System.out.println(dateUtil1==dateUtil2);
    }
}
