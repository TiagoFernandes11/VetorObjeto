
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
    
    public void adicionaElementoInicio(t elemento){
        this.aumentaCapacidade();
        t[] elementosNovos = (t[]) new Object[this.tamanho + 1];
        elementosNovos[0] = elemento;
        for(int i = 1; i < elementosNovos.length; i++){
            elementosNovos[i] = this.elementos[i-1];
        }
        this.setElementos(elementosNovos);
    }
    
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            t[] vetorTemporario = (t[]) new Object[this.elementos.length * 2];
            for(int i =0; i < this.tamanho; i++){
                vetorTemporario[i] = this.elementos[i];
            }
            this.elementos = vetorTemporario;
        }
    }
    
    public void remove(int posicao){
        if(posicao >= 0 && posicao<=this.elementos.length){
            for(int i = posicao; i < this.tamanho; i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;            
        }else{
            System.out.println("Posição inválida");
        }
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    public Object buscaObjeto(int posicao) throws Exception{
        if(posicao < 0 && posicao <= this.tamanho){
            return this.elementos[posicao];
        }
        throw new Exception("Posição Inválida");
    }
    
    public int buscaPosicao(Object objeto){
        for(int i =0; i < this.tamanho; i++){
            if(this.elementos[i].equals(objeto)){
                return i;
            }
        }
        return -1;
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
    
    
    public void setElementos(t[] elementos) {
        this.elementos = elementos;
    }
    
   
    
}
