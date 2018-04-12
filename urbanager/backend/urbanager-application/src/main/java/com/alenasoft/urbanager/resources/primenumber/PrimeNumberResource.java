package com.alenasoft.urbanager.resources.primenumber;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberService;
import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberServiceImpl;
import io.dropwizard.hibernate.UnitOfWork;
import io.dropwizard.jersey.params.LongParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("primo")
@Api(value = "primo", description = "Prime Numbers")
public class PrimeNumberResource {

    @Inject
    private PrimeNumberServiceImpl service;

    @GET
    @Path("/{numero}")
    @ApiOperation(value = "returns OK if number is prime, return FAIL if it is not", response = Example.class)
    @ApiResponse(code = 200, message = "Simple 200 Response")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIsPrime(
            @ApiParam(value = "Number to be evaluated", required = true)
            @PathParam("numero") int number) {
        return Response.ok(this.service.eval(number)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNPrimeNumbers(@QueryParam("limite") int number){
        return Response.ok(this.service.getNPrimeNumbers(number)).build();
    }
}

