import java.util.*;
public class Main {
    public static int[][] transpose(int [][] arr){
        int[][] clone = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                clone[j][i] = arr[i][j];
        return clone;
    }
    public static void main(String[] args) {
        int[][] list = { {2, 3 ,4} , {5, 6, 4} };
        System.out.println("Matris: " + Arrays.deepToString(list));
        System.out.println("Transpoze: " + Arrays.deepToString(transpose(list)));

    }
}