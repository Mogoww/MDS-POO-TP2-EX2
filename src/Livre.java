public class Livre extends Document {

    private String auteur;
    private int nbPages;

    public Livre(int numEnregistrement, String titre, String auteur, int nbPages) {
        super(numEnregistrement, titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public Livre() {
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public String toString() {
        return "Livre [auteur=" + auteur + ", nbPages=" + nbPages + "]";
    }
}
