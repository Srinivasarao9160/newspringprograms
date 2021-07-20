package com.ojas.service;

import java.util.List;

import com.ojas.exception.BlogAlreadyExitsException;
import com.ojas.exception.BlogNotFoundException;
import com.ojas.model.Blog;

public interface BlogService {
    Blog saveBlog(Blog blog) throws BlogAlreadyExitsException;
    
    List getAllBlogs() throws BlogNotFoundException;
    
    Blog getBlogById(int id) throws BlogNotFoundException;
    
    String deleteBlogById(int id) throws BlogNotFoundException;
    
    
}
