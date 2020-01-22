package sn.stock.controller;

import sn.stock.dao.IProduit;
import sn.stock.dao.ProduitImpl;
import sn.stock.entities.Produit;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Produit",name="produit")
public class ProduitServlet extends HttpServlet
{
   private IProduit produitdao;

    @Override
    public void init() throws ServletException {
        produitdao =new ProduitImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.getWriter().println("OK");

        req.setAttribute("listeprod",produitdao.liste());
       System.out.println(produitdao.liste());
        req.getRequestDispatcher("produit/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String nom=req.getParameter("nom").toString();
       double qt=Double.parseDouble(req.getParameter("qtStock").toString());
        Produit p=new Produit();
        p.setNom(nom);
        p.setQtStock(qt);
        int ok=produitdao.add(p);
        req.setAttribute("result",ok);
        doGet(req,resp);
       // resp.getWriter().println("ok");
    }
}
