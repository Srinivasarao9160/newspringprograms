package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
