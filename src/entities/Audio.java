package entities;

public class Audio extends ElementoRiproducibile {

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void play() {
        for (int i = 0; i <= getDurata(); i++) {
//RICORDA DI FARE IL CICLO
        }
    }
}
