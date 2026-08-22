package com.gaweb.myfirstprojectspring.repositories;

import com.gaweb.myfirstprojectspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
