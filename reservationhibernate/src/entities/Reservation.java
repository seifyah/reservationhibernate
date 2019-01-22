package entities;
// Generated 22 janv. 2019 10:44:26 by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reservation generated by hbm2java
 */
@Entity
@Table(name="reservation"
    ,catalog="mabase"
)
public class Reservation  implements java.io.Serializable {


     private int codes;
     private Client client;
     private Hotel hotel;
     private Date datereservation;
     private Integer nbrnuite;

    public Reservation() {
    }

	
    public Reservation(int codes, Client client, Hotel hotel) {
        this.codes = codes;
        this.client = client;
        this.hotel = hotel;
    }
    public Reservation(int codes, Client client, Hotel hotel, Date datereservation, Integer nbrnuite) {
       this.codes = codes;
       this.client = client;
       this.hotel = hotel;
       this.datereservation = datereservation;
       this.nbrnuite = nbrnuite;
    }
   
     @Id 

    
    @Column(name="codes", unique=true, nullable=false)
    public int getCodes() {
        return this.codes;
    }
    
    public void setCodes(int codes) {
        this.codes = codes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idclient", nullable=false)
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idhotel", nullable=false)
    public Hotel getHotel() {
        return this.hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datereservation", length=0)
    public Date getDatereservation() {
        return this.datereservation;
    }
    
    public void setDatereservation(Date datereservation) {
        this.datereservation = datereservation;
    }

    
    @Column(name="nbrnuite")
    public Integer getNbrnuite() {
        return this.nbrnuite;
    }
    
    public void setNbrnuite(Integer nbrnuite) {
        this.nbrnuite = nbrnuite;
    }




}


