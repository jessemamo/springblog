package com.example.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getPosts(){
        return "viewing all post ";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPost(@PathVariable long id) {
        return "Viewing post: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm() {
        return "Form to create post.";
    }

    @PostMapping ("/posts/create")
    @ResponseBody
    public String savePost() {
        return "Saving post.";
    }
}
