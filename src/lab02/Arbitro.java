
package lab02;


public class Arbitro {
    
    private String nomeDoArbitro;
    private String funcaoDoArbitro;

    
    public void setNomeDoArbitro(){
        System.out.println("Juiz: José Carlos");
        System.out.println("Primeiro Auxiliar: Arthur Nascimento");
        System.out.println("Segundo Auxiliar: Pedro Ricardo");
    }
    
    
    /*Parte do gerador automatico*/
    public String getNomeDoArbitro() {
        return nomeDoArbitro;
    }

    public void setNomeDoArbitro(String nomeDoArbitro) {
        this.nomeDoArbitro = nomeDoArbitro;
    }

    public String getFuncaoDoArbitro() {
        return funcaoDoArbitro;
    }

    public void setFuncao(String funcaoDoArbitro) {
        this.funcaoDoArbitro = funcaoDoArbitro;
    }
}
