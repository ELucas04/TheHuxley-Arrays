import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    final int MAX = 10;
    int k, i;
    //int[] array = new int[MAX];
    boolean run = true;
    
    while (run) {
        k = 0;
        
        int n = input.nextInt();
        if (n == -1) {
            return;
        }
        i = 0;
        while (i < 10) {
           // array[i] = n;
            
            if (input.nextInt() == n) {
                k++;
            }
            i++;
        }
        System.out.printf("%d appeared %d times\n", n, k);
    }
    }
}
