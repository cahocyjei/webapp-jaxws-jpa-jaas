package org.troyka.webaap.jaxws.services;

import jakarta.jws.WebService;
import org.troyka.webaap.jaxws.models.Curso;

import java.util.List;

@WebService
public interface ServiceCursoWs {
    List<Curso> lista();
    Curso guardar(Curso curso);
}
