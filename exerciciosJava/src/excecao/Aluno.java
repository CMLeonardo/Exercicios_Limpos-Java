package excecao;

public class Aluno {

	public final String nome;
	public final double nota;
	public final boolean bomComportamento;
	
	public Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}
}
