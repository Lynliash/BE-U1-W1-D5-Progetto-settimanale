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


    @Override
    public void esegui() {
        show();
    }

    public void show() {
        System.out.println(getTitolo() + "*".repeat(luminosita));
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
}
