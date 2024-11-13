package org.ghosttrio;

public class Main {

    public void matchStringTest(String test) {
        if (test.equals("TEST1")) {
            System.out.println("TEST1");
        } else {
            System.out.println("TEST2");
        }
    }

    public enum Test {
        TEST1, TEST2
    }

    public void matchEnumTest(Test test) {
        if (test == Test.TEST1) {
            System.out.println("TEST1");
        } else {
            System.out.println("TEST2");
        }
    }
}