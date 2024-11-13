package org.ghosttrio;

public class SingletonTest {

    public enum Singleton {
        INSTANCE;
    }

    public static void main(String[] args) {

        Singleton a = Singleton.INSTANCE;

        Singleton b = Singleton.INSTANCE;

        System.out.println(a == b);  // true

        System.out.println(a.equals(b)); // true

        System.out.println(a.hashCode() == b.hashCode()); // true
    }
}
