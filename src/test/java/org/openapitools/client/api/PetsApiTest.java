/*
 * Swagger Petstore
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pet;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.PetsApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for PetsApi
 */
@Ignore
public class PetsApiTest {

    private PetsApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io/v1"))).pets();
    }

    /**
     * Null response
     */
    @Test
    public void shouldSee201AfterCreatePets() {
        api.createPets().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * unexpected error
     */
    @Test
    public void shouldSee0AfterCreatePets() {
        api.createPets().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * A paged array of pets
     */
    @Test
    public void shouldSee200AfterListPets() {
        Integer limit = null;
        api.listPets().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * unexpected error
     */
    @Test
    public void shouldSee0AfterListPets() {
        Integer limit = null;
        api.listPets().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Expected response to a valid request
     */
    @Test
    public void shouldSee200AfterShowPetById() {
        String petId = null;
        api.showPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * unexpected error
     */
    @Test
    public void shouldSee0AfterShowPetById() {
        String petId = null;
        api.showPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}