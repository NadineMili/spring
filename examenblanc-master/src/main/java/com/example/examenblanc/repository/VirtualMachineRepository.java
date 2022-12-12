package com.example.examenblanc.repository;

import com.example.examenblanc.entities.VirtualMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualMachineRepository extends JpaRepository<VirtualMachine,Integer> {
}
