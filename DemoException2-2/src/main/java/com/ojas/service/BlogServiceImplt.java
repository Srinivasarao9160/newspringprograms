package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.BlogRepository;
import com.ojas.exception.BlogAlreadyExitsException;
import com.ojas.exception.BlogNotFoundException;
import com.ojas.model.Blog;

import net.bytebuddy.asm.Advice.Return;

@Service
public class BlogServiceImplt implements BlogService {
	private BlogRepository blogRepository;

	@Autowired
	public BlogServiceImplt(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}

	@Override
	public Blog saveBlog(Blog blog) {
		if (blogRepository.existsById(blog.getBlogId())) {
			throw new BlogAlreadyExitsException();
		}
		Blog savedBlog = blogRepository.save(blog);
		return savedBlog;
	}

	@Override
	public List getAllBlogs() {
		return (List) blogRepository.findAll();
	}

	@Override
	public Blog getBlogById(int id) throws BlogNotFoundException {
		Blog blog;
		if (blogRepository.findById(id).isEmpty()) {
			throw new BlogNotFoundException();
		} else {
			blog = blogRepository.findById(id).get();
		}
		return blog;
	}
// delete method
//    @Override
//    public void deleteBlogById(int id){
//		  blogRepository.deleteById(id);

	
	// delete with exception
	@Override
	public String deleteBlogById(int id) throws BlogNotFoundException {
		if(blogRepository.findById(id).isEmpty()) {
			throw new BlogNotFoundException();
		}
			blogRepository.deleteById(id);
			return "deleted"+id;
			
		}
// update method
	public Blog updateBlog(int id, Blog blog) {
		Blog res = blogRepository.findById(id).orElse(new Blog());
		if(res.getBlogId()==blog.getBlogId()) {
			res.setBlogTitle(res.getBlogTitle());
			res.setBlogCreator(res.getBlogCreator());
			res.setYearOfPost(res.getYearOfPost());
		}
		return res;
	}
	
		

	}
	
	
	
	


