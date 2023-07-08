package br.edu.iftm.crud.prod.cat.user.resources;

import br.edu.iftm.crud.prod.cat.user.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @RequestMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = List.of(
                new Category(1L, "Electronics"),
                new Category(2L, "Books"),
                new Category(3L, "Computers")
        );

        return ResponseEntity.ok().body(list);
    }
}
