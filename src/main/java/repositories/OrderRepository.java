package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
