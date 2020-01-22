package test;

import sn.stock.dao.IProduit;
import sn.stock.dao.ProduitImpl;
import sn.stock.entities.Produit;

public class Test
{
    public static  void main(String[] args)
    {
        IProduit produit=new ProduitImpl();
        Produit p=new Produit();

        p.setNom("Ordinateur");
        p.setQtStock(23.0);
        int ok=produit.add(p);
        System.out.println(ok);
    }
}
