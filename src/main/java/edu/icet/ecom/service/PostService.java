package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.model.entity.PostEntity;
import edu.icet.ecom.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<PostDTO> getAll() {
        List<PostEntity> postEntityList = postRepository.findAll();
        List<PostDTO> postDTOList = new ArrayList<>();
        for (PostEntity postEntity : postEntityList){
            PostDTO postDTO = new PostDTO();

            postDTO.setId(postEntity.getId());
            postDTO.setCategory(postEntity.getCategory());
            postDTO.setContent(postEntity.getContent());
            postDTO.setTags(postEntity.getTags());
            postDTO.setTitle(postEntity.getTitle());
            postDTO.setCreated_at(postEntity.getCreated_at());
            postDTO.setUpdated_at(postEntity.getUpdated_at());
            postDTO.setImage_url(postEntity.getImage_url());
            postDTO.setComments_count(postEntity.getComments_count());
            //blogDTO.setId(blogEntity.getId());
            postDTOList.add(postDTO);
        }
        return postDTOList;
    }

    public void add(PostDTO postDTO){
        PostEntity postEntity = new PostEntity(postDTO.getId(), postDTO.getTitle(), postDTO.getContent(), postDTO.getTags(), postDTO.getCategory(), postDTO.getComments_count(), postDTO.getCreated_at(), postDTO.getUpdated_at(), postDTO.getImage_url());
        postRepository.save(postEntity);
    }

    public void delete(Integer id){
        postRepository.deleteById(id);
    }

    public void update(PostDTO postDTO){
        PostEntity postEntity = new PostEntity(postDTO.getId(), postDTO.getTitle(), postDTO.getContent(), postDTO.getTags(), postDTO.getCategory(), postDTO.getComments_count(), postDTO.getCreated_at(), postDTO.getUpdated_at(), postDTO.getImage_url());
        postRepository.save(postEntity);
    }
    public PostDTO findById(Integer id){
        Optional<PostEntity> byId = postRepository.findById(id);
        if (byId.isPresent()){
            PostDTO postDTO = new PostDTO();
            postDTO.setCategory(byId.get().getCategory());
            postDTO.setTags(byId.get().getTags());
            postDTO.setId(byId.get().getId());
            postDTO.setContent(byId.get().getContent());
            postDTO.setTitle(byId.get().getTitle());
            postDTO.setCreated_at(byId.get().getCreated_at());
            postDTO.setComments_count(byId.get().getComments_count());
            postDTO.setImage_url(byId.get().getImage_url());
            postDTO.setUpdated_at(byId.get().getUpdated_at());
            return postDTO;
        }
        return null;
    }
}
