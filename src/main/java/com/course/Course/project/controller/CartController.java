package com.course.Course.project.controller;

import com.course.Course.project.entity.AddItems;
import com.course.Course.project.entity.Item;
import com.course.Course.project.repository.AddItemsRepository;
import com.course.Course.project.repository.ItemRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/cart")
@AllArgsConstructor
public class CartController {
    private AddItemsRepository addItemsRepository;

    private ItemRepository itemRepository;

    @GetMapping
    public String showCart(Model model)
    {
        List<AddItems> addItems = addItemsRepository.findAll();
        model.addAttribute("addItems", addItems);
        return "/cart";
    }

    @PostMapping("/add")
    public String addItem(@RequestParam Long id)
    {
        Item item = itemRepository.findById(id).orElseThrow();
        AddItems addItems = new AddItems();
        addItems.setItem(item);
        addItemsRepository.save(addItems);
        return "redirect:/cart";
    }

    @PostMapping("/delete")
    public String deleteItem(@RequestParam Long id)
    {
        addItemsRepository.deleteById(id);
        return "redirect:/cart";
    }
}
