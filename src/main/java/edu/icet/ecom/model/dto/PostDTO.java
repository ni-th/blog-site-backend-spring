package edu.icet.ecom.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PostDTO {
    private Integer id;
    private String title;
    private String content;
    private String tags;
    private String category;
    private Integer comments_count;
    private String created_at;
    private String updated_at;
    private String image_url;


}
