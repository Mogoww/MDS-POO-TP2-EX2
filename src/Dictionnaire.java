public class Dictionnaire extends Document {

    private String langue;
    private int nbTomes;

    public Dictionnaire(int numEnregistrement, String titre, String langue, int nbTomes) {
        super(numEnregistrement, titre);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public int getNbTomes() {
        return nbTomes;
    }

    public void setNbTomes(int nbTomes) {
        this.nbTomes = nbTomes;
    }


    // toString
    public String toString() {
        return "Dictionnaire [langue=" + langue + ", nbTomes=" + nbTomes + "]";
    }
}
