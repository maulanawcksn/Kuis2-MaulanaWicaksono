/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis_1044.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import com.example.tib.kuis_1044.entity.Mobil;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC-25-320
 */
public interface MobilRepo extends CrudRepository<Mobil, Long>{
    @Query("select c from Mobil c")
    public List<Mobil> findAllMobil();
}
