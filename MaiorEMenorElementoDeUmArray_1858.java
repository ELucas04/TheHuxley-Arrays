import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vect = new int[6];
		
		for (int i = 0; i < 6; i++) {
			int num = input.nextInt();
			vect[i] = num;
		}
		
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				maior = vect[i];
				menor = vect[i];
			}
			if (vect[i] > maior) {
				maior = vect[i];
			}
			if (vect[i] < menor) {
				menor = vect[i];
			}
		}
		
		System.out.printf("%d%n%d", menor, maior);
		
		
		
		input.close();
	}
}
