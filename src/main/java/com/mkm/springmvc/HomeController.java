package com.mkm.springmvc;

import com.mkm.springmvc.dao.AlienDao;
import com.mkm.springmvc.model.Alien;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private AlienDao dao;

    @ModelAttribute // This method will called first and available in all the controller view
    public void modelData(Model m){
        m.addAttribute("name", "Aliens");
    }

    @RequestMapping("/") // to map the url
    public String home()
    {
        System.out.println("Home page requested .. !!");
        return "index";
    }

    //@RequestMapping(value = "/addAlien", method = RequestMethod.POST)
    @PostMapping("/addAlien")
    public String addAlien(@ModelAttribute("aliens") Alien a){
        System.out.println("In add alien request" +a.toString());
        dao.addAlien(a);
        return "showAliens";
    }

    @GetMapping("/getAliens")
    public String getAliens(Model m){
        m.addAttribute("aliens", dao.getAliens());

        return "showAliens";
    }

    @GetMapping("/getAlien")
    public String getAlien(@RequestParam int id,  Model m){

        m.addAttribute("aliens", dao.getAlien(id));

        return "showAliens";
    }

//    @GetMapping("/getAliens")
//    public String getAliens(Model m){
//        List<Alien> result = Arrays.asList(new Alien(24, "manish"), new Alien(28, "Nimish"), new Alien(47, "Vivek"));
//        System.out.println("result is " + result.toString());
//        m.addAttribute("aliens", result);
//        return "showAliens";
//    }






}
