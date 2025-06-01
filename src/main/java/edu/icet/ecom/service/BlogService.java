package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.BlogDTO;
import edu.icet.ecom.model.entity.BlogEntity;
import edu.icet.ecom.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository;
    @GetMapping
    public List<BlogDTO> getAll() {
        List<BlogEntity> blogEntityList = blogRepository.findAll();
        List<BlogDTO> blogDTOList = new ArrayList<>();
        for (BlogEntity blogEntity: blogEntityList){
            BlogDTO blogDTO = new BlogDTO();

            blogDTO.setId(blogEntity.getId());
            blogDTO.setCategory(blogEntity.getCategory());
            blogDTO.setContent(blogEntity.getContent());
            //blogDTO.setTags(blogEntity.getTags());
            blogDTO.setTitle(blogEntity.getTitle());
            blogDTO.setCreated_at(blogEntity.getCreated_at());
            blogDTO.setUpdated_at(blogEntity.getUpdated_at());
            blogDTO.setImage_url(blogEntity.getImage_url());
            blogDTO.setComments_count(blogEntity.getComments_count());
            //blogDTO.setId(blogEntity.getId());
            blogDTOList.add(blogDTO);
        }
        return blogDTOList;
    }
    @PostMapping
    public void add(BlogDTO blogDTO){
        BlogEntity blogEntity = new BlogEntity(blogDTO.getId(),blogDTO.getTitle(),blogDTO.getContent(),blogDTO.getCategory(),blogDTO.getComments_count(),blogDTO.getCreated_at(),blogDTO.getUpdated_at(),blogDTO.getImage_url());
        blogRepository.save(blogEntity);
    }
    @DeleteMapping
    public void delete(){

    }
    @PostMapping
    public void update(){

    }
}
