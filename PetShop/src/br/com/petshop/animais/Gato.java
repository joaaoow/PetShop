package br.com.petshop.animais;

public class Gato extends Animal{
	private String olhoGato;
	public Gato(String nomeAnimal, String corAnimal, String nomeDono, int nmrDono, double pesoAnimal, String olhoGato) {
		super(nomeAnimal, corAnimal, nomeDono, nmrDono, pesoAnimal);
		// TODO Auto-generated constructor stub
		this.olhoGato = olhoGato;
	}
	
	private double banhoGato;
	@Override
	public double banhoAnimal() {
		// TODO Auto-generated method stub
		banhoGato = super.banhoAnimal();
		return banhoGato = 150;
	}
	
	private double consultaGato;
	@Override
	public double consultaAnimal() {
		// TODO Auto-generated method stub
		consultaGato = super.consultaAnimal();
		return consultaGato = 200;
	}
	
	public String getOlhoGato() {
		return olhoGato;
	}
	public void setOlhoGato(String olhoGato) {
		this.olhoGato = olhoGato;
	}	
}
