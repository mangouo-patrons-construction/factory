package factory.modifie;

public class ProduitFactoryD extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitD();
        return produit;
    }
}
