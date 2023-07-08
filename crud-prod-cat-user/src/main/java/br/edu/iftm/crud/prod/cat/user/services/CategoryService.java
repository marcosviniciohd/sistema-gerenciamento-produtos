package br.edu.iftm.crud.prod.cat.user.services;

import br.edu.iftm.crud.prod.cat.user.entities.Category;
import br.edu.iftm.crud.prod.cat.user.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category > findAll() {
        return repository.findAll();
    }

}
