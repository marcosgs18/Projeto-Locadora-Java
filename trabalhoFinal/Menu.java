import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	
	static int menu(){
		System.out.println("-------------- MENU --------------");
		System.out.println("1 - Incluir clientes ");
		System.out.println("2 - Consultar lista de clientes ");
		System.out.println("3 - Incluir filmes ");
		System.out.println("4 - Consultar lista de filmes atualizada ");
		System.out.println("5 - Consultar lista de filmes locados ");
		System.out.println("0 - Sair");
		System.out.println("Escolha a opção: ");
		return Integer.parseInt(scan.nextLine());
	}
}
