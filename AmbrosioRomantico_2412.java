import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in); 
        
        int qtdIdeias = input.nextInt();
        int extrav = input.nextInt();
        int achou = 0;
        int[] ideias = new int[qtdIdeias];
        
        for (int i = 0; i < ideias.length; i++) {
            ideias[i] = input.nextInt();
        }
    
        for (int i = 0; i < ideias.length; i++) {
            for (int j = 0; j < ideias.length; j++) {
                if (i != j) {
                    if (ideias[i] + ideias[j] == extrav) {
                        achou = 1;
                        break;
                    }
                }
            }
        }
        
        if (achou == 1) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
        
    
  }
}
