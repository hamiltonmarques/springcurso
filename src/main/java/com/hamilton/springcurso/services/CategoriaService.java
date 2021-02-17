package com.hamilton.springcurso.services;

import com.hamilton.springcurso.domain.Categoria;
import com.hamilton.springcurso.exceptions.ObjectNotFoundException;
import com.hamilton.springcurso.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id) {
        return categoriaRepository
                .findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(
                        "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
