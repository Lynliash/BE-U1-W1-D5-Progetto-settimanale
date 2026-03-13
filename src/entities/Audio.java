package entities;

public class Audio extends ElementoMultimediale implements Riproducibile {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {

        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "!".repeat(volume));
        }

    }

    @Override
    public int getDurata() {
        return durata;
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
