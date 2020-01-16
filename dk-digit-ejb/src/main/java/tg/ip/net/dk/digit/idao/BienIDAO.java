/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.idao;

import java.util.List;
import tg.ip.net.dk.digit.entities.Bien;

/**
 *
 * @author kpizia
 */
public interface BienIDAO {
    public Bien rechercherUn(Long id);
    
    public Boolean ajouter(Bien bien);
    
    public Bien modifier(Bien bien);
    
    public Boolean supprimer(Long id);
    
    public Boolean supprimer(Bien bien);
    
    public List<Bien> lister();
}
