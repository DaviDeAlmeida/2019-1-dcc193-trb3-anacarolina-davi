package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.AnotacaoRepository;
import br.ufjf.dcc193.trabalho3.Repository.ItemRepository;
import br.ufjf.dcc193.trabalho3.Repository.UsuarioRepository;
import br.ufjf.dcc193.trabalho3.models.Anotacao;
import br.ufjf.dcc193.trabalho3.models.Item;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemAnotacaoController {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private AnotacaoRepository anotacaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @RequestMapping("admin/anotacoes/item/{idItem}")
    public String index(@PathVariable Long idItem, Model model) {
        model.addAttribute("anotacoes", anotacaoRepository.findByItem(itemRepository.findById(idItem).get()));
        model.addAttribute("item", itemRepository.findById(idItem).get());
        return "admin/itens-anotacoes/index";
    }

    @RequestMapping("admin/anotacoes/itens/create")
    public String criar(Model model) {
        model.addAttribute("anotacao", new Anotacao());
        model.addAttribute("itens", itemRepository.findAll());
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "admin/itens-anotacoes/create";
    }

    @RequestMapping("admin/anotacoes/item/store")
    public String store(Anotacao anotacao) {
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        anotacao.setDataInclusao(dateFormat.format(date));
        anotacaoRepository.save(anotacao);
        return "redirect:/admin/itens";
    }
    
    @RequestMapping("admin/anotacoes/item/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("anotacao", anotacaoRepository.findById(id).get());
        model.addAttribute("itens", itemRepository.findAll());
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "admin/itens-anotacoes/edit";
    }
    
    @RequestMapping("admin/anotacoes/item/update")
    public String upadate(Anotacao anotacao) {
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        anotacao.setDataAlteracao(dateFormat.format(date));
        anotacaoRepository.save(anotacao);
        return "redirect:/admin/itens";
    }
    
    @RequestMapping("admin/anotacoes/item/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        anotacaoRepository.deleteById(id);
        return "redirect:/admin/itens";
    }

}
