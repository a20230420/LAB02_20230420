package com.example.lab2_20230420.repository;

import com.example.lab2_20230420.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
    List<Mascota> findAll();
    List<Mascota> findByEdad(int edad);
}

































