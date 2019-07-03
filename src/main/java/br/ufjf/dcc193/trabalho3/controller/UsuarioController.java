package br.ufjf.dcc193.trabalho3.controller;

import br.ufjf.dcc193.trabalho3.Repository.UsuarioRepository;
import br.ufjf.dcc193.trabalho3.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("admin/usuarios")
    public String index(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "admin/usuario/index";
    }

    @RequestMapping("admin/usuarios/create")
    public String criar(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "admin/usuario/create";
    }

    @RequestMapping("admin/usuarios/store")
    public String store(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/admin/usuarios";
    }

    @RequestMapping("admin/usuarios/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("usuario", usuarioRepository.findById(id));
        return "admin/usuario/edit";
    }

    @RequestMapping("admin/usuarios/update")
    public String update(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/admin/usuarios";
    }

    @RequestMapping("admin/usuarios/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
        return "redirect:/admin/usuarios";
    }
}
