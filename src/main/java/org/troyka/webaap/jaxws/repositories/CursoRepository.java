package org.troyka.webaap.jaxws.repositories;


import org.troyka.webaap.jaxws.models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
