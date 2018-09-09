package com.farouk.bengarssallah.tutorial.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.farouk.bengarssallah.tutorial.domain.Post;
import com.farouk.bengarssallah.tutorial.repository.PostRepository;

@Controller
public class PostController {
	
	  @Autowired
	  PostRepository postRepository;

	 @RequestMapping("/welcome")
	  public String getClientPage(Model model){
		                  Post postOne = new Post("Post One", "Post One Content");
		                  Post postTwo = new Post("Post Two", "Post Two Content");
		                  postRepository.save(postOne);
		                  postRepository.save(postTwo);
		                  List<Post> posts = postRepository.findAll();
		                  model.addAttribute("posts", posts);
		                  return "welcome";
	  }
	 
	
	  
}
