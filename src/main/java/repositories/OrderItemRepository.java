package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
