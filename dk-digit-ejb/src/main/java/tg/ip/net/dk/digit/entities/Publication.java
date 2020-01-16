/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author HP
 */
@Entity
@Data@NoArgsConstructor@AllArgsConstructor
@Table(name = "publications")
public class Publication implements Serializable{
    
    public Publication(Utilisateur user, Bien bien) {
        getId().setBienId(bien.getId());
        getId().setUtilisateurId(user.getId());
        
        this.setBien(bien);
        this.setUtilisateur(user);
        
        bien.getPublications().add(this);
        user.getPublications().add(this);
    }
    
    @Getter@Setter
    @Embeddable
    public static class Id implements Serializable{
        @Column(name = "bien_id")
        private Long bienId;
        
        @Column(name = "utilisateur_id")
        private Long utilisateurId;
    }
    
    @EmbeddedId
    private Id id = new Id();
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_publication")
    private Date datePublication;
    
    @Column(name = "prix", nullable = false)
    private Double prix;
    
    @Column()
    private Boolean depublier;
    
    @ManyToOne()
    @JoinColumn(name = "bien_id", insertable = false, updatable = false)
    private Bien bien;
    
    @ManyToOne()
    @JoinColumn(name = "utilisateur_id", insertable = false, updatable = false)
    private Utilisateur utilisateur;
    
    @ManyToOne()
    @JoinColumn(name = "objet_publication_id")
    private ObjetPublication objetPublication;
    
}
