
package lab02;

import java.util.Scanner;


public class TesteTimes {
    
     public static void imprimeClubeEstadio(Estadio e) {
        for (int i = 0; i < e.getQuantideClubes(); i++) {
            System.out.println("Clube: " + e.getClubes()[i].getNomeDoClube());

        }
    }
     

   
    public static void main(String args[]) {
        Clube time1 = new Clube();
        Clube time2 = new Clube();
        Clube time3 = new Clube();
        Clube time4 = new Clube();

        time1.setNomeDoClube("Flamengo");
        time2.setNomeDoClube("Fluminense");
        time3.setNomeDoClube("Sao Paulo");
        time4.setNomeDoClube("Palmeiras");

        Estadio e1 = new Estadio();
        Estadio e2 = new Estadio();
        
        
        
        
        
        e1.setNomeDoEstadio("Maracana");
        e1.setCidadeDoEstadio("Rio de Janeiro");
        e1.setClubes(time1);
        e1.setClubes(time2);
        
        
        e1.setCidadeDoEstadio("Rio de Janeiro");
        e2.setCidadeDoEstadio("São Paulo");
        
        e2.setNomeDoEstadio("Morumbi");
        e2.setClubes(time3);
        e2.setClubes(time4);
        

        System.out.println("Estadio: " + e1.getNomeDoEstadio());
        System.out.println("Cidade do Primeiro Estadio: " + e1.getCidadeDoEstadio());
        imprimeClubeEstadio(e1);

        System.out.println( "\nEstadio: " + e2.getNomeDoEstadio());
        System.out.println("Cidade do Segundo Estadio: " + e2.getCidadeDoEstadio());
        imprimeClubeEstadio(e2);
        
        
       
        
        
    }
}
