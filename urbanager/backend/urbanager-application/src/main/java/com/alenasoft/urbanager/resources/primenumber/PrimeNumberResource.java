package com.alenasoft.urbanager.resources.primenumber;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberService;
import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("arithmetic")
@Api(value = "Arithmetic", description = "Arithmetic Operations")
public class PrimeNumberResource {

    @Inject
    private PrimeNumberService service;
}

