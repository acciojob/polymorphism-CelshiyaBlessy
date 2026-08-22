package com.driver;

public class Main {
    public static class Product {

        // Method 1: takes 2 int values
        public int product(int x, int y) {
            return x * y;
        }

        // Method 2: takes 3 int values
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Method 3: takes 2 double values
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        // Create Product object
        Product p = new Product();

        // Call first product method
        int result1 = p.product(2, 3);

        // Call overloaded method with 3 integers
        int result2 = p.product(2, 3, 4);

        // Call overloaded method with 2 double values
        double result3 = p.product(2.5, 4.0);

        System.out.println("Product of 2 and 3 = " + result1);
        System.out.println("Product of 2, 3 and 4 = " + result2);
        System.out.println("Product of 2.5 and 4.0 = " + result3);
    }
}