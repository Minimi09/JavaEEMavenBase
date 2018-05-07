package mx.com.cinepolis.schedule.rest;

import mx.com.cinepolis.scheduler.commons.to.*;
import mx.com.cinepolis.scheduler.facade.CatalogFacadeEJB;
import mx.com.cinepolis.scheduler.facade.GitHubFacadeEJB;
import mx.com.cinepolis.scheduler.facade.UserExamFacadeEJB;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

/**
 * @author jrodriguez
 */
@Path("/catalog")
public class CatalogRest {

    @EJB
    private CatalogFacadeEJB catalogFacadeEJB;
    @EJB
    private GitHubFacadeEJB gitHubFacadeEJB;
    @EJB
    private UserExamFacadeEJB userExamFacadeEJB;

    @GET
    @Produces("application/json")
    @Path ("/loginUser")
     public Response getUserLogin(@Context UriInfo ui)
    {
        MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
        String login = queryParams.getFirst("usr");
        String pswd = queryParams.getFirst("pwd");
        System.out.println(login);
        UserExamTO userExamTO = userExamFacadeEJB.getUser(login, pswd);
        return Response.ok().entity(userExamTO).build();
    }

    @POST
    @Path ("/addUser")
    @Consumes ("application/json")
    public Response addUserExam (UserExamTO userExamTO){
        UserExamTO userExamTO1 = userExamFacadeEJB.addUser(userExamTO);
        return Response.ok().entity(userExamTO1).build();
    }

    @POST
    @Path ("/dropUser/{user}")
    @Consumes ("application/json")
    public void dropUser (@PathParam("user") String user){
        userExamFacadeEJB.dropUser(user);
        //return Response.ok().entity(userExamTO1).build();
    }

    @POST
    @Path ("/alterUser")
    @Consumes ("application/json")
    public Response alterUser (UserExamTO userExamTO){
        UserExamTO userExamTO1 = userExamFacadeEJB.alterUser(userExamTO);
        return Response.ok().entity(userExamTO1).build();
    }

    @GET
    @Produces("application/json")
    @Path("/allusersexam")
    public Response getAllUsersExam()
    {
        List<UserExamTO> usersList = userExamFacadeEJB.findAllUsers();

        GenericEntity<List<UserExamTO>> entity =
                new GenericEntity<List<UserExamTO>>(usersList) {};

        return Response.ok().entity(entity).build();
    }

    @GET
    @Produces("application/json")
    @Path("/users/{login}")
    public Response getUser(@PathParam("login") String login)
    {
        GitHubUserTO gitUserTO = gitHubFacadeEJB.getUser(login);
        return Response.ok().entity(gitUserTO).build();
    }

    @GET
    @Produces("application/json")
    @Path("/login")
    public Response getUserQueryParam(@Context UriInfo ui)
    {
        MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
        String login = queryParams.getFirst("usr");
        String pswd = queryParams.getFirst("pwd");

        ValidateUserTO validateUserTO = gitHubFacadeEJB.getUserQueryString(login, pswd);

        return Response.ok().entity(validateUserTO).build();

    }

    /*
    @GET
    @Produces("application/json")
    @Path("/country/{pais}")
    public Response getEstados(@PathParam("pais") String pais)
    {
        List<CatalogTO> stateTOList = catalogFacadeEJB.getListEstados(pais);

        GenericEntity<List<CatalogTO>> entity =
                new GenericEntity<List<CatalogTO>>(stateTOList) {};

        return Response.ok().entity(entity).build();
    }*/

    @GET
    @Produces("application/json")
    @Path("/country")
    public Response getEstados(@Context UriInfo ui)
    {
        MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
        String pais = queryParams.getFirst("pais");

        List<CatalogTO> stateTOList = catalogFacadeEJB.getListEstados(pais);

        GenericEntity<List<CatalogTO>> entity =
                new GenericEntity<List<CatalogTO>>(stateTOList) {};

        return Response.ok().entity(entity).build();
    }

    @POST
    @Path ("/agregar")
    @Consumes ("application/json")
      public Response alta (FormularioTO formularioTO){
        FormularioTO formularioTO1= gitHubFacadeEJB.alta(formularioTO);
        return Response.ok().entity(formularioTO1).build();
    }

    @POST
    @Path ("/create")
    @Consumes ("application/json")
    public Response create (UserTO userTO)
    {
        UserTO userTO1 = catalogFacadeEJB.create(userTO);
        return Response.ok().entity(userTO1).build();

    }

    @GET
    @Produces("application/json")
    @Path("/allusers")
    public Response getAllUsers()
    {
        List<UserTO> usersList = catalogFacadeEJB.getAllUsers();

        GenericEntity<List<UserTO>> entity =
                new GenericEntity<List<UserTO>>(usersList) {};

        return Response.ok().entity(entity).build();
    }

    @GET
    @Produces("application/json")
    @Path("/find/{id}")
    public Response findByLogin(@PathParam("id") long id)
    {
        UserTO user = catalogFacadeEJB.findByLogin(id);
        return Response.ok().entity(user).build();
    }
}