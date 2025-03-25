package org.leoalmeida.form;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("form")
public class FormularioResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Formulario> forms() {
        return Formulario.listAll();
    }

    @Path("findById")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Formulario findById(@QueryParam("id") Long id) {
        return Formulario.findById(id);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Formulario newForm(Formulario form) {
        form.id = null;
        form.persist();

        return form;
    }
}