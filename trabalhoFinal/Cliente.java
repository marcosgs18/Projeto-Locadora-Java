import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cliente {
	private String nome;
	private char sexo;
	private long cpf;
	private String endereco;

	public Cliente() {
	}

	public Cliente(String nome, char sexo, long cpf, String endereco) {

		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void adicionarCliente()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Nome: ");
		nome=scan.next();
		
		System.out.println("Sexo: ");
		sexo=scan.next().charAt(0);
		
		System.out.println("CPF: ");
		cpf=scan.nextLong();
		
		System.out.println("Endereço: ");
		endereco=scan.next();
	}
	
	public String salvar() {

		try {

			
			File file = new File("ListaDeClientes.txt");

			
			if (!file.exists()) {
				file.createNewFile();
			}

			
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);

			
			bw.write(this.nome + "\t" + this.sexo + "\t" + this.cpf + "\t" + this.endereco + "\n");
			bw.flush();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public void consultaListaC() {

		File file = new File("C:\\Users\\marco\\eclipse-workspace\\Prova\\ListaDeClientes.txt");
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
