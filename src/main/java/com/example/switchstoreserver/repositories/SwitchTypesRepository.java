package com.example.switchstoreserver.repositories;

import com.example.switchstoreserver.models.Switch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwitchTypesRepository extends JpaRepository<Switch, Integer> {
}
