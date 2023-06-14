package com.course.Course.project.controller;


import com.course.Course.project.entity.Order;
import com.course.Course.project.repository.OrderRepository;
import com.course.Course.project.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class OrderController {

    OrderRepository orderRepository;

    CartService cartService;

    @PostMapping("/order")
    public String saveOrder(@ModelAttribute Order order) {
        orderRepository.save(order);
        cartService.clearCart();
        return "order";
    }

}
