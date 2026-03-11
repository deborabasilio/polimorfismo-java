// Documentação: Interface define o "contrato" Avaliado
// Toda classe que implementar esta interface DEVE ter o método avaliarDesempenho()
interface Avaliado {
    // Método abstrato
    String avaliarDesempenho();
}

// --- Classes das questões anteriores (necessárias para o contexto) ---

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String apresentar() {
        return "Olá, meu nome é " + this.nome + ".";
    }
}

// Documentação: Classe Aluno agora implementa a interface Avaliado
class Aluno extends Pessoa implements Avaliado {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public String apresentar() {
        return "Olá! Eu sou a aluna " + this.getNome() + " do curso " + this.curso + ".";
    }

    // Implementação obrigatória do método da interface Avaliado
    @Override
    public String avaliarDesempenho() {
        // Retornando a mensagem personalizada com seu nome
        return "Aluno " + this.getNome() + " obteve ótimo desempenho!";
    }
}

// Classe principal para testar a Questão 5
public class Questao5 {
    public static void main(String[] args) {
        
        // 1. Criar objeto Aluno com seus dados
        Aluno meuAluno = new Aluno("Debora Basilio Ferreira", "Analise e Desenvolvimento de Sistemas");

        // 2. Invocar o método da interface
        System.out.println(meuAluno.avaliarDesempenho());

        // 3. Testar o método apresentar
        System.out.println(meuAluno.apresentar());
    }
}