package com.geekster.InstagramProject.repo;

import com.geekster.InstagramProject.model.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepo extends JpaRepository<InstagramComment, Long> {
}
