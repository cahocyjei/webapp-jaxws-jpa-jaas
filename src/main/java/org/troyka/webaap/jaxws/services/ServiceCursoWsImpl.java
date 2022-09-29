package org.troyka.webaap.jaxws.services;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.troyka.webaap.jaxws.models.Curso;
import org.troyka.webaap.jaxws.repositories.CursoRepository;

import java.util.List;
//@DeclareRoles({"USER","ADMIN"})
@Stateless
@WebService(endpointInterface = "org.troyka.webaap.jaxws.services.ServiceCursoWs")
public class ServiceCursoWsImpl implements ServiceCursoWs {

    @Inject
    private CursoRepository repo;

    //@RolesAllowed({"USER","ADMIN"})
    @WebMethod
    @Override
    public List<Curso> lista() {
        return repo.listar() ;
    }

    //@RolesAllowed({"ADMIN"})
    @WebMethod
    @Override
    public Curso guardar(Curso curso) {
        return repo.guardar(curso);
    }
}
