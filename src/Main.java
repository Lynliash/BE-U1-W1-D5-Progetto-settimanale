import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        creo array da far riempre all'utente

        ElementoMultimediale[] arrayDiMultimedia = new ElementoMultimediale[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("\n Elemento " + (i + 1) + " di: 5");
            System.out.println("Inserisci il tipo che vuoi creare");
            System.out.println("1: Audio");
            System.out.println("2: Video");
            System.out.println("3: Immagine");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

//            FIX NON LO TOGLIERE PIU
            scanner.nextLine(); // consuma il new line rimasto o una roba del genere

            System.out.print("Scegli il titolo del tuo elemento: ");
            String title = scanner.nextLine();


//            switch che permettere di scegliere l'elemento e chiede gli altri parametri e
//            salva l'elemento nell'arrayDiMultimedia

            switch (scelta) {
                case 1:
                    System.out.print("Scegli il volume tra 0 e 10: ");
                    int volumeAudio = scanner.nextInt();
                    System.out.print("Scegli la durata tra 0 e 10: ");
                    int durataAudio = scanner.nextInt();
                    arrayDiMultimedia[i] = new Audio(title, volumeAudio, durataAudio);
                    break;
                case 2:
                    System.out.print("Scegli la durata del tuo video con valori tra 0 e 10: ");
                    int durataVideo = scanner.nextInt();
                    System.out.print("Scegli il volume del tuo video con valori tra 0 e 10: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.print("Scegli la luminosità del tuo video con valori tra 0 e 10: ");
                    int luminositaVideo = scanner.nextInt();
                    arrayDiMultimedia[i] = new Video(title, volumeVideo, durataVideo, luminositaVideo);
                    break;
                case 3:
                    System.out.print("Scegli la luminosità della tua immagine con valori tra 0 e 10: ");
                    int luminositaImmagine = scanner.nextInt();
                    arrayDiMultimedia[i] = new Immagine(title, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo non valido, creo un immagine di default");
                    arrayDiMultimedia[i] = new Immagine("Default" + i, 2);
                    break;
            }

        }


//        mostra gli elementi salvati e scelta dell'elemento da eseguire

        int scelta = -1;


        while (scelta != 0) {
            System.out.println("Quale elemento vuoi eseguire? Digita uno degli elementi con valori tra 1 e 5 oppure 0 per uscire");
            for (int i = 0; i < arrayDiMultimedia.length; i++) {
                System.out.println((i + 1) + "- " + arrayDiMultimedia[i].getTitolo());
            }
            System.out.println("Scelta: ");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                arrayDiMultimedia[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida");
            }

        }


//        Audio audio1 = new Audio("Canzone", 6, 3);
////        System.out.println("il titolo dell'audio è " + audio1.getTitolo());
////        System.out.println("la sua durata è di " + audio1.getDurata() + " min");
////        System.out.println("il volume dell'audio è " + audio1.getVolume());
////        audio1.play();
//
//
//        Immagine image1 = new Immagine("Foto di Ugo", 5);
////        image1.show();
////        System.out.println("il titolo della tua immagine è: " + image1.getTitolo());
////        System.out.println("la luminosità della tua immagine è: " + image1.getLuminosita());
////
//        Video video1 = new Video("Compleanno Michele", 5, 3, 1);
//        video1.play();
////        System.out.println("il titolo del tuo video è: " + video1.getTitolo());
////        System.out.println("la durata del tuo video è: " + video1.getDurata());
////        System.out.println("il volume del tuo video è: " + video1.getVolume());
////        System.out.println("la luminosità del tuo video è: " + video1.getLuminosita());

    }

}
