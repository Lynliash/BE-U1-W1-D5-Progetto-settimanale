package entities;

public class Video extends ElementoRiproducibile implements Luminosita {

    private int luminosita;

//    costruttore

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    //    getter
    public int getLuminosita() {
        return luminosita;
    }


//    metodi

    @Override
    public void play() {

    }

    @Override
    public void aumentaLuminosita() {
        if (luminosita > 0 && luminosita < 10)
            luminosita++;
        else System.out.println("la luminosita è al massimo");
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0)
            luminosita--;
        else System.out.println("la luminosita è al minimo");

    }
}
