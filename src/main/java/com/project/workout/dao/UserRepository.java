package com.project.workout.dao;

import com.project.workout.dto.OrderResponse;
import com.project.workout.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select * from WORKOUT_USER u LEFT JOIN WORKOUT_COURSE c ON u.id=c.user_id", nativeQuery = true)
    public List<Object> getJoinInform();
}
