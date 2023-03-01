
package learningjava;


public class Treinar {
    
    /* atributos */ 
   String nome;
   String modalidade;
   int tempoDeDuracao;
   int caloriasGastas;
   int frequenciaPorSemana;

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public int getCaloriasGastas() {
        return caloriasGastas;
    }

    public int getFrequenciaPorSemana() {
        return frequenciaPorSemana;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public void setTempoDeDuracao(int tempoDeDuração) {
        this.tempoDeDuracao = tempoDeDuração;
    }

    public void setCaloriasGastas(int caloriasGastas) {
        this.caloriasGastas = caloriasGastas;
    }

    public void setFrequenciaPorSemana(int frequenciaPorSemana) {
        this.frequenciaPorSemana = frequenciaPorSemana;
    }
   
    public void status(){
        System.out.println("O treino de hoje é:");
        System.out.println(nome);
        System.out.println(modalidade);
        System.out.println(tempoDeDuracao);        
    }
        
}
