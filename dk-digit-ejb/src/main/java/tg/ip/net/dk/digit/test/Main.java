/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.test;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tg.ip.net.dk.digit.entities.Bien;
import tg.ip.net.dk.digit.entities.Image;

/**
 *
 * @author kpizia
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dk-digitPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
//        Bien bien=new Bien("Iphone9","Tres clean");
//        Bien bien=new Bien("Samsung S9","Ecran curvé");
//        List<Image> images=new ArrayList<Image>();
//        Image image=new Image("photo","C:\\Users\\kpizia\\Pictures\\jee\\images.png", bien);
//        images.add(image);
//        bien.setImages(images);
        et.begin();
        Query query =em.createQuery("SELECT b from Bien b");
        List<Bien> biens =(List<Bien>)query.getResultList();
        for (Bien bien : biens) {
            System.out.println("libelle : "+bien.getLibelle()+" description : "+bien.getDescription());
        }
        
//        et.commit();
    }
}
