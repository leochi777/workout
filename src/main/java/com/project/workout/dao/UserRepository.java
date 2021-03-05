package com.project.workout.dao;

import com.project.workout.dto.OrderResponse;
import com.project.workout.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select new com.project.workout.dto.OrderResponse  (u.id as USER_ID ,u.name as USER_NAME ,c.name as COURSE_NAME ,c.memo as COURSE_MEMO)  from User u LEFT JOIN u.course c")
    public List<OrderResponse> getJoinInform();
}
