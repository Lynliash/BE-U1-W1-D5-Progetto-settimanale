package entities;

public class Immagine extends ElementoMultimediale {

    private int luminosita;


    //    costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

//    getter

    public int getLuminosita() {
        return luminosita;
    }

//    setter


//    metodi

    public void show() {
    }

}
