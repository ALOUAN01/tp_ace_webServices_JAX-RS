package com.example.jax_rs.repositories;

import com.example.jax_rs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
