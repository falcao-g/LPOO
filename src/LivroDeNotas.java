/**
 * Classe usada para gerenciar as notas dos alunos inscritos em uma disciplina.
 */
public class LivroDeNotas {
    /**
     * Método construtor da classe "LivroDeNotas".
     * 
     * O construtor recebe quatro parâmetros: o nome da disciplina, o nome do
     * professor responsável pela disciplina,
     * a quantidade de vagas ofertadas pela disciplina e a média de aprovação que a
     * disciplina deve usar para
     * informar se toda a turma está aprovada ou não.
     * 
     * @param nomeDaDisciplina  Nome da disciplina ofertada.
     * @param nomeDoProfessor   Nome do professor responsável pela disciplina.
     * @param quantidadeDeVagas Quantidade de vagas ofertadas pela disciplina.
     * @param mediaAprovacao    Nota usada para verificar se toda a turma foi
     *                          aprovada ou reprovada.
     */
    private String nomeDaDisciplina;
    private String nomeDoProfessor;
    private int quantidadeDeVagas;
    private float mediaAprovacao;
    private String[] nomesAlunos;
    private float[] notasAlunos;
    private int quantidadeDeAlunos = 0;

    public LivroDeNotas(String nomeDaDisciplina, String nomeDoProfessor, int quantidadeDeVagas, float mediaAprovacao) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.nomeDoProfessor = nomeDoProfessor;
        this.quantidadeDeVagas = quantidadeDeVagas;
        this.mediaAprovacao = mediaAprovacao;
        this.nomesAlunos = new String[quantidadeDeVagas];
        this.notasAlunos = new float[quantidadeDeVagas];
    }

    /**
     * Método getter para retorno do nome da disciplina.
     * 
     * @return Retorna uma string contendo o nome da disciplina.
     */
    public String getNomeDisciplina() {
        return nomeDaDisciplina;
    }

    /**
     * Método setter para atribuir o nome da disciplina.
     * 
     * @param nomeDaDisciplina String contendo o nome da disciplina.
     */
    public void setNomeDisciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    /**
     * Método getter para retornar o nome do professor responsável pela disciplina.
     * 
     * @return Retorna uma string contendo o nome do professor responsável pela
     *         disciplina.
     */
    public String getNomeProfessor() {
        return nomeDoProfessor;
    }

    /**
     * Método setter para atribuir o nome do professor responsável pela disciplina.
     * 
     * @param nome Nome do professor responsável pela disciplina.
     */
    public void setNomeProfessor(String nome) {
        this.nomeDoProfessor = nome;
    }

    /**
     * Método getter para retornar quantidade de vagas ofertadas pela disciplina.
     * 
     * @return Retorna um número inteiro que informa a quantidade de vagas ofertadas
     *         pela disciplina.
     */
    public int getQuantidadeDeVagas() {
        return quantidadeDeVagas;
    }

    /**
     * Método setter para definir quantidade de vagas ofertadas pela disciplina.
     * 
     * @param quantidadeDeVagas Número de vagas ofertadas pela disciplina.
     */
    public void setQuantidadeDeVagas(int quantidadeDeVagas) {
        this.quantidadeDeVagas = quantidadeDeVagas;
    }

    /**
     * Método setter para definir a média de aprovação da disciplina.
     * 
     * @param mediaAprovacao Média de aprovação da disciplina.
     */
    public void setMediaAprovacao(float mediaAprovacao) {
        this.mediaAprovacao = mediaAprovacao;
    }

    /**
     * Método getter para retornar a média de aprovação da disciplina.
     * 
     * @return Um número float que informa a média de aprovação da disciplina.
     */
    public float getMediaAprovacao() {
        return mediaAprovacao;
    }

    /**
     * Registra um aluno na disciplina com a respectiva nota.
     * 
     * @param nomeDoAluno String contendo o nome do aluno.
     * @param notaDoAluno Número de ponto-flutuante da nota do aluno.
     */
    public void registraAlunoComNota(String nomeDoAluno, float notaDoAluno) {
        for (int i = 0; i < quantidadeDeVagas; i++) {
            if (nomesAlunos[i] == null) {
                nomesAlunos[i] = nomeDoAluno;
                notasAlunos[i] = notaDoAluno;
                break;
            }
        }
        this.quantidadeDeAlunos++;
    }

    /**
     * Calcula e retorna a média aritmética de todas as notas dos alunos incluidos
     * na disciplina.
     * 
     * @return Retorna a média aritmética de todas as notas da disciplina.
     */
    public float recuperarMediaTurma() {
        if (quantidadeDeAlunos == 0) {
            return 0;
        } else {
            float soma = 0;
            for (int i = 0; i < quantidadeDeAlunos; i++) {
                soma += notasAlunos[i];
            }
            return soma / quantidadeDeAlunos;
        }
    }

    /**
     * Retorna verdadeiro caso a média de notas da turma for maior que a média de
     * aprovação da disciplina.
     * 
     * @return Retorna se a turma inteira está aprovada ou não na disciplina.
     */
    public boolean turmaAprovada() {
        return recuperarMediaTurma() > mediaAprovacao;
    }
}