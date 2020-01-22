package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sn.stock.dao.IProduit;
import sn.stock.dao.ProduitImpl;
import sn.stock.entities.Produit;

public class JUnitTest
{
    @Before
    public void beforeTest()
    {
    //System.out.println("=====BEFORE ======");
    }
    @After
    public void aftertest()
    {

       // System.out.println("===== AFTER======");
    }
    @Test
    public void testAddProduit()
    {
        IProduit produitdao=new ProduitImpl();
        Produit p=new Produit();
        p.setNom("table");
        p.setQtStock(12);
        produitdao.add(p);
    }
}
