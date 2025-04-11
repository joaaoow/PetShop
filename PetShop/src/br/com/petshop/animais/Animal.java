package br.com.petshop.animais;

public class Animal {
	private String corAnimal;
	private String nomeDono;
	private double nmrDono;
	private double pesoAnimal;
	private String nomeAnimal;
	public Animal(String nomeAnimal, String corAnimal, String nomeDono, double nmrDono, double pesoAnimal) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.corAnimal = corAnimal;
		this.nomeDono = nomeDono;
		this.nmrDono = nmrDono;
		this.pesoAnimal = pesoAnimal;
	}
	
	private double precoBanho;
	public double banhoAnimal() {
		return precoBanho = 50;
	}
	private double precoTosa;
	public double tosaAnimal() {
		return precoTosa = 50;
	}
	
	private double precoConsulta;
	public double consultaAnimal() {
		return precoConsulta = 150;
	}
	
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	
	public String getCorAnimal() {
		return corAnimal;
	}
	
	public void setCorAnimal(String corAnimal) {
		this.corAnimal = corAnimal;
	}
	
	public String getNomeDono() {
		return nomeDono;
	}
	
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	public double getNmrDono() {
		return nmrDono;
	}
	
	public void setNmrDono(double nmrDono) {
		this.nmrDono = nmrDono;
	}
	
	public double getPesoAnimal() {
		return pesoAnimal;
	}
	
	public void setPesoAnimal(double pesoAnimal) {
		this.pesoAnimal = pesoAnimal;
	}
	

}
