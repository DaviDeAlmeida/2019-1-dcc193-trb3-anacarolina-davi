package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.UsuarioRepository;
import br.ufjf.dcc193.trabalho3.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/usuario")
public class UsuarioAdminController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("usuario", usuarioRepository.findAll());
        return "admin/usuario/index";
    }

    @RequestMapping("/create")
    public String criar(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "admin/usuario/create";
    }

    @RequestMapping("/store")
    public String store(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/admin/usuario";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("usuario", usuarioRepository.findById(id));
        return "admin/usuario/edit";
    }

    @RequestMapping("/update")
    public String update(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/admin/usuario";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
        return "redirect:/admin/usuario";
    }
}
