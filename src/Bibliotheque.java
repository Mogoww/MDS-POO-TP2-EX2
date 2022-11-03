public class Bibliotheque {
    public static void main(String[] args) {

        // test all classes
        Document doc = new Document(1, "titre");
        // System.out.println(doc);

        Livre livre = new Livre(2, "titre", "auteur", 100);
        // System.out.println(livre);

        Dictionnaire dico = new Dictionnaire(3, "titre", "français", 2);
        // System.out.println(dico);


        ListeDeDocuments liste = new ListeDeDocuments();
        liste.ajouterDocument(doc);
        liste.ajouterDocument(livre);
        liste.ajouterDocument(dico);

        liste.tousLesDocuments();
        liste.tousLesAuteurs();

         System.out.println(liste);


    }
}
