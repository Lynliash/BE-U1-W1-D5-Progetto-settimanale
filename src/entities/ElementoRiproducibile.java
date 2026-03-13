package entities;

public abstract class ElementoRiproducibile extends ElementoMultimediale implements Volume {

    private int durata;
    private int volume;


//    costruttori

    public ElementoRiproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    //    getter
    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

//    metodi


    @Override
    public void alzaVolume() {
        if (volume > 0 && volume < 10)
            volume++;
        else System.out.println("il volume è al massimo");
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0)
            volume--;
        else System.out.println("il volume è al minimo");
    }

    public abstract void play();

}
