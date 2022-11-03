public class Document {

    private int numEnregistrement;
    private String titre;

    public Document(int numEnregistrement, String titre) {
        this.numEnregistrement = numEnregistrement;
        this.titre = titre;
    }

    public Document() {
    }

    public int getNumEnregistrement() {
        return numEnregistrement;
    }

    public void setNumEnregistrement(int numEnregistrement) {
        this.numEnregistrement = numEnregistrement;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
