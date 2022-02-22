package com.teste.multi.domain.repository;

import com.teste.multi.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(value = " SELECT    *  FROM    produto    where nome like %:param%  or codigo like %:param% or produto like %:param%  or sku like %:param%  " , nativeQuery = true)
    Optional<Produto> getAllProdutoByParameterLike(@Param("param") String param);

    @Query(value = " SELECT * from produto where codigo = :cod " , nativeQuery = true)
    Optional<Produto> getByCod(@Param("cod") String cod);

}
