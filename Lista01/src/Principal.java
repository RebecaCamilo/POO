import java.util.Scanner;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
//		 * 1 - O �ndice de massa corp�rea (IMC) de um indiv�duo � obtido dividindo-se o seu peso (em Kg) pelo quadrado da 
//		altura (em metros). Assim, por exemplo, uma pessoa de 1,67m e pesando 55kg tem IMC igual a 19,73. Escreva um 
//		programa que solicite ao usu�rio o seu peso em kg e sua altura em metros e, a partir deles, calcule o �ndice de 
//		massa corp�rea e apresente o resultado de acordo com a situa��o abaixo.
//		 IMC Situa��o
//		 < 18,5 Magro
//		 18,5 � 24,9 Normal
//		 25,0 � 29,9 Sobrepeso
//		 30,0 � 34,9 Obeso
//		 35,0 � 39,9 Obesidade m�rbida
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.print("--- CALCULADORA DE IMC ---\n");
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc;
		imc = peso / (altura * altura);
//		System.out.print(imc);
		if(imc < 18.5)
			System.out.printf("Seu IMC � %.2f.  Sua situa��o �: Magro.", imc);
		else if(imc < 24.9)
			System.out.printf("Seu IMC � %.2f. Sua situa��o �: Normal.", imc);
		else if(imc < 29.9)
			System.out.printf("Seu IMC � %.2f.  Sua situa��o �: Sobrepeso.", imc);
		else if(imc < 34.9)
			System.out.printf("Seu IMC � %.2f.  Sua situa��o �: Obeso.", imc);
		else if(imc < 39.9)
			System.out.printf("Seu IMC � %.2f.  Sua situa��o �: Obesidade m�rbida.", imc);
		*/
		
//		2 - Fa�a um programa que pe�a ao usu�rio para cadastrar uma senha. Na sequ�ncia, deve pedir ao usu�rio que 
//		digite dois n�meros inteiros e calcular a divis�o do primeiro pelo segundo. O programa deve solicitar ao usu�rio 
//		a senha e, caso esteja correta, mostrar o resultado da divis�o. Caso a senha esteja incorreta, mostrar uma mensagem 
//		de erro e encerrar o aplicativo (sem mostrar o resultado da divis�o). OBS: Para encerrar seu aplicativo, utilize o 
//		m�todo System.exit(0).
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.print("--- CALCULADORA SECRETA ---\n");
		System.out.print("Cadastre uma senha: ");
		String senha = entrada.next();
		System.out.println("Digite dois n�meros inteiros: ");
		String n1 = entrada.next();
		String n2 = entrada.next();

		double n1d = Double.parseDouble(n1);
		double n2d = Double.parseDouble(n2);
		
		System.out.print("Confirme sua senha: ");
		String confSenha = entrada.next();
		if(confSenha.equals(senha))
			System.out.print(n1d + " / " + n2d + " = " + (n1d / n2d));
		else {
			System.out.print("ERRO: Senha incorreta.");
			System.exit(0);
		}
		*/
		
//		3 - Utilizando o m�todo compareTo() encontre o menor nome (mais pr�ximo da letra A) num grupo de 5 nomes.***********

		String nomes[] = { "Anne", "Claudio", "Ana", "Arthur", "Rebeca"};
		
		String menorNome = nomes[0];
		
		for(int i = 1; i < nomes.length; i++)
			if(menorNome.compareToIgnoreCase(nomes[i]) > 0) {
				menorNome = nomes[i];
			}
		System.out.println(menorNome);
		
		/*
		int temp = -100;
		String menorNome = "";
		
		for (int i = 0; i < nomes.length; i++) {
			String letra = String.valueOf(nomes[i].charAt(0)); //essa foi a corre��o que fiz para ser a mais pr�xima de "a", ele pega apenas o primeiro caracter da String e faz o resto das compara��es
			int valor = "a".compareToIgnoreCase(letra);
			
			if (valor >= temp) {
				temp = valor;
				menorNome = nomes[i];
			}		
		}
		
		System.out.println(menorNome);
		System.out.println(temp);
		
		*/
		/*
		if(maior_real == n0)
			System.out.println("O menor nome �: " + nomes[0]);
		else if(maior_real == n1)
			System.out.println("O menor nome �: " + nomes[1]);
		else if(maior_real == n2)
			System.out.println("O menor nome �: " + nomes[2]);
		else if(maior_real == n3)
			System.out.println("O menor nome �: " + nomes[3]);
		else if(maior_real == n4)
			System.out.println("O menor nome �: " + nomes[4]);
*/
		
//		4 - Fa�a um programa para verificar a validade de uma senha fornecida pelo usu�rio. Se o usu�rio digitar a 
//		senha �123456�, escrever a mensagem �Acesso liberado�. Caso contr�rio, escrever �Acesso negado�;
/*		
		Scanner entrada = new Scanner(System.in);
		String senha = "123456";
		
		System.out.println("Digite a senha: ");
		String senhaDigitada = entrada.next();
		
		if(senha.equals(senhaDigitada))
			System.out.println("Acesso liberado");
		else
			System.out.println("Acesso negado"); 
*/
		
//		5 - Fa�a um programa para ler o n�mero de gols marcados pelo Nacional de Patos e o n�mero de gols marcados 
//		pelo Treze. Escrever o nome do time vencedor. Caso n�o haja vencedor, escrever EMPATE.
/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Gols marcados pelo Nacional de Patos: ");
		int patos = entrada.nextInt();
		System.out.println("Gols marcados pelo Treza: ");
		int treze = entrada.nextInt();
		
		entrada.close();
		
		if(patos == treze) 
			System.out.println("EMPATE!");
		else if(patos > treze)
			System.out.println("O time vencedor � o Nacional de Patos!");
		else
			System.out.println("O time vencedor � o Treze!");
*/
//		6 - Fa�a um programa que receba um n�mero e exiba o dia correspondente (1 � domingo, 2 � segunda, 
//		3 � ter�a, 4 � quarta, 5 � quinta, 6 � sexta e 7 � s�bado).
/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 7: ");
		int n = entrada.nextInt();
		
		switch(n) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Ter�a");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("S�bado");
				break;
			default:
				System.out.println("N�mero digitado inv�lido");
		}
*/
//		7 - Fa�a um programa que leia tr�s valores inteiros A, B e C e diga se a soma de A + B � menor que C.
/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite tres valores inteiros: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		if((a + b) > c)
			System.out.println("A soma dos primeiros 2 valores � maior que o ultimo valor digitado.");
*/
//		8 � Fa�a um programa que sorteie 6 n�meros entre 1 e 60.
/*
		System.out.println("Sorteio de 6 n�meros entre 1 e 60: ");
		int sorteado = 0, cont;
		int jogo[] = {0, 0, 0, 0, 0, 0};
		
		for(cont = 0; cont < 6; cont++) {
			sorteado = (int)(1 + Math.random() * 60);
			jogo[cont] = sorteado;
			System.out.print(jogo[cont] + " ");
		}

		Arrays.sort(jogo);
		System.out.println("\nExibi��o Ordenada: ");
		for(int elemento : jogo) {
			System.out.printf("%d ", elemento);
		}
*/
//		9 � Fa�a um programa que escreve os n�meros pares entre 1 e 20.
/*
		for(int i = 1; i < 20; i++)
			if(i % 2 == 0)
				System.out.println(i + " ");
*/

//		10 � Fa�a um programa que calcula a m�dia de 3 notas de 10 alunos.
		


	}

}
