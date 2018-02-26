/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author yasser
 */
@Entity
public class Is implements Serializable {

    @OneToMany(mappedBy = "is")
    private List<TrancheIs> trancheIss;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateapp;
    @ManyToOne
    private Dgi dgi;

    public Is() {
    }

    public List<TrancheIs> getTrancheIss() {
        return trancheIss;
    }

    public void setTrancheIss(List<TrancheIs> trancheIss) {
        this.trancheIss = trancheIss;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateapp() {
        return dateapp;
    }

    public void setDateapp(Date dateapp) {
        this.dateapp = dateapp;
    }

    public Dgi getDgi() {
        return dgi;
    }

    public void setDgi(Dgi dgi) {
        this.dgi = dgi;
    }

}
