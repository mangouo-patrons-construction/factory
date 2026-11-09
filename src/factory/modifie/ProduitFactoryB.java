package factory.modifie;

public class ProduitFactoryB extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitB();
        return produit;
    }
}
