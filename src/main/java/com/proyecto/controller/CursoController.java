package com.proyecto.controller;

import com.lowagie.text.DocumentException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.entity.Curso;
import com.proyecto.entity.Maquinas;
import com.proyecto.repository.MaquinasRepository;
import com.proyecto.service.CursoService;
import com.proyecto.service.MaquinasService;
import com.proyecto.util.ListarClientesPdf;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CursoController {
    private static final String CURSOS_VIEW = "curso";
     private static final String CURSOS_VIEW1 = "Listado";
     private static final String CURSOS_VIEW2 = "AgregarMaquinas";
     private static final String CURSOS_VIEW3 = "ListarMaquinas";
    private static final Log LOG = LogFactory.getLog(CursoController.class);
   
    @Autowired
    @Qualifier("cursoServiceImp")
    private CursoService cursoService;
     @Autowired
    @Qualifier("MaquinasServiceImp")
    private MaquinasService MaquinasService;

    @GetMapping("/lista")
    public ModelAndView listAllCursos(){

        ModelAndView mav = new ModelAndView(CURSOS_VIEW);
       // mav.addObject("cursos",cursoService.listAllCursos());
        mav.addObject("curso", new Curso());
       
        return mav;
    }
    
    @GetMapping("/Listado")
    public ModelAndView listAllCursos1(){

        ModelAndView mav1 = new ModelAndView(CURSOS_VIEW1);
        mav1.addObject("cursos",cursoService.listAllCursos());
        
        return mav1;
    }
     @GetMapping("/buscalista")
    public String mascasform(Model model){

      
        model.addAttribute("curso", new Curso());
       
        return "busca_cards";
    }
     @GetMapping("/busca")
   public String buscarPorNombre(@RequestParam String nombre, Model model,@ModelAttribute("curso")Curso curso){
   
       model.addAttribute("listAllcusros3",cursoService.listAllcusros3(nombre));
   
   return "busca_cards";
   }
     @GetMapping("/Maquinas")
    public ModelAndView listAllMaquinas(){

        ModelAndView mav2 = new ModelAndView(CURSOS_VIEW2);
        mav2.addObject("Maquinas", new Maquinas());
        
        return mav2;
    }
     @PostMapping("/agregarmaquina")
    public String addMaquinas(@ModelAttribute("Maquinas") Maquinas Maquinas){
       
        MaquinasService.addMaquinas(Maquinas);
        return "redirect:/Maquinas";
    }
      @GetMapping("/ListadoMaquinas")
    public ModelAndView listAllMaquinas1(){

        ModelAndView mav3 = new ModelAndView(CURSOS_VIEW3);
        mav3.addObject("Maquinas",MaquinasService.listAllMaquinas());
        
        return mav3;
    }
    
    @GetMapping(value = "/")
public String agregarProducto(Model model) {
      
       
    return "Pres";
}
 @GetMapping("/delete/{id}")
 public String delete(@PathVariable int id, Model model) {
  MaquinasService.removeMaquinas(id);
 
  return "redirect:/ListadoMaquinas";
 }
  

    @PostMapping("/agregar")
    public String addCurso(@ModelAttribute("curso") Curso curso){
        LOG.info("Call: addCurso() --- Param: " + curso.toString() );
      
        cursoService.addCurso(curso);
        return "redirect:/lista";
    }
     @GetMapping("/pdf/{id}")
    public void exportToPDF(HttpServletResponse response,@PathVariable int id) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Presupuesto_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
  
        List<Curso> listUsers = cursoService.listAllCursos2(id);
       
         
        ListarClientesPdf exporter = new ListarClientesPdf();
        exporter.generate(listUsers, response);
         
    }
}