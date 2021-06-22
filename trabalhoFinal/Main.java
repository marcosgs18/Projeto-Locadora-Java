import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locadora locadora = new Locadora(3);
		Filme filme = new Filme();
		Cliente cliente = new Cliente();
		int opcao;

		while ((opcao = Menu.menu()) != 0) {

			switch (opcao) {
			case 1:
				locadora.incluirCliente(cliente);
				cliente.salvar();
				break;
			case 2:
				System.out.println();
				cliente.consultaListaC();
				System.out.println();
				break;
			case 3:
				locadora.incluirFilmes(filme);
				filme.salvarFilme();
				break;
			case 4:
				System.out.println();
				filme.consultaListaF();
				System.out.println();
				break;
			case 5:
				
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida!");
			}

		}
		scan.close();
	}

}
