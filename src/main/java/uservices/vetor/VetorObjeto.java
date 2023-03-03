
package uservices.vetor;

public class VetorObjeto<t> {
    
    private t[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {
        this.elementos = (t[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public VetorObjeto() {
        this(10);
    }
    
    public void adicionaElemento(t elemento){
       this.aumentaCapacidade();
       this.elementos[this.tamanho] = elemento;
       this.tamanho++;
    }
    
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            t[] vetorTemporario = (t[]) new Object[this.elementos.length + 1];
            for(int i =0; i < this.tamanho; i++){
                vetorTemporario[i] = this.elementos[i];
            }
            this.elementos = vetorTemporario;
        }
    }
    
     @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if(this.tamanho> 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
                
        return s.toString();
    }
    
    
    
   
    
}
