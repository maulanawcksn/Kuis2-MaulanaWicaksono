/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tib.kuis_1044.controller;


import com.example.tib.kuis_1044.entity.Mobil;
import com.example.tib.kuis_1044.service.MobilService;
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
@RequestMapping("/mobil")
public class MobilController {
@Autowired
    private MobilService mobilService;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil insert(@RequestBody Mobil mobil) {
        return mobilService.insert(mobil);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil update(@RequestBody Mobil mobil) {
        return mobilService.update(mobil);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_mobil}")
    public boolean delete(@PathVariable("id_mobil") Long id_mobil) {
        return mobilService.delete(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_mobil}")
    public Mobil getById(@PathVariable("id_mobil") Long id_mobil){
        return mobilService.getById(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil> getAll(){
        return mobilService.getAll();
    }
}
