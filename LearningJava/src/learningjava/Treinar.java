
package learningjava;


public class Treinar {
    
    /* atributos */ 
   public String nome;
   public String modalidade;
   private int tempoDeDuracao;
   private int caloriasGastas;
   private int frequenciaPorSemana;
   
   public Treinar(String nome, String modalidade, int tempoDeDuracao, int calorias, int frequencia){
       this.nome = nome;
       this. modalidade = modalidade;
       this.tempoDeDuracao = tempoDeDuracao;
       this.caloriasGastas = calorias;
       this.frequenciaPorSemana = frequencia;
   }

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
