
package br.ufjf.dcc193.trabalho3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author acaro e Davi
 */
@Controller
public class HomeController {
    
    @RequestMapping({"", "/", "home"})
    public String index() {
        return "index";
    }
    
}
