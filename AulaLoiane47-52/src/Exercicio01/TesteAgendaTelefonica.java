package Exercicio01;

import java.util.Scanner;

public class TesteAgendaTelefonica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		
		Agenda agenda = new Agenda();

		int opcao = 1;

		while (opcao != 3) {
			opcao = opcaoMenu(leia);
			if (opcao == 1) {
				consultarContato(leia, agenda);

			} else if (opcao == 2) {
				adicionarContato(leia, agenda);

			}
		}

}

	public static void adicionarContato(Scanner leia, Agenda agenda) {
		try {
			System.out.println("Criando um contato, entre com as informações:");
			String nome = lerInformacaoString(leia, "Entre com o nome do contato:");
			String telefone = lerInformacaoString(leia, "Entre com o telefone do contato:");
			String email = lerInformacaoString(leia, "Entre com o e-mail do contato:");

			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);

			System.out.println("Contato a ser criado: ");
			System.out.println(contato);

			agenda.adicionarContato(contato);
			
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());

			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
	}

	public static void consultarContato(Scanner leia, Agenda agenda) {
		String nomeContato = lerInformacaoString(leia, "Entre com o nome do contato a ser pesquisado.");
		try {
			if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe" + agenda);
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String lerInformacaoString(Scanner leia, String msg) {
		System.out.println(msg);
		String entrada = leia.nextLine();
		return entrada;
	}

	public static int opcaoMenu(Scanner leia) {

		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida) {
			
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("[1] Consultar um contato da agenda");
			System.out.println("[2] Adicionar um contato da agenda");
			System.out.println("[3] Sair");

			try {

				String entrada = leia.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;

				} else {
					throw new Exception("Opção inválida.");
				}

			} catch (Exception e) {
				System.out.println("Opção inválida, tente novamente!!\n");
			}

		}
		return opcao;

	}

}
