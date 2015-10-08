package br.senac.pi;
import java.util.Scanner;
public class EstruturaDeControleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("digite um numero.");
		n = s.nextInt();
		switch(n){
		case 1 :
			System.out.println("valor da variavel é 1");
			break;
		case 2 :
			System.out.println("valor da variavel é 2");
			break;
		case 3 :
			System.out.println("valor da variavel é 3");
			break;
		case 4 :
			System.out.println("valor da variavel é 4");
			break;
		default:
			System.out.println("seu valor não esta nos casos ,seu numero é: "+n);
			break;
		}

	}

}
