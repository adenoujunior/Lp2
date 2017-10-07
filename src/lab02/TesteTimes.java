
package lab02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class TesteTimes {
    
     public static void imprimeClubeEstadio(Estadio e) {
        for (int i = 0; i < e.getQuantideClubes(); i++) {
            System.out.println("Clube: " + e.getClubes()[i].getNomeDoClube());

        }
    }
     
   
     

   
    public static void main(String args[]) {
        //prtimeira partida
        System.out.println("Criar Partida");
        
        
        Date dataAtual = new Date();
        SimpleDateFormat dataBrasil = new SimpleDateFormat("dd/MM/yyyy  E");
        SimpleDateFormat horaBrasil = new SimpleDateFormat("HH:mm:ss");
       
        
        ComissaoTecnica ct1 = new ComissaoTecnica(); 
        Partida ab1 = new Partida();
        Arbitro nomeDosArbitros = new Arbitro();
        
        Clube time1 = new Clube();
        Clube time2 = new Clube();
        
        time1.setNomeDoClubeMandante();
        time2.setNomeDoClubeVisitante();
        
        Estadio e1 = new Estadio();
        
        e1.setNomeDoEstadio();
        e1.setCidadeDoEstadio();
        e1.setEstadoDoEstadio();
        
        ab1.setQuantidadeArbitro(3);
        //nomeDosArbitros.setNomeDoArbitro();
        
        e1.setClubes(time1);
        e1.setClubes(time2);

       //segunda partida 
       System.out.println("\nCriar Segunda Partida");
       
        Clube time3 = new Clube();
        Clube time4 = new Clube();
        
        time3.setNomeDoClubeMandante();
        time4.setNomeDoClubeVisitante();
        
        Estadio e2 = new Estadio();
        
        e2.setNomeDoEstadio();
        e2.setEstadoDoEstadio();
        e2.setCidadeDoEstadio();
        e2.setClubes(time3);
        e2.setClubes(time4);


        

        //resultados da primeira partida
        System.out.println("\nPartida Criada");
        System.out.println("Número de Juizes: " + ab1.getQuantidadeArbitro());
        nomeDosArbitros.setNomeDoArbitro();
        System.out.println("Estadio: "+ e1.getNomeDoEstadio());
        System.out.println("Cidade: " + e1.getCidadeDoEstadio());
        System.out.println("Estado: " + e1.getEstadoDoEstadio());
        System.out.println("\nMandante: " + time1.getNomeDoClube());
        System.out.println("Comissão Técnica:");
        ct1.setFuncao();
        System.out.println("Visitante: " + time2.getNomeDoClubeVisitante());
        System.out.println("Comissão Técnica:");
        ct1.setFuncao();
        System.out.println("Data do jogo: " + dataBrasil.format(dataAtual));
        System.out.println("Hora do jogo: " + horaBrasil.format(dataAtual));
        
        
        //resultados da segunda partida
        System.out.println("\nSegunda Partida Criada");
        System.out.println("Número de Juizes: " + ab1.getQuantidadeArbitro());
        nomeDosArbitros.setNomeDoArbitro();
        System.out.println("Estadio: "+ e2.getNomeDoEstadio());
        System.out.println("Cidade: " + e2.getCidadeDoEstadio());
        System.out.println("Estado: " + e2.getEstadoDoEstadio());
        System.out.println("\nMandante: " + time3.getNomeDoClube());
        System.out.println("Comissão Técnica:");
        ct1.setFuncao();
        System.out.println("\nVisitante: " + time4.getNomeDoClubeVisitante());
        System.out.println("Comissão Técnica:");
        ct1.setFuncao();
        System.out.println("Data do jogo: " + dataBrasil.format(dataAtual));
        System.out.println("Hora do jogo: " + horaBrasil.format(dataAtual));
       
        
        
    }
}
