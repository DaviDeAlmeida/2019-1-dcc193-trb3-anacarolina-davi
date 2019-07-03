package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.EtiquetaRepository;
import br.ufjf.dcc193.trabalho3.Repository.ItemRepository;
import br.ufjf.dcc193.trabalho3.Repository.VinculoRepository;
import br.ufjf.dcc193.trabalho3.models.Vinculo;
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

    @Autowired
    private EtiquetaRepository etiquetaRepository;

    @RequestMapping("admin/vinculo/item/{idItem}")
    public String index(@PathVariable Long idItem, Model model) {
        model.addAttribute("vinculos", vinculoRepository.findByItemOrigem(itemRepository.findById(idItem).get()));
        model.addAttribute("itemOrigem", itemRepository.findById(idItem).get());
        return "admin/item-vinculo/index";
    }

    @RequestMapping("admin/vinculo/item/{idItem}/create")
    public String criar(@PathVariable Long idItem, Model model) {
        model.addAttribute("vinculo", new Vinculo());
        model.addAttribute("itens", itemRepository.findAll());
        model.addAttribute("itemOrigem", itemRepository.findById(idItem).get());
        model.addAttribute("etiquetas", etiquetaRepository.findAll());
        return "admin/item-vinculo/create";
    }

    @RequestMapping("admin/vinculo/item/{idItem}/store")
    public String store(@PathVariable Long idItem, Vinculo vinculo) {
        vinculoRepository.save(vinculo);
        return "redirect:/admin/vinculo/item/" + idItem;
    }

    @RequestMapping("/admin/vinculo/item/{idItem}/edit/{id}")
    public String edit(@PathVariable Long idItem, @PathVariable Long id, Model model) {
        model.addAttribute("vinculo", vinculoRepository.findById(id).get());
        model.addAttribute("itens", itemRepository.findAll());
        model.addAttribute("itemOrigem", itemRepository.findById(idItem).get());
        model.addAttribute("etiquetas", etiquetaRepository.findAll());
        return "admin/item-vinculo/edit";
    }
}
