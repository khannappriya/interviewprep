package com.interviewprep.practicequestions;

import java.util.List;

public class Twitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	    /** Initialize your data structure here. */
	    public Twitter() {
	       int userId=1;
	       int tweetId=1;
	       int followerId=1;
	       int followeeId=1;
	        
	    }
	    
	    /** Compose a new tweet. */
	    public void postTweet(int userId, int tweetId) {
	        System.out.println(userId);
	    }
	    
	    /** Retrieve the 10 most recent tweet ids in the user's news feed. 
	     * Each item in the news feed must be posted by users who the user followed or by the user herself. 
	     * Tweets must be ordered from most recent to least recent. */
	    public List<Integer> getNewsFeed(int userId) {
			return null;
	        
	    }
	    
	    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
	    public void follow(int followerId, int followeeId) {
	        
	    }
	    
	    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
	    public void unfollow(int followerId, int followeeId) {
	        
	    }
	}

	/**
	 * Your Twitter object will be instantiated and called as such:
	 * Twitter obj = new Twitter();
	 * obj.postTweet(userId,tweetId);
	 * List<Integer> param_2 = obj.getNewsFeed(userId);
	 * obj.follow(followerId,followeeId);
	 * obj.unfollow(followerId,followeeId);
	 */
	

