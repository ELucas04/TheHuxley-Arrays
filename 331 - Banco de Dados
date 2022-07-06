import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int leng = input.nextInt();
		int[] vIdade = new int[leng];
		String[] vNome = new String[leng];
		char[] vSexo = new char[leng];
		char[] vCivil = new char[leng];
		int [] vAmigos = new int[leng];
		int [] vFotos = new int[leng];
		
		input.nextLine();
		
		for (int i = 0; i < leng; i++) {
			int idade = input.nextInt();
			vIdade[i] = idade;
			input.nextLine();
			String nome = input.nextLine();
			vNome[i] = nome;
			char sexo = input.next().charAt(0);
			vSexo[i] = sexo;
			char civil = input.next().charAt(0);
			vCivil[i] = civil;
			int amigos = input.nextInt();
			vAmigos[i] = amigos;
			int fotos = input.nextInt();
			vFotos[i] = fotos;
		}
		
		for (int i = 0; i < leng; i++) {
			System.out.printf("Idade: %d%nNome: %s%nSexo: %s%nEstado Civil: %s%nNumero de amigos: %d%nNumero de fotos: %d%n", vIdade[i], vNome[i], vSexo[i], vCivil[i], vAmigos[i], vFotos[i]);
			System.out.println("");
		}
		
		
		input.close();
	}
}
