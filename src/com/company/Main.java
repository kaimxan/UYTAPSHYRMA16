package com.company;

import java.util.Scanner;

public class Main {

    public static double main(String[] args) {
	// write your code here


        static void  area() {
            Scanner scanner = new Scanner(System.in);
            double area = scanner.nextInt();
            int radius = scanner.nextInt();
            area = Math.PI * (radius * radius);
            System.out.println(area);
        }

        static void circumference() {
            Scanner scanner = new Scanner(System.in);
            double circumference = scanner.nextDouble();
            int radius = scanner.nextInt();
            circumference = Math.PI * 2 * radius;
            System.out.println(circumference);

        }
    }
    }

