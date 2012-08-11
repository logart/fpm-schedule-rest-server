package edu.dnu.fpm.schedule.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.dnu.fpm.schedule.domain.ScheduleTable;
import edu.dnu.fpm.schedule.rest.repository.ScheduleRepository;

/**
 * @author Artem Loginov (logart) logart2007@gmail.com
 *         Date: 8/9/12
 *         Time: 8:22 PM
 */
@Path("/schedules")
public class SchedulesController {

    static ScheduleRepository repository = new ScheduleRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public ScheduleTable[] getSchedules() {
        return repository.getAll();
    }

    @GET
    @Path("{groupName}")
    @Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
    public ScheduleTable getSchedule(@PathParam("groupName") String groupName) {
        return repository.get(groupName);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
    public Response putSchedule(ScheduleTable schedule) {
        repository.put(schedule);
        return Response.status(200).build();
    }
}
