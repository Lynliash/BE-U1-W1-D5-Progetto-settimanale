package entities;

public class Video extends ElementoMultimediale implements Riproducibile {

    private int luminosita;
    private int durata;
    private int volume;

//    costruttore

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
        this.durata = durata;
        this.volume = volume;
    }

    //    getter
    public int getLuminosita() {
        return luminosita;
    }

    public int getVolume() {
        return volume;
    }


    @Override
    public int getDurata() {
        return durata;
    }


//    metodi


    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {

        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "!".repeat(volume) + "*".repeat(luminosita));
        }

    }

    public void aumentaLuminosita() {
        if (luminosita > 0 && luminosita < 10)
            luminosita++;
        else System.out.println("la luminosita è al massimo");
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0)
            luminosita--;
        else System.out.println("la luminosita è al minimo");

    }

    public void alzaVolume() {
        if (volume > 0 && volume < 10)
            volume++;
        else System.out.println("il volume è al massimo");
    }

    public void abbassaVolume() {
        if (volume > 0)
            volume--;
        else System.out.println("il volume è al minimo");
    }


}
