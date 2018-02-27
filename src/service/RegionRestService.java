package service;

import dao.RegionDao;
import domain.Region;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("region")
public class RegionRestService {

    @Inject
    protected RegionDao regionDao;

    @GET
    @Produces("text/plain")
    public String general(){
        return "Oh hi mom";
    }

    @GET
    @Path("{id}")
    @Produces("application/text")
    public String findRegion(
            @PathParam("id") final int id
    ) {
        return regionDao.find(id)
                .map(entity -> entity.getId().toString())
                .orElse("not found");
    }
}
