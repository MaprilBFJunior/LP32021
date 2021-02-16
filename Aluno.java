

public class Aluno{
	
    private String nome, matricula, curso;

    //Construtores
    public Aluno(){
        this.nome = "Nenhum";
        this.matricula = "0000";
        this.curso = "Nenhum";
    }

    public Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Métodos para nome
	public void dizNome() {
		System.out.printf("Nome: " + this.nome);
	}
	public String pegaNome() {
		return this.nome;
	}
	public void dáNome(String nome) {
		this.nome = nome;
	}

    //Métodos para matrícula
	public void dizMatricula() {
		System.out.printf("Matrícula: " + this.matricula);
	}
	public String pegaMatricula() {
		return this.matricula;
	}
	public void dáCpf(String matricula) {
		this.matricula = matricula;
	}

    //Métodos para curso
	public void dizCurso() {
		System.out.printf("Curso: " + this.curso);
	}
	public String pegaCurso() {
		return this.curso;
	}
	public void dáCurso(String curso) {
		this.curso = curso;
	}


}
