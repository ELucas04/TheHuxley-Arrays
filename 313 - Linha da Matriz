import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    int[][] mat = new int[12][12]; 
    int linha = input.nextInt();
    char s_m = input.next().charAt(0);
    
    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
            mat[i][j] = input.nextInt();
        }
        System.out.println();
    }
    
    double soma = 0.0;
    
    
    for (int i = 0; i < 12; i++) {
        soma += mat[linha][i];
    }
    
    double media = soma / 12.0;
    
    if (s_m == 'S') {
        System.out.printf("%.1f", soma);
    }
    else if (s_m == 'M') {
        System.out.printf("%.1f", media);
    }
    
  }
}
