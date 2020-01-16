/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author HP
 */
@Entity
@Data@AllArgsConstructor
@Table(name = "biens")
public class Bien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "libelle", nullable = false)
    private String libelle;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @OneToMany(mappedBy = "bien", cascade = CascadeType.REMOVE)
    private List<Publication> publications;

    
    public Bien() {
        this.publications = new ArrayList<Publication>();
    }

    
}