package LineComparison;

import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate of first point");
        int x1 = sc.nextInt();
        System.out.println("Enter y coordinate of first point");
        int y1 = sc.nextInt();
        System.out.println("Enter x coordinate of second point");
        int x2 = sc.nextInt();
        System.out.println("Enter y coordinate of second point");
        int y2 = sc.nextInt();
        double dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance between these points is " + dist);
    }
}
