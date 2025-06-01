package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blog_posts")
public class PostEntity {
    @Id
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
