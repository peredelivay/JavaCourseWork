package com.course.Course.project.controller;

import com.course.Course.project.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CatalogController {

    private final ItemRepository itemRepository;



    @GetMapping("/catalog")
    public String catalog(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        return "catalog";
    }
}
