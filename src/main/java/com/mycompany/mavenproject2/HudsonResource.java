/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import com.hudsons.classes.Burger;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author aldairmh
 */
@Path("burgers")
public class HudsonResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HudsonResource
     */
    public HudsonResource() {
    }

    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response getAll() {
        ArrayList<Burger> lista;
        lista = new ArrayList<>();
        Burger b = new Burger();
        b.setId(0);
        b.setName("Clásica");
        b.setPrice(35.00f);
        lista.add(b);
        return Response.status(200).entity(b).build();
        
    }

    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void post(Burger burger) {

    }

    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void put(Burger content) {
    }

    @GET
    @Path("{id}")
    public Burger findById(@PathParam("id") int id) {
        return new Burger();
    }

}
