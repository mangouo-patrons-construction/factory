package factorymethod.probleme;

public class TestAboyeur {
    // On remplace l'operateur new par un appel de methode
    private static Aboyeur creerAboyeur() {
        return new Chien();
    }

    public static void main(String[] args) {
        Aboyeur aboyeur = creerAboyeur();
        aboyeur.aboyer();
    }
}
