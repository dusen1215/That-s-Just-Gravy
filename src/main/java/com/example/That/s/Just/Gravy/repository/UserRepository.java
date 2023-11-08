package com.example.That.s.Just.Gravy.repository;


import com.example.That.s.Just.Gravy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
        // Tutorial → Entity type and Long --> primary key
{
    //   findByPublished is a custom method()
    List<User> findByValidated(boolean validated);

}
