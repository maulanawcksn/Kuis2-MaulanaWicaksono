/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis_1044.repo;

import com.example.tib.kuis_1044.entity.Aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-25-320
 */
public interface AksesorisRepo extends CrudRepository<Aksesoris, Long>{
@Query("select c from Aksesoris c")
    public List<Aksesoris> findAllAksesoris();
}
