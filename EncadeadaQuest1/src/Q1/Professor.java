package Q1;

public class Professor {

	private String nome;

	public Professor() {
		nome="Indefinido.";
	}

	public Professor(String nome) {
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + "]";
	}
	
	

}
