package za.co.problem;

import java.util.*;
import java.lang.*;

import static java.lang.Math.pow;

public class DrawSquare {
    public int dimensions = 0;

    public static int getDimensions() {

        Scanner Scanner = new Scanner(System.in);

        int num = Scanner.nextInt();
        return num;
    }

    public static int[][] randomSquare(int nrRotation, int nrBlocks) {
        int di = (int) pow(nrBlocks,2);
        Random random = new Random();


        // create method that will return random numbers
        int[][] arr = new int[nrBlocks][nrBlocks];
        for (int i = 0; i != nrBlocks; i++) {

            int k = 0;

            while (Count(nrBlocks, arr)[i] != 15) {

                if (k < nrBlocks) {
                    arr[i][k] = random.nextInt();
                    k++;

                } else {
                    k = 0;
                }
            }
        }

        return arr;
    }

    public static int[] Count(int dimensions, int[][] arr){
        // validate whether rows and columns, equate to n


        int[] count = new int[dimensions];
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            while (j != arr.length){
                count[i] += arr[i][j];
                j++;
            }

        }
        return count;
    }

    public static String makeBorders(int dimensions){

        int[][] arr = randomSquare(0, dimensions);

        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }
        return "";
    }

    public static void main(String[] args) {
        makeBorders(getDimensions());
    }
}