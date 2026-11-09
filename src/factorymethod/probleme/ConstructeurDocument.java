package factorymethod.probleme;

public class ConstructeurDocument {
    // Version "mauvaise" : new + if/else => couplage fort, il faut modifier cette methode a chaque nouveau type
    public Document construitDoc(String typeDoc) {
        Document resultat = null;
        if (typeDoc.equals("PDF"))
            resultat = new DocumentPDF();
        else if (typeDoc.equals("CSV"))
            resultat = new DocumentCSV();
        else if (typeDoc.equals("HTML"))
            resultat = new DocumentHTML();
        return resultat;
    }

    public static void main(String[] args) {
        ConstructeurDocument c = new ConstructeurDocument();
        c.construitDoc("PDF").afficher();
        c.construitDoc("CSV").afficher();
        c.construitDoc("HTML").afficher();
    }
}
