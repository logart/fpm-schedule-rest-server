package edu.dnu.fpm.schedule.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Artem Loginov (logart) logart2007@gmail.com
 *         Date: 8/9/12
 *         Time: 8:22 PM
 */
//@Path("/schedules")
@Path("/")
public class SchedulesController {
//    @GET
//    public ScheduleTable[] getSchedules(){
//        throw new RuntimeException();
////        return new ScheduleTable[0];
//    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello(){
//        throw new RuntimeException();
        return "Hello";
    }
}
