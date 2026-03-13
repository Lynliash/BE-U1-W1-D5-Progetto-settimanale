import entities.Audio;
import entities.Immagine;

public class Main {
    static void main(String[] args) {

        Audio audio1 = new Audio("Canzone", 6, 3);
//        System.out.println("il titolo dell'audio è " + audio1.getTitolo());
//        System.out.println("la sua durata è di " + audio1.getDurata() + " min");
//        System.out.println("il volume dell'audio è " + audio1.getVolume());
//        audio1.play();


        Immagine image1 = new Immagine("Foto di Ugo", 5);
        image1.show();
//        System.out.println("il titolo della tua immagine è: " + image1.getTitolo());
//        System.out.println("la luminosità della tua immagine è: " + image1.getLuminosita());
//
//        Video video1 = new Video("Compleanno Michele", 10, 8, 9);
//        System.out.println("il titolo del tuo video è: " + video1.getTitolo());
//        System.out.println("la durata del tuo video è: " + video1.getDurata());
//        System.out.println("il volume del tuo video è: " + video1.getVolume());
//        System.out.println("la luminosità del tuo video è: " + video1.getLuminosita());

    }

}
