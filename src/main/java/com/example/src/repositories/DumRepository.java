package com.example.src.repositories;


import com.example.src.entities.DumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DumRepository extends JpaRepository<DumEntity, Long> {
}
