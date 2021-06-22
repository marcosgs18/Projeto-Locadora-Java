import java.io.FileReader;
import java.util.ArrayList;

import trabalhoFinal.Filme;

public class Locadora {
	Filme acervo[];
	Cliente clientes[];
	int maxCliente = 0;
	int maxFilme = 0;

	public Locadora(int tamVet) {
		acervo = new Filme[tamVet];
		clientes = new Cliente[tamVet];
	}

	public void incluirCliente(Cliente cliente) {
		if (maxCliente < clientes.length) {
			cliente.adicionarCliente();
			clientes[maxCliente] = cliente;
			maxCliente++;
		} else {
			System.out.println("Tamanho máximo do vetor foi atingido!\nNão foi possível cadastrar o cliente!");
		}
	}

	public void incluirFilmes(Filme filme) {
		if (maxFilme < acervo.length) {
			filme.inicializaFilme();
			acervo[maxFilme] = filme;
			maxFilme++;
		} else {
			System.out.println("Tamanho máximo do vetor foi atingido!\nNão foi possível armazenar o filme!");
		}
	}

}
