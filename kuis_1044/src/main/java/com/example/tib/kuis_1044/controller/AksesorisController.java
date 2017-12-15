/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis_1044.controller;


import com.example.tib.kuis_1044.entity.Aksesoris;
import com.example.tib.kuis_1044.service.AksesorisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC-25-320
 */
@RestController
@RequestMapping("/aksesoris")
public class AksesorisController {
    @Autowired
    private AksesorisService aksesorisService;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris insert(@RequestBody Aksesoris aksesoris) {
        return aksesorisService.insert(aksesoris);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesoris update(@RequestBody Aksesoris aksesoris) {
        return aksesorisService.update(aksesoris);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_aksesoris}")
    public boolean delete(@PathVariable("id_aksesoris") Long id_aksesoris) {
        return aksesorisService.delete(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_aksesoris}")
    public Aksesoris getById(@PathVariable("id_aksesoris") Long id_aksesoris){
        return aksesorisService.getById(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris> getAll(){
        return aksesorisService.getAll();
    }
}
