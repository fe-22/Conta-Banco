package contaterminal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta corrente:     ");
		int contaCorrente = sc.nextInt();
		System.out.println("Digite o numero da agencia:    ");
		double agencia = sc.nextDouble();
		System.out.println("Digite o nome do cliente:   ");
		String Nomecliente = sc.next();
		
		double saldo = 12.000;
		System.out.println(saldo);
		
		

	}

}