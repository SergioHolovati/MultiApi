package com.teste.multi.domain.repository;

import com.teste.multi.api.model.response.DuvidaResponse;
import com.teste.multi.domain.model.Duvida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FaqRepository extends JpaRepository<Duvida, Long> {

    @Query(value = "SELECT *  FROM   duvida  WHERE  duvida like %:duvida%  ",nativeQuery = true)
    Optional<Duvida> getAllBySearch(@Param("duvida") String duvida);

}
