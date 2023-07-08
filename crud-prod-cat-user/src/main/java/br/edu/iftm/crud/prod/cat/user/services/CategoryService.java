package br.edu.iftm.crud.prod.cat.user.services;

import br.edu.iftm.crud.prod.cat.user.dto.CategoryDTO;
import br.edu.iftm.crud.prod.cat.user.entities.Category;
import br.edu.iftm.crud.prod.cat.user.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }

}
