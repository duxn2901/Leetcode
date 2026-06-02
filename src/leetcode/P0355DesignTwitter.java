package leetcode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class P0355DesignTwitter {
    class Twitter {

    HashMap<Integer, HashSet<Integer>> follows;
    HashMap<Integer, ArrayList<int[]>> posts;
    int time;

    public Twitter() {
        follows = new HashMap<>();
        posts = new HashMap<>();
        time = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        if (!posts.containsKey(userId)) posts.put(userId, new ArrayList<>());
        posts.get(userId).add(new int[] {time, tweetId});
        time++;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        
    }
    
    public void follow(int followerId, int followeeId) {
        if (!follows.containsKey(followerId)) follows.put(followerId, new HashSet<>());
        follows.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        follows.get(followerId).remove(followeeId);
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
}
