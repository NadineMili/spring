package com.example.examenblanc.repository;

import com.example.examenblanc.entities.DataCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataCenterRepository extends JpaRepository<DataCenter,Integer> {
}
