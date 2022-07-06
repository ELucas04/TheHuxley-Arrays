import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int[] vect = new int[10];
    int cnt = 0;
    
    for (int i = 0; i < vect.length; i++) {
        int num = input.nextInt();
        vect[i] = num;
    }
    
    int n = input.nextInt();
    
    for (int i = 0; i < vect.length; i++) {
        if (n == vect[i]) {
            cnt++;
        }    
    }
    System.out.println(cnt);
    
    input.close();
    
  }
}
