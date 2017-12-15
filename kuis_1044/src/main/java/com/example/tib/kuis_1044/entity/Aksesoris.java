/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis_1044.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

/**
 *
 * @author PC-25-320
 */
@Entity
@Table(name="aksesoris_1044")
public class Aksesoris {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aksesoris;
    @Column(length = 100, nullable = false, unique = true)
    private String namaAksesoris;
    @Column(length = 255, nullable = true)
    private Long hargaAksesoris;
    private int stokAksesoris;
    
    @Column
    private Long id_mobil;
    
    public Long getidMobil() {
        return id_mobil;
    }

    public void setidMobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }
    
    public Long getidAksesoris() {
        return id_aksesoris;
    }

    public void setidAksesoris(Long id_aksesoris) {
        this.id_aksesoris = id_aksesoris;
    }

    public String getnamaAksesoris() {
        return namaAksesoris;
    }

    public void setnamaAksesoris(String namaAksesoris) {
        this.namaAksesoris = namaAksesoris;
    }

    public Long gethargaAksesoris() {
        return hargaAksesoris;
    }

    public void sethargaAksesoris(Long hargaAksesoris) {
        this.hargaAksesoris = hargaAksesoris;
    }    
    
    public int getstokAksesoris() {
        return stokAksesoris;
    }

    public void setstokAksesoris(int stokAksesoris) {
        this.stokAksesoris = stokAksesoris;
    }
}
