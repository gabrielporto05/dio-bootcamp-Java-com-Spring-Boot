public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void subirCanal() {
        this.canal++;
    }

    public void descerCanal() {
        this.canal++;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

}
