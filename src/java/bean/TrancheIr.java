/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author yasser
 */
@Entity
public class TrancheIr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private double minim;
    private double maxim;
    private float taux;
    @ManyToOne
    private Ir ir;

    public TrancheIr() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMinim() {
        return minim;
    }

    public void setMinim(double minim) {
        this.minim = minim;
    }

    public double getMaxim() {
        return maxim;
    }

    public void setMaxim(double maxim) {
        this.maxim = maxim;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public Ir getIr() {
        return ir;
    }

    public void setIr(Ir ir) {
        this.ir = ir;
    }
    
}
