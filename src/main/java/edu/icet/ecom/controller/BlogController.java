package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.BlogDTO;
import edu.icet.ecom.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping
    public List<BlogDTO> getAll(){
        return blogService.getAll();
    }
    @PostMapping
    public void add(BlogDTO blogDTO){
        blogService.add(blogDTO);
    }
}
