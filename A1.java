package Uebung9;

public class A1 {

    public void methodA(int x, int y) {
        System.out.println(Integer.toString(x + y));
    }

    public boolean testIfEven(int x) {
        return x%2 == 0;
    }

    public int methodB(int z) {
        return z*z;
    }

    public boolean isOdd(int test) {
        return test%2 != 0;
    }

    public boolean isNullTestMethod(Object o) {
        return o == null;
    }

    private static void printTestMethods(Object o) {
        // TODO: Übungblatt 9, Aufgabe 1
        Class c = o.getClass();
        Object[] methoden = c.getMethods();

        for(Object method : methoden) {
            if(method.toString().toUpperCase().contains("TEST")) {
                System.out.println(method);
            }
        }

    }

    public static void main(String[] args) {
        printTestMethods(new A1());
    }
}
