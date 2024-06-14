package com.example.BikeRentalApplication.Controllers;

import com.example.BikeRentalApplication.model.Klient;
import com.example.BikeRentalApplication.model.Osoba;
import com.example.BikeRentalApplication.services.OsobaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/klients")
public class OsobaController {

    @Autowired
    private OsobaRepository repository;
    //List<Osoba> osoby = repository.findAll();

    @GetMapping({"", "/"})
    public String showKlientList(Model model){
        List<Osoba> osoby = repository.findAll();
        List<Klient> klients = osoby.stream()
                .map(Osoba::getKlientRole)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(klients);
        model.addAttribute("klients", klients);
        return "klients/index";
    }

}
