package com.example.commentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private Long id;
    private String comment;
    private Date createdDate;
    private Date updatedDate;
    private Long userId;
    private Long postId;
}