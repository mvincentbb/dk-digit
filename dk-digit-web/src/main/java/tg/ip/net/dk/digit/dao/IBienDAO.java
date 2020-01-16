/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.dao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;
import tg.ip.net.dk.digit.entities.Bien;
import tg.ip.net.dk.digit.entities.Image;
import tg.ip.net.dk.digit.entities.Publication;

/**
 *
 * @author delaCruz
 * @param <T>
 * @param <PK>
 */
@Local
public interface IBienDAO<T extends Object, PK extends Serializable> extends IDAO<Bien, Long>{
    public List<Bien> listerBiens();
    public List<Image> listImages();
    public Publication getPublication();
}
