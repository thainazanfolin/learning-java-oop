
package learningjava;

public class Celular {
    
    // definir privacidade
    public String marca; 
    public String modelo;
    private int memoria;
    private boolean memoriaCheia; 
    private int bateria;
    private boolean bateriaCheia;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public boolean isMemoriaCheia() {
        return memoriaCheia;
    }

    public int getBateria() {
        return bateria;
    }

    public boolean isBateriaCheia() {
        return bateriaCheia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setMemoriaCheia(boolean memoriaCheia) {
        this.memoriaCheia = memoriaCheia;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void setBateriaCheia(boolean bateriaCheia) {
        this.bateriaCheia = bateriaCheia;
    }
    
   
   
    void carregar(){
        if (this.bateriaCheia == true){
            System.out.println("Já está carregado");
        } else {
            this.bateriaCheia = true;
            System.out.println("Carregando...");
            System.out.println("Carregado!");
        }
     }
        
        //logica inversa
        void limparMemoria(){
            if (this.memoriaCheia == true){
                System.out.println("Sua memória está cheia...");
                System.out.println("Limpando a memória....");
                this.memoriaCheia = false;
                System.out.println("Memória limpa!");
            } else {
                System.out.println("Sua memória não está cheia");
            }
         }
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Memória: " + this.memoria);
    }
    
    }

