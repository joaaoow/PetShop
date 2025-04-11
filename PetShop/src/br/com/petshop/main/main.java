package br.com.petshop.main;
import br.com.petshop.animais.Cachorro;
import br.com.petshop.animais.Gato;
public class main {
	public static void main(String[] args) {
		Cachorro objCachorro = new Cachorro("Billy", "Loiro", "João", 996852109, 10, "Viralata");
		System.out.println("---PETSHOP---");
		System.out.println("Cachorro: ");
		objCachorro.setNomeAnimal("Billy");
		System.out.println("Nome cachorro: " + objCachorro.getNomeAnimal());
		objCachorro.setNomeDono("João");
		System.out.println("Nome do dono: " + objCachorro.getNomeDono());
		objCachorro.setNmrDono(996852109);
		System.out.println("Número do dono: " + objCachorro.getNmrDono());
		objCachorro.setCorAnimal("Loiro");
		System.out.println("Cor do cachorro: " + objCachorro.getCorAnimal());
		objCachorro.setPesoAnimal(10);
		System.out.println("Peso Cachorro: " + objCachorro.getPesoAnimal());
		
		Gato objGato = new Gato("Blunt", "Marrom", "Guilherme", 999555551, 8, "Dourado");
		System.out.println("\nGato: ");
		objGato.setNomeAnimal("Blunt");
		System.out.println("Nome gato: " + objGato.getNomeAnimal());
		objGato.setNomeDono("Guilherme");
		System.out.println("Nome do dono: " + objGato.getNomeDono());
		objGato.setNmrDono(999555551);
		System.out.println("Número do dono: " + objCachorro.getNmrDono());
		objGato.setCorAnimal("Marrom");
		System.out.println("Cor do gato: " + objGato.getCorAnimal());
		objGato.setPesoAnimal(8);
		System.out.println("Peso Gato: " + objGato.getPesoAnimal());
		objGato.setOlhoGato("Dourado");
		System.out.println("Cor do olho do gato: " + objGato.getOlhoGato());
		
		
	}
}
