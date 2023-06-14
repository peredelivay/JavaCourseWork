package com.course.Course.project.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cart")
public class AddItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;


    public static int countTotal(List<AddItems> addItems)
    {
        int total = 0;
        for (AddItems items: addItems)
        {
            total += items.getItem().getPrice();
        }
        return total;
    }
}
