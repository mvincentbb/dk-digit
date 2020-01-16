/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.dao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tg.ip.net.dk.digit.entities.Bien;
import tg.ip.net.dk.digit.entities.Image;
import tg.ip.net.dk.digit.entities.Publication;

/**
 *
 * @author kpizia
 */

//@Stateless
//public class BienDAO extends DAO<Bien, Long> implements IBienDAO<Bien,Long>{
//
//    public BienDAO() {
//        super(Bien.class);
//    }
//    
//
//    public BienDAO(Class<Bien> entity) {
//        super(entity);
//    }
//
//    public List<Bien> listerBiens() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public List<Image> listImages() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Publication getPublication() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//  
//}
@Stateless
public class BienDAO {
    
    @PersistenceContext(unitName = "tg.ip.net_dk-digit-web.PU")
    private EntityManager em;
    
    public void ajouter(Bien bien){
        em.persist(bien);
    }
    
    public void modifier(Bien bien){
        em.merge(bien);
    }

    public List<Bien> listerBiens() {
        String query = "SELECT b FROM Bien b";
        return em.createQuery(query).getResultList();
    }

//    public Publication getPublication() {
//    }
  
}
