/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kpizia
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 30)
    private String titre;
    
    @Column(unique = true)
    private String url;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_bien")
    private Bien bien;

    public Image(String titre, String url, Bien bien) {
        this.titre = titre;
        this.url = url;
        this.bien = bien;
    }
    
    public Image(String titre, String url) {
        this.titre = titre;
        this.url = url;
    }

    
}
