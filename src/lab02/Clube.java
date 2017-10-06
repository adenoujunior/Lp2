
package lab02;


public class Clube {
    private String cidade;
    private String nomeDoClube;
    private String estado;
    
    
    
     private Funcionario funcionario[]= new Funcionario[50];
    int quantidadeFuncionario=0;
    
    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario[this.quantidadeFuncionario] = funcionario;
        this.quantidadeFuncionario++;
    }
    
}
