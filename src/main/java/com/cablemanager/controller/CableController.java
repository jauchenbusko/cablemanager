package com.cablemanager.controller;

import com.cablemanager.model.Cable;
import com.cablemanager.service.CableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CableController {
    private CableService cableService;

    @Autowired(required = true)
    @Qualifier(value = "cableService")
    public void setCableService(CableService cableService) {
        this.cableService = cableService;
    }

    @RequestMapping(value = "cables", method = RequestMethod.GET)
    public String listCables(Model model){
        model.addAttribute("cable", new Cable());
        model.addAttribute("listCables", this.cableService.listCables());

        return "cables";
    }

    @RequestMapping(value = "/cables/add", method = RequestMethod.POST)
    public String addCable(@ModelAttribute("cable") Cable cable){
        if(cable.getId() == 0){
            this.cableService.addCable(cable);
        } else {
            this.cableService.updateCable(cable);
        }

        return "redirect:/cables";
    }

    @RequestMapping("/delete/{id}")
    public String deleteCable(@PathVariable("id") int id){
        this.cableService.deleteCable(id);

        return "redirect:/cables";
    }

    @RequestMapping("edit/{id}")
    public String editCable(@PathVariable("id") int id, Model model){
        model.addAttribute("cable", this.cableService.getCableById(id));
        model.addAttribute("listCables", this.cableService.listCables());

        return "cables";
    }


    @RequestMapping("cabledata/{id}")
    public String cableData(@PathVariable("id") int id, Model model){
        model.addAttribute("cable", this.cableService.getCableById(id));

        return "cabledata";
    }

}
