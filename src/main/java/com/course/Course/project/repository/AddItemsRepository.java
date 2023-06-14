package com.course.Course.project.repository;

import com.course.Course.project.entity.AddItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddItemsRepository extends JpaRepository<AddItems, Long> {
}
