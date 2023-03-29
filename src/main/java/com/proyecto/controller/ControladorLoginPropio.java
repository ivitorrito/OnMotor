
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorLoginPropio {
    @GetMapping("/login")
    public String loginPropio(){

return"login_nuevo";
}
}
