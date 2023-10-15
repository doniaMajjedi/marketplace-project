

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//table for default will be as our class name
@Table(name=user)
public class User {
    //make id auto generate to use
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //for define inside the column
    @Column(name = "user_Firstname")
    private String  nom;
    @Column(name = "user_Lastname")
    private String prenom;
    @Column(name = "user_Birthday")
    private String datedenaissance;
    @Column(name = "user_Mail")
    private String adr;
    @Column(name = "user_Mdp")
    private String mdp;
    @Column(name = "user_Vmdp")
    private String vmdp;

    //constructeur
    public User(String nom, String prenom, String datedenaissance, String adr, String mdp, String vmdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.datedenaissance = datedenaissance;
        this.adr = adr;
        this.mdp = mdp;
        this.vmdp = vmdp;
    }
    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getDatedenaissance() {
        return datedenaissance;
    }
    public void setDatedenaissance(String datedenaissance) {
        this.datedenaissance = datedenaissance;
    }
    public String getAdr() {
        return adr;
    }
    public void setAdr(String adr) {
        this.adr = adr;
    }
    public String getMdp() {
        return mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public String getVmdp() {
        return vmdp;
    }
    public void setVmdp(String vmdp) {
        this.vmdp = vmdp;
    }

}