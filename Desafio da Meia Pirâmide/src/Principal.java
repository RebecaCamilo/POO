
public class Principal {

	public static void main(String[] args) {
		
	//Passando a String para o vetor de inteiros
		String strNumeros = "51 98 12 31 09 21 20 77 65 10 86 43 83 18 71";
		String ArrayStrNumeros[] = strNumeros.split(" ");		
		int ArrayNumeros[] = new int[ArrayStrNumeros.length];		
		for(int i = 0; i < ArrayNumeros.length; i++) {
			ArrayNumeros[i] = Integer.parseInt(ArrayStrNumeros[i]);
		}
		
	//Mostrando no console a quantidade de numeros que vai compor a meia
	//pirâmide, a String strNumeros e o vetor de inteiros ArrayNumeros
		System.out.println("Quantidade: " + ArrayNumeros.length);
		System.out.println("String = " + strNumeros);
		System.out.print("Lista = [");
		int n = 0;
		while(n < (ArrayNumeros.length - 1)) {
			System.out.print(ArrayNumeros[n] + ", ");
			n++;
		}
		System.out.println(ArrayNumeros[n] + "]\n");
		
	//Mostrando a meia pirâmide, passando os menores valores de cada linha para o vetor menoresNum 
	//para ser mostrado posteriormente e somando os menores valores na variável soma
		System.out.println("----------------------\n");
		System.out.println("------ PIRAMIDE ------");
		
		int menoresNum[] = new int[5];	//5 = quantidade de linhas da pirâmide
		int soma = 0;

		for(int i = 0, j = 0, TotalNumLinha = 1; i < ArrayNumeros.length; TotalNumLinha++, j++) { //TotalNumLinha=1, prim. linha > 1 item
			int menorNum = ArrayNumeros[i];
			for(int QuantNumLinha = 0; QuantNumLinha < TotalNumLinha; QuantNumLinha++, i++) { 
				System.out.printf("%2d ", ArrayNumeros[i]);
				if(ArrayNumeros[i] < menorNum)
					menorNum = ArrayNumeros[i];
			}
			menoresNum[j] = menorNum;
			soma += menorNum;
			System.out.println();
		}
		
		System.out.println("\n----------------------");
		
	//Mostrando os menores valores e a soma deles
		System.out.print("\nOs menores valores são: ");
		n = 0;
		while(n < (menoresNum.length - 1)) {
			System.out.print(menoresNum[n] + ", ");
			n++;
		}
		System.out.println(menoresNum[n]);		
		System.out.println("A soma dos menores valores é: " + soma);		

	}
}









public boolean removerNo(String nomeMateria) {
	NoMaterias atual = this.prim;
	NoMaterias ant   = null;
	if(eVazia()) {
		return false;
	}
	
	
	
	
	
	
	else {
		while((atual != null) && (!atual.getMateria().getNomeMateria().equals(nomeMateria))) {
			ant = atual;
			atual = atual.getProx();
		}
		if(atual == this.prim) {
			if(this.prim == this.ult) {
				this.ult = null;
			}
			this.prim = this.prim.getProx();
		} 
		else {
			if(atual == this.ult) {
				this.ult = ant;
			}
			ant.setProx(atual.getProx());
		}
		this.quantiNo--;
		return true;
	}
}






