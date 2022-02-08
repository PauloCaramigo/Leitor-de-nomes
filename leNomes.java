package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class leNomes {
	static char[] nome;
	
	static boolean continuar = true;
	static boolean booleanCebola = false;
	
	static int qtdLetras;

	public static void posicaoLetras() {
		for(int i = 0; nome.length > i; i++ ) {
			
			if (nome[i] != ' ') {
				System.out.println("A " + (i+1) + "º posição do nome é: " + nome[i]);
			} else {
				System.out.println("\nA " + (i+1) + "º posição é um espaço em branco\n");
			}
		}
		System.out.println(nome);
	}
	public static void countLetras() {
		qtdLetras = 0;
		for(int i = 0; nome.length > i; i++ ) {
			
			if (nome[i] != ' ') {
				qtdLetras++;
			}
		}
		System.out.println("\nSeu nome tem " + qtdLetras + " letras.\n");
	}
	public static void modeCebolinha() {
		if (booleanCebola == false) {
			booleanCebola = true;
			for(int i = 0; nome.length > i; i++) {
				if(nome[i] == 'r') {
					nome[i] = 'l';
				} else if (nome[i] == 'R') {
					nome[i] = 'L';
				}
			}
			
			System.out.println(nome);
		} else {
			System.out.println("o modo cebola já foi ativado");
		}
	}
	public static void reverseCebolinha() {
		if (booleanCebola == true) {
			for(int i = 0; nome.length > i; i++) {
				if(nome[i] == 'l') {
					nome[i] = 'r';
				} else if (nome[i] == 'L') {
					nome[i] = 'R';
				}
			}
			System.out.println(nome);
			booleanCebola = false;
		} else {
			System.out.println("O mode cebola não foi ativado");
		}
		
	}
	
	public static void switchName() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc1.nextLine().toCharArray();
	}
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite uma palavra ou frase: ");
		nome = sc1.nextLine().toCharArray();
		while (continuar == true) {
			System.out.println("----- MENU -----\n"
					+ "1- Posição das letras da palavra.\n"
					+ "2- Quantidade de letras.\n"
					+ "3- Modo cebolinha.\n"
					+ "4- Reverter o modo cebolinha.\n"
					+ "5- Trocar de palavra/frase.\n"
					+ "6- Fechar o programa.");
			
			System.out.println("\nEscolha uma opção de 1 a 6;");
			int escolha = sc1.nextInt();
			if(escolha == 1) {
				posicaoLetras();
			} else if(escolha == 2) {
				countLetras();
			} else if (escolha == 3) {
				modeCebolinha();
			} else if (escolha == 4) {
				reverseCebolinha();
			} else if (escolha == 5){
				switchName();
			} else if (escolha == 6) {
				System.out.println("\nO programa foi finalizado.");
				break;
			}
		}
	}
}
