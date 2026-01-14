package com.tienda.jugetes.repository;


import com.tienda.jugetes.entity.Jugete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JuRepository extends JpaRepository<Jugete, Long> {

}


