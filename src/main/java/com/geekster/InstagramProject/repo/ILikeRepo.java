package com.geekster.InstagramProject.repo;

import com.geekster.InstagramProject.model.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikeRepo extends JpaRepository<PostLike, Long> {
    long countByPost_PostId(Long postId);
}
