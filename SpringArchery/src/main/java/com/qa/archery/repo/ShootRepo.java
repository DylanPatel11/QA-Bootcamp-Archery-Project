package com.qa.archery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.archery.entity.Shoot;

@Repository
public interface ShootRepo extends JpaRepository<Shoot, Long> {

}
