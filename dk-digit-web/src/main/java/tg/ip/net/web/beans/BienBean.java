/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.web.beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Data;
import tg.ip.net.dk.digit.dao.BienDAO;
import tg.ip.net.dk.digit.entities.Bien;
import tg.ip.net.dk.digit.idao.BienIDAO;

/**
 *
 * @author vincent
 */
@Named(value = "bienBean")
@RequestScoped
@Data
public class BienBean {
    
    private List<Bien> biens;
    @EJB
    private BienDAO bienDAO;
    private Bien bien;
    
    
    

    /**
     * Creates a new instance of BienBean
     */
    
    public BienBean() {
        bien = new Bien();
             
    }
    public List<Bien>listBien(){
        biens = bienDAO.listerBiens();
        return biens;
    }
    public String ajouter(){
        bienDAO.ajouter(this.bien);
        return "biens_list.faces?faces-redirect=true?";
        
        
    }
    public String modifier(){
        bienDAO.modifier(this.bien);
        return "biens_list.faces?faces-redirect=true?";
        
    }
    public String supprimer(){
        bienDAO.modifier(this.bien);
        return "biens_list.faces?faces-redirect=true?";
        
    }
//    public String ajouter(){
//        
//    }
//    
}
