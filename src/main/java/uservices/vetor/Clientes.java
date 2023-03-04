
package uservices.vetor;

public class Clientes {
    
    public String nome;
    public String telefone;

    public Clientes(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Clientes() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " : " + telefone;
    }
    
    
}
