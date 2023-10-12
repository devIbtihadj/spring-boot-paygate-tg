package com.ibtihadj.paygate.repository;

import com.ibtihadj.paygate.entities.Payement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayementRepository extends JpaRepository<Payement, Long> {
}
