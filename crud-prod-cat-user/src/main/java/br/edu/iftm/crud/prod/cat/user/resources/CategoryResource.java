package br.edu.iftm.crud.prod.cat.user.resources;

import br.edu.iftm.crud.prod.cat.user.entities.Category;
import br.edu.iftm.crud.prod.cat.user.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService service;

    @RequestMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
