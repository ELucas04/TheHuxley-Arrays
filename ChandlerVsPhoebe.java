import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[][] mat = new int[n][n];
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            mat[i][j] = input.nextInt();
        }
        System.out.println();
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (mat[j][i] < 0) {
                System.out.printf("%d", mat[j][i] * 2);
            }
            else {
                System.out.printf("%d", mat[j][i]);
            }
            if (j < n-1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    
  
  }
}
