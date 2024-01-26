package com.vaishnavi.service;

import java.util.List;

import com.vaishnavi.models.Post;

public interface PostService {
	Post createNewPost(Post post,	Integer userId) throws Exception;
	
	String deletePost(Integer postId,Integer userId) throws Exception;
	
	List<Post> findPostByUserId(Integer userId);
	
	Post findPostById(Integer postId) throws Exception;
	
	List<Post> findAllPosts();
	
	
	
	Post savedPost(Integer postId,Integer userId) throws Exception;
	
	Post likePost(Integer postId,Integer userId) throws Exception;
	
	

}
