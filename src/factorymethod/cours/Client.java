package factorymethod.cours;

public class Client {
    public static void main(String[] args) {
        System.out.println("bonjour le monde");
        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;

        // affiche un produit de type A
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeA);
        produit.methodeproduit();

        // affiche un produit de type B
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeB);
        produit.methodeproduit();

        // affiche un produit de type C
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeC);
        produit.methodeproduit();

        // produit inexistant
        String d = "D";
        try {
            produit = fabriqueproduit.createProduit(d);
            produit.methodeproduit();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage() + " (" + d + ")");
        }
    }
}
