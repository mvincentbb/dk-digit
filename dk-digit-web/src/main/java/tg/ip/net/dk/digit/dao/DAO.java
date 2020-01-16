/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

/**
 *
 * @author delaCruz
 * @param <T>
 * @param <PK>
 */
public class DAO <T extends Object, PK extends Serializable> implements  IDAO<T,PK>{
    
    @PersistenceContext(unitName = "tg.ip.net_dk-digit-web.PU")
    protected EntityManager em;
//    private EntityTransaction et;
    private Class<T> entity;
    
    public DAO(Class<T> entity) {
        this.entity  = entity;
    }

    public DAO() {
        
    }
    
    

    
    @Override
    public Boolean ajouter(T t) {
        
//        et.begin();
        try {
            em.persist(t);
            
        } catch (Exception e) {
            System.err.println(e);
        }
//        et.commit();
        
        return true;
    }

    @Override
    public Boolean supprimer(PK id) {
        
//        et.begin();
        em.remove(id);
//        et.commit();
        return true;
    }

    @Override
    public T modifier(T t) {
//        et.begin();
        T newT = em.merge(t);
//        et.commit();
        return newT;
    }

    @Override
    public T chercher(PK id) {
//        et.begin();
        T t = em.find(entity, id);
//        et.commit();
        return t;
    }

}
