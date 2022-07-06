import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int aux;
    int[] vect = new int[n];
    
    for (int i = 0; i < n; i++) {
        vect[i] = input.nextInt();
        input.nextLine();
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (vect[i] > vect[j]) {
                aux = vect[i];
                vect[i] = vect[j];
                vect[j] = aux;
            }
        }
    }
    
    for (int i = 0; i < n; i++) {
        System.out.printf("[%d]", vect[i]);
    }
    
    
  }   
}
