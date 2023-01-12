package za.co.problem;

import java.util.*;
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

        int[][] arr = new int[dimensions][dimensions];
        for (int i = 0; i != dimensions; i++) {


            for (int j = 0; j < dimensions; j++) {
                    
                arr[i][j] += 0;
                System.out.printf("*");

            }
            System.out.printf("\n");
        }

        System.out.printf(Arrays.toString(arr[2]));
        return "";
    }

    public static void main(String[] args) {
        makeBorders(getDimensions());
    }
}