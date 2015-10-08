package br.senac.pi;

public class EstruturaDeControleFor {
	public static void main(String[] args){
		/*for (int i = 0 ; i <= 100; i++){
			if (i % 2 == 0 && i != 0){
				System.out.println(i);
			}
		}*/
		double n = 9000;
		int x = 100;
		int y =0;
		for(double i = 900000;i>=0;i--){
			y++;
			if(y == n){
				System.out.println(x);
				x --;
				y=0;
			}
			if(i == 0)
				System.out.println("Boom!");
			
		}
	}

}
