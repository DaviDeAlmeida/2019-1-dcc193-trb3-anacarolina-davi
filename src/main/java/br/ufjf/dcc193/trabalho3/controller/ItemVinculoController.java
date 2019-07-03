package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.ItemRepository;
import br.ufjf.dcc193.trabalho3.Repository.VinculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemVinculoController {
    @Autowired
    private ItemRepository itemRepository;
    
    @Autowired
    private VinculoRepository vinculoRepository;

    @RequestMapping("admin/vinculo/item/{idItem}")
    public String index(@PathVariable Long idItem, Model model) {
        model.addAttribute("vinculos", vinculoRepository.findByItemOrigem(itemRepository.findById(idItem).get()));
        model.addAttribute("item", itemRepository.findById(idItem).get());
        return "admin/item-vinculo/index";
    }

}
