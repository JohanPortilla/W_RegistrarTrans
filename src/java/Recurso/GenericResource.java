/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recurso;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;

/**
 * REST Web Service
 *
 * @author BOG-A209-E-007
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    String URL;

    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of Recurso.GenericResource
     *
     * @param access
     * 
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@QueryParam("access") String access) {
        Logica l = new Logica();
        String respuesta=l.BlockChain1(access);
       // JsonObjectBuilder jsonObjBuelder = Json.createObjectBuilder();
        //respuesta
       // jsonObjBuelder.add("reply", "Datos Tomados " + access);
       // JsonObject jsonObj = jsonObjBuelder.build();
       return respuesta;
//        return Response.ok(jsonObj.toString()).header("Access-Control-Allow-Origin", "*")
//                .header("Access-Control-Allow-Methods", "POST, GET")
//                .header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-width").build();

    }
     /**
     * Retrieves representation of an instance of Recurso.GenericResource
     *
     * @param respuesta
     * @return an instance of java.lang.String
     */
    
    @GET
    @Produces()
    public String Registro(@QueryParam("Respuesta") String respuesta) {
        Logica l = new Logica();
        String Respuesta=l.BlockChain2(respuesta);       
       return Respuesta;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
