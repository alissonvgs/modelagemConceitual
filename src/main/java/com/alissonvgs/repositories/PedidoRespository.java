package com.alissonvgs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alissonvgs.domain.Pedido;

@Repository
public interface PedidoRespository extends JpaRepository<Pedido, Integer>{

}
