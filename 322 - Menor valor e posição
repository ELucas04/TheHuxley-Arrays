import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    int leng = input.nextInt();
    int[] vect = new int[leng];
    int menor = 0, posicao = 0;
    
    for (int i = 0; i < vect.length; i++) {
        int num = input.nextInt();
        vect[i] = num;
    }
    for (int i = 0; i < vect.length; i++) {
        if (i == 0) {
            menor = vect[i];
        }
        if (vect[i] <= menor)  {
            menor = vect[i];
            posicao = i;
        }
    }
    System.out.printf("Menor valor: %d%nPosicao: %d", menor, posicao);
    
    input.close();
  }
}
