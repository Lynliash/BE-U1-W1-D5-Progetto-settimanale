package entities;

public class Audio extends ElementoRiproducibile {

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void play() {
        StringBuilder pEsclamativi = new StringBuilder();
        for (int i = 0; i < getVolume(); i++) {
//RICORDA DI FARE IL CICLO
            pEsclamativi.append("!");

        }

        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + pEsclamativi);
        }

    }
}
