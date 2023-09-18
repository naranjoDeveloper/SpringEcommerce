package dev.naranjo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.naranjo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
