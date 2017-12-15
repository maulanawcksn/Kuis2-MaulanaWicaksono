/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis_1044.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;

/**
 *
 * @author PC-25-320
 */
@Entity
@Table(name="mobil_1044")
public class Mobil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 100, nullable = false, unique = true)
    private String namaMobil;
    @Column(length = 255, nullable = true)
    private String produsenMobil;
    @Column(length = 255, nullable = true)
    private int tahunMobil;
    
    @OneToMany
    @JoinColumn(name="id_mobil")
    private Set<Aksesoris> Aksesoris;
    
    public Long getidMobil() {
        return id_mobil;
    }

    public void setidMobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

    public String getName() {
        return namaMobil;
    }

    public void setName(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getprodusenMobil() {
        return produsenMobil;
    }

    public void setprodusenMobil(String produsenMobil) {
        this.produsenMobil = produsenMobil;
    }    
    
    public int gettahunMobil() {
        return tahunMobil;
    }

    public void settahunMobil(int tahunMobil) {
        this.tahunMobil = tahunMobil;
    }

    
}
