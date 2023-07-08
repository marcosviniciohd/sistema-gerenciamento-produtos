package br.edu.iftm.crud.prod.cat.user.repositories;

import br.edu.iftm.crud.prod.cat.user.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
