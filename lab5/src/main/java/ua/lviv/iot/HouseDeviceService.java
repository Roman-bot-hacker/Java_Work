package ua.lviv.iot;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/houseDevice")
public class HouseDeviceService {

    private static Map<Integer, HouseDevice> houseDeviceMap = new HashMap<>();
    private HouseDevice houseDeviceObj = new Dishwasher(69,"Deviceeee1", "Ichhhh", 1200, 3, 12.5);
    private HouseDevice getHouseDeviceObj2 = new ElectricStove(128,"Device2", "yyyyyy", 1300, 4, false);

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final HouseDevice getHouseDevice(@PathParam("id") Integer id) {
        return houseDeviceMap.get(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createHouseDevice(@PathParam("id") Integer id,
                                      HouseDevice houseDevice) {
        houseDeviceMap.put(id, houseDeviceObj);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteFruit(@PathParam("id") Integer id) {
        houseDeviceMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateFruit(@PathParam("id") Integer id) {
        houseDeviceMap.put(id, getHouseDeviceObj2);
        return Response.status(200).entity("Good").build();
    }
}
