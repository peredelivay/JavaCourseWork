package com.course.Course.project.service;

import com.course.Course.project.repository.AddItemsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CartService {
    AddItemsRepository addItemsRepository;

    public void clearCart()
    {
        addItemsRepository.deleteAll();
    }
}
