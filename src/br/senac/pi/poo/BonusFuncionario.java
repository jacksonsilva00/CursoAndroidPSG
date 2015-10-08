package br.senac.pi.poo;
import java.util.Scanner;
public class BonusFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite o salario do gerente :");
		double gerente = leitura.nextDouble();
		System.out.println("digite o salario do coordenador :");
		double coordenador = leitura.nextDouble();
		System.out.println("digite o salario do supervisor :");
		double supervisor = leitura.nextDouble();
		System.out.println("digite 1 para Gerente");
		System.out.println("digite 2 para Coordenador");
		System.out.println("digite 3 para Supervisor");
		int x =leitura.nextInt();
		switch(x){
		case 1:
			System.out.println("Seu Bonus é: "+(gerente*0.15));
			break;
		case 2:
			System.out.println("Seu Bonus é: "+(coordenador*0.10));
			break;
		case 3:
			System.out.println("Seu Bonus é: "+(supervisor*0.08));
			break;
		}
	}

}
