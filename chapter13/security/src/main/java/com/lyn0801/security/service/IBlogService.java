package com.lyn0801.security.service;

import com.lyn0801.security.entity.Blog;

import java.util.List;

/**
 * @author lyn0801
 */
public interface IBlogService {
    List<Blog> getBlogs();
    void deleteBlog(long id);
}
