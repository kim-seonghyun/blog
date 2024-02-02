package com.seonghyun.blog.repository;

import com.seonghyun.blog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long > {

}
