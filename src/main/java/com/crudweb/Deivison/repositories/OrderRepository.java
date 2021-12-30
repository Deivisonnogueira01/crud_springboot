package com.crudweb.Deivison.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudweb.Deivison.entities.Order;


public interface OrderRepository  extends JpaRepository<Order, Long>{

	
	
}
