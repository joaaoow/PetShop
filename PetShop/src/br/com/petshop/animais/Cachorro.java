package br.com.petshop.animais;

public class Cachorro extends Animal{
	private String racaCachorro; 
	public Cachorro(String nomeAnimal, String corAnimal, String nomeDono, double nmrDono, double pesoAnimal, String racaCachorro) {
		super(nomeAnimal, corAnimal, nomeDono, nmrDono, pesoAnimal);
		// TODO Auto-generated constructor stub
		this.racaCachorro = racaCachorro;
	}
	private double banhoCachorro;
	@Override
	public double banhoAnimal() {
		// TODO Auto-generated method stub
		banhoCachorro = super.banhoAnimal();
		return banhoCachorro = 80;
	}
	
	private double tosaCachorro;
	@Override
	public double tosaAnimal() {
		// TODO Auto-generated method stub
		tosaCachorro = super.tosaAnimal();
		return tosaCachorro = 80;
	}
	
	@Override
	public double consultaAnimal() {
		// TODO Auto-generated method stub
		return super.consultaAnimal();
	}
	
}
