package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.AnotacaoRepository;
import br.ufjf.dcc193.trabalho3.Repository.ItemRepository;
import br.ufjf.dcc193.trabalho3.Repository.UsuarioRepository;
import br.ufjf.dcc193.trabalho3.Repository.VinculoRepository;
import br.ufjf.dcc193.trabalho3.models.Anotacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
public class VinculoAnotacaoController {

    //@Autowired
    //private ItemRepository itemRepository;

    @Autowired
    private VinculoRepository vinculoRepository;

    @Autowired
    private AnotacaoRepository anotacaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("admin/anotacoes/vinculo/{idVinculo}")
    public String index(@PathVariable Long idVinculo, Model model) {
        model.addAttribute("anotacoes", anotacaoRepository.findByVinculo(vinculoRepository.findById(idVinculo).get()));
        model.addAttribute("vinculo", vinculoRepository.findById(idVinculo).get());
        return "admin/vinculos-anotacoes/index";
    }

    @RequestMapping("admin/anotacoes/vinculos/create")
    public String criar(Model model) {
        model.addAttribute("anotacao", new Anotacao());
        model.addAttribute("vinculos", vinculoRepository.findAll());
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "admin/vinculos-anotacoes/create";
    }

    @RequestMapping("admin/anotacoes/vinculo/store")
    public String store(Anotacao anotacao) {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        anotacao.setDataInclusao(dateFormat.format(date));
        anotacaoRepository.save(anotacao);
        return "redirect:/admin/itens";
    }

    @RequestMapping("admin/anotacoes/vinculo/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("anotacao", anotacaoRepository.findById(id).get());
        model.addAttribute("vinculos", vinculoRepository.findAll());
        model.addAttribute("usuarios", usuarioRepository.findAll());

        return "admin/vinculos-anotacoes/edit";
    }

    @RequestMapping("admin/anotacoes/vinculo/update")
    public String upadate(Anotacao anotacao) {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        anotacao.setDataAlteracao(dateFormat.format(date));
        anotacaoRepository.save(anotacao);
        return "redirect:/admin/itens";
    }

    @RequestMapping("admin/anotacoes/vinculo/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        anotacaoRepository.deleteById(id);
        return "redirect:/admin/itens";
    }
}
