package br.com.petshop.animais;

public class Passaro extends Animal{
	private String penagemPassaro;
	public Passaro(String nomeAnimal, String corAnimal, String nomeDono, double nmrDono, double pesoAnimal, String penagemPassaro) {
		super(nomeAnimal, corAnimal, nomeDono, nmrDono, pesoAnimal);
		// TODO Auto-generated constructor stub
		this.penagemPassaro = penagemPassaro;
	}
	
	private double consultaPassaro;
	@Override
	public double consultaAnimal() {
		// TODO Auto-generated method stub
		consultaPassaro = super.consultaAnimal();
		return consultaPassaro = 250;
	}

	
}
