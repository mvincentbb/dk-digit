/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author delaCruz
 * @param <T>
 * @param <PK>
 */
public interface IDAO<T extends Object, PK extends Serializable> {
    public Boolean ajouter(T t);
    public Boolean supprimer(PK id);
    public T modifier(T t);
    public T chercher(PK id);
}
