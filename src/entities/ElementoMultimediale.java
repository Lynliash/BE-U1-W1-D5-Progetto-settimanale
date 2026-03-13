package entities;

public abstract class ElementoMultimediale {
    private String titolo;

    //    costruttore
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }


//    getter

    public String getTitolo() {
        return titolo;
    }

//    setter

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public abstract void esegui();

//    metodi


}
