package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.AnotacaoRepository;
import br.ufjf.dcc193.trabalho3.Repository.EtiquetaRepository;
import br.ufjf.dcc193.trabalho3.Repository.ItemRepository;
import br.ufjf.dcc193.trabalho3.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;
    
    @Autowired
    private AnotacaoRepository anotacaoRepository;
    
    @Autowired
    private EtiquetaRepository etiquetaRepository;
            
    @RequestMapping("admin/itens")
    public String index(Model model) {
        model.addAttribute("itens", itemRepository.findAll());
        return "admin/itens/index";
    }

    @RequestMapping("admin/itens/create")
    public String criar(Model model) {
        model.addAttribute("item", new Item());
        model.addAttribute("etiquetas", etiquetaRepository.findAll());
        return "admin/itens/create";
    }

    @RequestMapping("admin/itens/store")
    public String store(Item item) {
        itemRepository.save(item);
        return "redirect:/admin/itens";
    }

    @RequestMapping("admin/itens/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("item", itemRepository.findById(id).get());
        model.addAttribute("etiquetas", etiquetaRepository.findAll());
        return "admin/itens/edit";
    }

    @RequestMapping("admin/itens/update")
    public String update(Item item) {
        itemRepository.save(item);
        return "redirect:/admin/itens";
    }

    @RequestMapping("admin/itens/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        itemRepository.deleteById(id);
        return "redirect:/admin/itens";
    }
    
}
