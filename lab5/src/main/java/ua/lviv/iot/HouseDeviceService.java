package ua.lviv.iot;

import javax.inject.Inject;
import javax.persistence.Id;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/houseDevice")
public class HouseDeviceService {

    @Inject
    private HouseManager manager;

    //private HouseDevice houseDeviceObj = new Dishwasher(69,"Deviceeee1", "Ichhhh", 1200, 3, 12.5);
    //private HouseDevice getHouseDeviceObj2 = new ElectricStove(128,"Device2", "yyyyyy", 1300, 4, false);

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public HouseDevice getHouseDevice(@PathParam("id") Integer id) {
        return manager.getHouseDevice(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createHouseDevice(HouseDevice houseDevice) {
        //houseDeviceMap.put(id, houseDeviceObj);
        manager.addHouseDevice(houseDevice);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteHouseDevice(@PathParam("id") Integer id) {
        manager.deleteHouseDevice(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateHouseDevice(HouseDevice houseDevice) {
        //houseDeviceMap.put(id, getHouseDeviceObj2);
        manager.updateHouseDevice(houseDevice);
        return Response.status(200).entity("Good").build();
    }
}
