import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filme {

	private int codigo;
	private String titulo;
	private String genero;
	private int quantidade;
	private int qtdEmEstoque;

	public Filme() {

	}

	public Filme(int codigo, String titulo, String genero, int quantidade, int qtdEmEstoque) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.quantidade = quantidade;
		this.qtdEmEstoque = qtdEmEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQtdEmEstoque() {
		return qtdEmEstoque;
	}

	public void setQtdEmEstoque(int qtdEmEstoque) {
		this.qtdEmEstoque = qtdEmEstoque;
	}

	public void inicializaFilme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe codigo do filme: ");
		codigo = Integer.parseInt(scan.nextLine());

		System.out.println("Informe titulo do filme: ");
		titulo = scan.nextLine();

		System.out.println("Informe genero do filme: ");
		genero = scan.next();

	}

	public String salvarFilme() {

		try {

			
			File file = new File("ListaDeFilmes.txt");

			
			if (!file.exists()) {
				file.createNewFile();
			}

			
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);

			
			
			bw.write(this.codigo + "\t" + this.titulo + "\t" + this.genero + "\t" + this.quantidade + "\t"
					+ this.qtdEmEstoque + "\n");
			bw.flush();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public void consultaListaF() {

		File file = new File("C:\\Users\\marco\\eclipse-workspace\\Prova\\ListaDeFilmes.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
	
}
