
package lab02;


public class ComissaoTecnica {
    private String funcao;

    
    public void setFuncao(){
      
        System.out.println("Técnico");
        System.out.println("Auxiliar Técnico");
        System.out.println("Preparadores Físicos");
        System.out.println("Médico");
        System.out.println("Massagistas");
        System.out.println("Supervisor\n");
        
    }
    
    
    
    /*Parte do gerador automatico*/
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
