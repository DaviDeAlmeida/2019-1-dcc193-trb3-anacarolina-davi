/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.EtiquetaRepository;
import br.ufjf.dcc193.trabalho3.models.Etiqueta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/etiqueta")
public class EtiquetaController {

    @Autowired
    private EtiquetaRepository repository;
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("etiqueta", repository.findAll());
        return "admin/etiqueta/index";
    }

    @RequestMapping("/create")
    public String criar(Model model) {
        model.addAttribute("etiqueta", new Etiqueta());
        return "admin/etiqueta/create";
    }

    @RequestMapping("/store")
    public String store(Etiqueta etiqueta) {
        repository.save(etiqueta);
        return "redirect:/admin/etiqueta";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("etiqueta", repository.findById(id));
        return "admin/etiqueta/edit";
    }

    @RequestMapping("/update")
    public String update(Etiqueta etiqueta) {
        repository.save(etiqueta);
        return "redirect:/admin/etiqueta";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return "redirect:/admin/etiqueta";
    }

}
