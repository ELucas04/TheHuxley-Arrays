import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);    
    
    int[][] mat1 = new int[6][6];
    int[][] mat2 = new int[6][6];
    int[][] matResultante = new int[6][6];
    
    for (int i = 0; i < mat1.length; i++) {
        for (int j = 0; j < mat1.length; j++) {
            mat1[i][j] = input.nextInt();
        }
        System.out.println();
    }
    
    for (int i = 0; i < mat2.length; i++) {
        for (int j = 0; j < mat2.length; j++) {
            mat2[i][j] = input.nextInt();
        }
    }
    
    for (int i = 0; i < matResultante.length; i++) {
        for (int j = 0; j < matResultante.length; j++) {
            matResultante[i][j] += mat1[i][j] + mat2[i][j];
        }
    }
    
    for (int i = 0; i < matResultante.length; i++) {
        for (int j = 0; j < matResultante.length; j++) {
            System.out.printf("%d", matResultante[i][j]);
            if (j < 5){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    
  }
}
