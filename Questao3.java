// Documentação: Classe base (superclasse) Pessoa
class Pessoa {
    // Atributo comum que será herdado
    private String nome;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com parâmetro
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}

// Documentação: Classe Aluno herda de Pessoa (extends)
class Aluno extends Pessoa {
    // Atributo específico da classe Aluno
    private String curso;

    // Construtor padrão
    public Aluno() {
    }
 
    // Construtor com parâmetros
    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    // Getter para curso
    public String getCurso() {
        return curso;
    }

    // Setter para curso
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso;
    }
}

// Documentação: Classe Professor (também herda de Pessoa)
// Embora a Q3 não peça explicitamente, a Q4 (Polimorfismo)
// exige que Professor também herde de Pessoa.
class Professor extends Pessoa {
    // Atributo específico da classe Professor
    private String disciplina;

    // Construtor padrão
    public Professor() {
    }

    // Construtor com parâmetros
    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    // Getter para disciplina
    public String getDisciplina() {
        return disciplina;
    }

    // Setter para disciplina
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nDisciplina: " + disciplina;
    }
}

// Classe principal para testar a Questão 3
public class Questao3 {
    public static void main(String[] args) {

        // 1. Criar objeto Aluno com seus dados usando construtor
        Aluno meuAluno = new Aluno("Debora Basilio Ferreira", "Analise e Desenvolvimento de Sistemas");

        // 2. Criar objeto Professor com dados fictícios usando construtor
        Professor meuProfessor = new Professor("Dr. Silva", "Programação Orientada a Objetos");

        // 3. Exibir todos os atributos de ambos usando toString
        System.out.println("--- Dados do Aluno ---");
        System.out.println(meuAluno.toString());

        System.out.println("\n--- Dados do Professor ---");
        System.out.println(meuProfessor.toString());
    }
}
