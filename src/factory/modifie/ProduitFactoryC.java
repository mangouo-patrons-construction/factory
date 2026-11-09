package factory.modifie;

public class ProduitFactoryC extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitC();
        return produit;
    }
}
