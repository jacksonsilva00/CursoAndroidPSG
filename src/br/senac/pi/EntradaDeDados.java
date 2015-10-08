package br.senac.pi;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá");//Mensagem inicial
		System.out.println("Digite um número: ");//Interage como usuário
		Scanner s = new Scanner(System.in);//Prepara entrada de dados
		int valor =  s.nextInt();//Faz a leitura de dados
		System.out.println("Valor: "+ valor);//Imprime o valor lido
		s.close();//Libera o recurso de entrada de dados

	}

}
