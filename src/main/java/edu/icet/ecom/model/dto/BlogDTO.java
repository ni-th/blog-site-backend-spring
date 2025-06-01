package edu.icet.ecom.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BlogDTO {
    private Integer id;
    private String title;
    private String content;
    //private ArrayList<String> tags;
    private String category;
    private Integer comments_count;
    private String created_at;
    private String updated_at;
    private String image_url;


}
