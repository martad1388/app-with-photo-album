package com.photos.repositories;

import com.photos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * from User u", nativeQuery = true)
    List<User> findAll();



}
