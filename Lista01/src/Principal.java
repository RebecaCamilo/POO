import java.util.Scanner;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
//		 * 1 - O índice de massa corpórea (IMC) de um indivíduo é obtido dividindo-se o seu peso (em Kg) pelo quadrado da 
//		altura (em metros). Assim, por exemplo, uma pessoa de 1,67m e pesando 55kg tem IMC igual a 19,73. Escreva um 
//		programa que solicite ao usuário o seu peso em kg e sua altura em metros e, a partir deles, calcule o índice de 
//		massa corpórea e apresente o resultado de acordo com a situação abaixo.
//		 IMC Situação
//		 < 18,5 Magro
//		 18,5 – 24,9 Normal
//		 25,0 – 29,9 Sobrepeso
//		 30,0 – 34,9 Obeso
//		 35,0 – 39,9 Obesidade mórbida
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
			System.out.printf("Seu IMC é %.2f.  Sua situação é: Magro.", imc);
		else if(imc < 24.9)
			System.out.printf("Seu IMC é %.2f. Sua situação é: Normal.", imc);
		else if(imc < 29.9)
			System.out.printf("Seu IMC é %.2f.  Sua situação é: Sobrepeso.", imc);
		else if(imc < 34.9)
			System.out.printf("Seu IMC é %.2f.  Sua situação é: Obeso.", imc);
		else if(imc < 39.9)
			System.out.printf("Seu IMC é %.2f.  Sua situação é: Obesidade mórbida.", imc);
		*/
		
//		2 - Faça um programa que peça ao usuário para cadastrar uma senha. Na sequência, deve pedir ao usuário que 
//		digite dois números inteiros e calcular a divisão do primeiro pelo segundo. O programa deve solicitar ao usuário 
//		a senha e, caso esteja correta, mostrar o resultado da divisão. Caso a senha esteja incorreta, mostrar uma mensagem 
//		de erro e encerrar o aplicativo (sem mostrar o resultado da divisão). OBS: Para encerrar seu aplicativo, utilize o 
//		método System.exit(0).
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.print("--- CALCULADORA SECRETA ---\n");
		System.out.print("Cadastre uma senha: ");
		String senha = entrada.next();
		System.out.println("Digite dois números inteiros: ");
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
		
//		3 - Utilizando o método compareTo() encontre o menor nome (mais próximo da letra A) num grupo de 5 nomes.***********

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
			String letra = String.valueOf(nomes[i].charAt(0)); //essa foi a correção que fiz para ser a mais próxima de "a", ele pega apenas o primeiro caracter da String e faz o resto das comparações
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
			System.out.println("O menor nome é: " + nomes[0]);
		else if(maior_real == n1)
			System.out.println("O menor nome é: " + nomes[1]);
		else if(maior_real == n2)
			System.out.println("O menor nome é: " + nomes[2]);
		else if(maior_real == n3)
			System.out.println("O menor nome é: " + nomes[3]);
		else if(maior_real == n4)
			System.out.println("O menor nome é: " + nomes[4]);
*/
		
//		4 - Faça um programa para verificar a validade de uma senha fornecida pelo usuário. Se o usuário digitar a 
//		senha ‘123456’, escrever a mensagem ‘Acesso liberado’. Caso contrário, escrever ‘Acesso negado’;
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
		
//		5 - Faça um programa para ler o número de gols marcados pelo Nacional de Patos e o número de gols marcados 
//		pelo Treze. Escrever o nome do time vencedor. Caso não haja vencedor, escrever EMPATE.
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
			System.out.println("O time vencedor é o Nacional de Patos!");
		else
			System.out.println("O time vencedor é o Treze!");
*/
//		6 - Faça um programa que receba um número e exiba o dia correspondente (1 – domingo, 2 – segunda, 
//		3 – terça, 4 – quarta, 5 – quinta, 6 – sexta e 7 – sábado).
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
				System.out.println("Terça");
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
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Número digitado inválido");
		}
*/
//		7 - Faça um programa que leia três valores inteiros A, B e C e diga se a soma de A + B é menor que C.
/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite tres valores inteiros: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		if((a + b) > c)
			System.out.println("A soma dos primeiros 2 valores é maior que o ultimo valor digitado.");
*/
//		8 – Faça um programa que sorteie 6 números entre 1 e 60.
/*
		System.out.println("Sorteio de 6 números entre 1 e 60: ");
		int sorteado = 0, cont;
		int jogo[] = {0, 0, 0, 0, 0, 0};
		
		for(cont = 0; cont < 6; cont++) {
			sorteado = (int)(1 + Math.random() * 60);
			jogo[cont] = sorteado;
			System.out.print(jogo[cont] + " ");
		}

		Arrays.sort(jogo);
		System.out.println("\nExibição Ordenada: ");
		for(int elemento : jogo) {
			System.out.printf("%d ", elemento);
		}
*/
//		9 – Faça um programa que escreve os números pares entre 1 e 20.
/*
		for(int i = 1; i < 20; i++)
			if(i % 2 == 0)
				System.out.println(i + " ");
*/

//		10 – Faça um programa que calcula a média de 3 notas de 10 alunos.
		


	}

}
