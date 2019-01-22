package entities;
// Generated 22 janv. 2019 10:44:26 by Hibernate Tools 3.4.0.CR1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name="client"
    ,catalog="mabase"
)
public class Client  implements java.io.Serializable {


     private int idclient;
     private String nom;
     private String prenom;
     private String adresse;
     private Set<Reservation> reservations = new HashSet<Reservation>(0);

    public Client() {
    }

	
    public Client(int idclient) {
        this.idclient = idclient;
    }
    public Client(int idclient, String nom, String prenom, String adresse, Set<Reservation> reservations) {
       this.idclient = idclient;
       this.nom = nom;
       this.prenom = prenom;
       this.adresse = adresse;
       this.reservations = reservations;
    }
   
     @Id 

    
    @Column(name="idclient", unique=true, nullable=false)
    public int getIdclient() {
        return this.idclient;
    }
    
    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    
    @Column(name="nom")
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="prenom")
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    @Column(name="adresse")
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="client")
    public Set<Reservation> getReservations() {
        return this.reservations;
    }
    
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }




}

