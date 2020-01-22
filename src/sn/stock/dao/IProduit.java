package sn.stock.dao;

import sn.stock.entities.Produit;

import java.util.List;

public interface IProduit {
    public int add(Produit produit);

    public List<Produit> liste();
}
