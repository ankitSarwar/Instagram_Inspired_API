package com.geekster.InstagramProject.repo;

import com.geekster.InstagramProject.model.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFollowerRepo extends JpaRepository<InstagramFollower, Long> {


}
