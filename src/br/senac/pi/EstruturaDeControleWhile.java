package br.senac.pi;
import java.util.Scanner;
public class EstruturaDeControleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =0;
		while(n<=100){
			System.out.println(n++);
		}
		boolean var =true;
		while(var){
			System.out.println();
			var = s.nextBoolean();
		}
		System.out.println("Terminou!");
	}

}
