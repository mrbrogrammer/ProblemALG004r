package za.co.problem;

import java.util.Random;
import java.util.Scanner;
import java.lang.*;
import java.math.*;

import static java.lang.Math.pow;

public class DrawSquare {
    public int dimensions = 0;

    public static int getDimensions() {

        Scanner Scanner = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(9);

        int num = Scanner.nextInt();

        System.out.println(x);
        System.out.println(num);
        return num;
    }

    public static String makeBorders(int dimensions){

        int di = (int) pow(dimensions,2);
        System.out.println(di);
        for (int i = 0; i != dimensions; i++) {


            for (int j = 0; j < dimensions; j++) {
                System.out.printf("*");

            }
            System.out.printf("\n");
        }

        return "";
    }

    public static void main(String[] args) {
        makeBorders(getDimensions());
    }
}