/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.controllers;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tg.ip.net.dk.digit.dao.BienDAO;
import tg.ip.net.dk.digit.entities.Bien;

/**
 *
 * @author delaCruz
 */
//@WebServlet(urlPatterns = "/biens")
public class BienController extends HttpServlet {


    private Bien bien;
    
    @EJB
    private BienDAO bienDao;

    @Override
    public void init() throws ServletException {
        bien = new Bien();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        bien.setLibelle(req.getParameter("libelle"));
        bien.setDescription(req.getParameter("description"));
        System.out.println("------------------Voici les diverses valeurs saisies par l'utilisateur :"
                + "\n"
                + "Libelle du bien       ---" +bien.getLibelle() + "-----\n"
                + "Description du bien   ---" + bien.getDescription()+"----\n"
                +"---------------------------------Fin----------------\n"
        );
       
        
        bienDao.ajouter(bien);
        
        List<Bien> listBiens = bienDao.listerBiens();
        
        System.out.println("\n*********************Affichage des objets de la base*************");
        for(Bien bien : listBiens){
            System.out.println(
                     bien.getLibelle()
                    +"\n"
            );
        }
        
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
    
    
    
    
}
