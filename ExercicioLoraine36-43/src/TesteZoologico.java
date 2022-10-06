import java.util.Scanner;

public class TesteZoologico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("****ZOOLóGICO****");
		
		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo Dromedário");
		camelo.setComprimento(2.30);
		camelo.setNumPatas("4");
		camelo.setCor("Caramelo");
		camelo.setAmbiente("Terrestre");
		camelo.setVelocidade("Lento");
		camelo.setAlimento("Folhagens");
		

		System.out.println(camelo);
		
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão-branco");
		tubarao.setComprimento(4.60);
		tubarao.setNumPatas("0");
		tubarao.setCor("Cinza");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidade("56 km/h");
		tubarao.setCaracteristica("Possui barbatanas e caudas");
		
	
		System.out.println(tubarao);
		
		
		Mamifero UrsoDoCanada = new Mamifero();
		UrsoDoCanada.setNome("Urso-do-Canadá");
		UrsoDoCanada.setComprimento(2.10);
		UrsoDoCanada.setNumPatas("4");
		UrsoDoCanada.setCor("Caramelo");
		UrsoDoCanada.setAmbiente("Florestas");
		UrsoDoCanada.setVelocidade("5 km/h");
		UrsoDoCanada.setAlimento("Mel");
		
		
		System.out.println(UrsoDoCanada);
		
		
		scanner.close();
	}
	

}
