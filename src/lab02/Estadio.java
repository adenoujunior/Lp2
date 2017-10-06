package lab02;


public class Estadio {
    int quantideTimes = 0;
    private Clube times[] = new Clube[4];

    public Clube[] getTimes() {
        return times;
    }

    public void setTimes(Clube time) {
        this.times[this.quantideTimes] = time;
        this.quantideTimes++;
    }
}
