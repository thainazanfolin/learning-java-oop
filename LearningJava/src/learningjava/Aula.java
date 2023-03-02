
package learningjava;

public class Aula {
    
    public String nome;
    public String nomeDoProfesor;
    private int duracao;
    private int semestre;
    
    public Aula(String nome, String nomeDoProfessor, int duracao, int semestre){
        this.nome = nome;
        this.nomeDoProfesor = nomeDoProfessor;
        this.duracao = duracao;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDoProfesor() {
        return nomeDoProfesor;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeDoProfesor(String nomeDoProfesor) {
        this.nomeDoProfesor = nomeDoProfesor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}

    
            
