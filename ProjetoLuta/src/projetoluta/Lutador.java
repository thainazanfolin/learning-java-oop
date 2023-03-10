
package projetoluta;

public class Lutador {
    
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    
    //construtor com parametros

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);     // na hora de instanciar já vai setar o peso e entrar na categoria correta
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    // metodos publicos
    
    public void apresentar(){
        System.out.println("Vamos conhecer o lutador!");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void status(){
        System.out.println(this.getNome() + " é um Peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    // metodos especiais

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {        // set categoria vai ter logica para setar o tipo de categoria de acordo com o peso -> metodo interno, muda de cordo com o setPeso
       if (this.peso < 52.2){
           this.categoria = "Inválido";
       } else if (this.peso <= 70.3){
           this.categoria = "Leve";
       } else if (this.peso <= 83.9){
           this.categoria = "Médio";
       } else if (this.peso <=120.2){
           this.categoria = "Pesado";
       } else {
           this.categoria = "Inválido";
       }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
