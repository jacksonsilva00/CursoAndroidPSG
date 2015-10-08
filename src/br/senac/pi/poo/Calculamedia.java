package br.senac.pi.poo;
import java.util.Scanner;
public class Calculamedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite a quantidade de funcionarios :");
		int quant = leitura.nextInt();
		System.out.println("digite o valor dos salarios dos funcionarios :");
		double salarios = leitura.nextDouble();
		System.out.println("a media dos salarios é :"+salarios/quant);
		
	}

}
