package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro f1 = new Carro();
		f1.marca = "Ferrari";
		f1.modelo = "F88";
		f1.chassi = "F45679FRTY";
		f1.ano = 2015;
		f1.partida();
		f1.acelerar();
		f1.freiar();
		System.out.println(f1.marca);
		System.out.println(f1.modelo);
		
	}

}
