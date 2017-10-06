
package lab02;


public class TesteTimes {
    
     public static void imprimeClubeEstadio(Estadio e) {
        for (int i = 0; i < e.getQuantideClubes(); i++) {
            System.out.println("Clube: " + e.getClubes()[i].getNome());

        }
    }

   
    public static void main(String args[]) {
        Clube time1 = new Clube();
        Clube time2 = new Clube();
        Clube time3 = new Clube();

        time1.setNome("Flamengo");
        time2.setNome("Fluminense");
        time3.setNome("Sao Paulo");

        Estadio e1 = new Estadio();
        Estadio e2 = new Estadio();

        e1.setNome("Maracana");
        e1.setClubes(time1);
        e1.setClubes(time2);
        e2.setNome("Morumbi");
        e2.setClubes(time3);

        System.out.println("Estadio: " + e1.getNome());
        imprimeClubeEstadio(e1);

        System.out.println("Estadio: " + e2.getNome());
        imprimeClubeEstadio(e2);
    }
}
