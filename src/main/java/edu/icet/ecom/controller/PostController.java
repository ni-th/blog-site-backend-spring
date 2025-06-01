package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/posts")
    public List<PostDTO> getAll(){
        return postService.getAll();
    }
    @PostMapping("/posts")
    public void add(@RequestBody PostDTO postDTO){
        postService.add(postDTO);
    }
    @PutMapping("/posts")
    public void update(@RequestBody PostDTO postDTO){
        postService.update(postDTO);
    }
    @DeleteMapping("posts/{id}")
    public void delete(@PathVariable Integer id){
        postService.delete(id);
    }
    @GetMapping("/posts/{id}")
    public PostDTO findById(@PathVariable Integer id){
        return postService.findById(id);
    }



}
