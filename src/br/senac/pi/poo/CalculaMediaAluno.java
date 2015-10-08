package br.senac.pi.poo;
import java.util.Scanner;
public class CalculaMediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite o nome do Aluno");
		String aluno = leitura.next();
		System.out.println("digite a primeira nota do aluno");
		double nota1 = leitura.nextDouble();
		System.out.println("digite a segunda nota do aluno");
		double nota2 = leitura.nextDouble();
		System.out.println("digite a terceira nota do aluno");
		double nota3 = leitura.nextDouble();
		double media = (nota1+nota2+nota3)/3;
		if(media >= 7){
			System.out.println(aluno+" Você está Aprovado");
			System.out.println("sua media é :"+media);
		}
		else if(media >= 6){
			System.out.println(aluno+" Você está em Recuperação");
			System.out.println("sua media é :"+media);
		}
		else{
			System.out.println(aluno+" Você está Reprovado");
			System.out.println("sua media é :"+media);
		}
		
	}

}
