import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    int m = input.nextInt();
    int n = input.nextInt();
    
    int[][] mat = new int[m][n];
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            mat[i][j] = input.nextInt();
        }
        System.out.println();
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(mat[j][i] + " ");
        }
        System.out.println();
    }
    
  }
}
