package br.senac.pi;

public class Operacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Francisco";
		String sobrenome = "Andr�";
		
		System.out.println("Nome completo: "+ nome + sobrenome);
		
		int idade = 34;
		boolean brasileiro = true;
		
		System.out.println("Idade: " + idade);
		if(brasileiro){
			System.out.println("Brasileiro: "+ brasileiro);
		}
		System.out.println("Opera��es Matem�ticas");
		int n1 = 10;
		int n2 = 5;
		System.out.printf("Soma de %d e %d � :  ",n1,n2);
		System.out.println(n1+n2);
		System.out.printf("Multiplica��o de %d e %d � : ",n1,n2);
		System.out.println(n1*n2);
		System.out.printf("Divis�o de %d e %d � ",n1, n2);
		System.out.println(n1/n2);
		System.out.printf("Subtra��o: ",n1,n2);
		System.out.println(n1-n2);
		System.out.printf("Resto de %d e %d � :", n1, n2);
		System.out.println(n1%n2);
		System.out.println((n1+n2)*5);

	}

}
