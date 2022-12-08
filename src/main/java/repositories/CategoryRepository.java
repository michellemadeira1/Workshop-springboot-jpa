package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
