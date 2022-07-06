import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    int votos;
    
    int princesas = input.nextInt();
    int eleitores = input.nextInt();
    
    int[][] mat = new int[princesas][eleitores];
    
    for (int j = 0; j < eleitores; j++) {
        for (int i = 0; i < princesas; i++) {
            mat[i][j] = input.nextInt();
        }
    }
    
    for (int i = 0; i < princesas; i++) {
        votos = 0;
        for (int j = 0; j < eleitores; j++) {
            if (mat[i][j] == 1) {
                votos++;
            }
        }
        System.out.printf("Princesa %d: %d voto(s)\n", i+1, votos);
    }
    
  }
}
