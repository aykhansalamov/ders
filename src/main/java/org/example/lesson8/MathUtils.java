package org.example.lesson8;

public class MathUtils {

    // 2 int parametrli metod
    int add(int a, int b) {
        return a + b;
    }

    // 3 int parametrli metod (Overloading)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2 double parametrli metod
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        int x = mathUtils.add(1, 2);
        System.out.println(x);

        int y = mathUtils.add(1, 2, 3);
        System.out.println(y);

        double z = mathUtils.add(1.5, 2.3);
        System.out.println(z);
    }

}
