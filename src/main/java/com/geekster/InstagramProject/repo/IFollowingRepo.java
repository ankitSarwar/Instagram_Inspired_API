package com.geekster.InstagramProject.repo;

import com.geekster.InstagramProject.model.InstagramFollowing;
import com.geekster.InstagramProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFollowingRepo extends JpaRepository<InstagramFollowing, Long> {

    Long countByUser_userId(long userId);
}
