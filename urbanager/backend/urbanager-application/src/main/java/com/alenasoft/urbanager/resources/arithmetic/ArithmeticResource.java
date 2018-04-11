package com.alenasoft.urbanager.resources.arithmetic;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.arithmetic.service.ArithmeticService;
import com.alenasoft.urbanager.resources.example.ExampleResource;
import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("arithmetic")
@Api(value = "Arithmetic", description = "Arithmetic Operations")
public class ArithmeticResource {

    @Inject
    private ArithmeticService service;

    @GET
    @UnitOfWork
    @Path("{id}")
    @ApiOperation(value = "Get an Example with id", response = Example.class)
    @ApiResponse(code = 200, message = "Simple 200 Response with an Example JSON object")
    @Produces(MediaType.APPLICATION_JSON)
    public Result getResult(@PathParam("id") long id) {
        return this.service.getById(id);
    }

    @GET
    @UnitOfWork
    @Path("{num1}/{num2}")
    public Response sumNumbers(@PathParam("num1") int num1,
                               @PathParam("num2") int num2) {
        long idCreated = this.service.sum(num1, num2);
        return Response
                .created(URI.create("/api/arithmetic/" + idCreated))
                .build();
    }
}

