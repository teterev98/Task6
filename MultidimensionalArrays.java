import java.util.Random;

public class MultidimensionalArrays {
    public static void main(String[] args) {

    }
    public static int findMax(int[][] array){
        int max = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (max < j) {
                    max = j;
                }
            }
        }
        return max;
    }
    public static int findMin(int[][] array){
        int min = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (min > j) {
                    min = j;
                }
            }

        }
        return min;
    }
    public static int[][] createDoubleDimArray(int n, int m, int max, int min){
        int[][] ddarray = new int[n][];
        for (int i = 0; i < n; i++){
           ddarray[i] = createArray(m, max, min);
        }
        return ddarray;
    }

    public static int[] createArray( int n, int max, int min){
        int[]  array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = new Random().nextInt(max - min +1) + min;
        }
        return array;
    }
    public static void printArray( int[][] ddarray){
        for (int[] array : ddarray) {
            for (int j : array) {
                if (j < 0){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print(" " + j + " ");
                }
            }
            System.out.println();
        }
    }
    public static double getAverage(int[][] ddarray){
        int summ = 0;
        int count = 0;
        for (int[] array : ddarray) {
            for (int i : array ) {
                summ += i;
                count++;
            }
        }
        return (double) summ / count;
    }
    public static double getGeometricMean(int[][] ddarray){
        double product = 1;
        int count = 0;
        for (int[] array : ddarray) {
            for (int i : array ) {
                if (i < 0){
                    return -1;
                }
                product *= i;
                count++;
            }
        }
        return Math.pow(product, 1. / count);
    }
    public static void findLocalMin(int[][] ddarray){
        for ( int i = 1; i < ddarray.length - 1; i++) {
            for (int j = 1; j < ddarray[i].length - 1; i++) {
                if (ddarray[i][j] < ddarray[i-1][j] && ddarray[i][j] < ddarray[i+1][j]
                        && ddarray[i][j] < ddarray[i][j-1] && ddarray[i][j] < ddarray[i][j+1]){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static void findLocalMax(int[][] ddarray){
        for ( int i = 1; i < ddarray.length - 1; i++) {
            for (int j = 1; j < ddarray[i].length - 1; i++) {
                if (ddarray[i][j] > ddarray[i-1][j] && ddarray[i][j] > ddarray[i+1][j]
                        && ddarray[i][j] > ddarray[i][j-1] && ddarray[i][j] > ddarray[i][j+1]){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println( -1);
    }
    public static int[][] transposeSquareMat(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array[i].length; j++){
                    array[i][j] = array[i][j] ^ array[j][i];
                    array[j][i] = array[i][j] ^ array[j][i];
                    array[i][j] = array[i][j] ^ array[j][i];
            }
        }
        return array;
    }
    public static int[][] transposeRectMatrix(int[][] array){
        int[][] transposedMatrix = new int[(array[0].length)][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transposedMatrix[j][i] = array[i][j];
            }
        }

        return transposedMatrix;
    }

    public static int[][] transposeArray(int[][] array){
        if (array.length == array[0].length){
            return transposeSquareMat(array);
        }
        else {
            return transposeRectMatrix(array);
        }
    }

}