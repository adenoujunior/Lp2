
package lab02;


public class Clube {
    private String cidade;
    private String nomeDoClube;
    private String estado;
    
    
    
     private Funcionario funcionario[]= new Funcionario[50];
    private int quantidadeFuncionario=0;
    
    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario[this.quantidadeFuncionario] = funcionario;
        this.quantidadeFuncionario++;
    }

    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeDoClube() {
        return nomeDoClube;
    }

    public void setNomeDoClube(String nomeDoClube) {
        this.nomeDoClube = nomeDoClube;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
