import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int leng = input.nextInt();
		char[] vLetra = new char[leng + 1];
		
		for (int i = 1; i <= leng; i++) {
			int pos = input.nextInt();
			//input.nextLine();
			char letra = input.next().charAt(0);
			vLetra[pos] = letra;
		}
		
		for (int i = 1; i <= leng; i++) {
			System.out.print(vLetra[i]);
		}
		
		input.close();
	}
}
