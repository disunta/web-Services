package org.krishnaleela.web.employeeservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/employees")
public class EmpResource {
	EmpServices service=new EmpServices();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeList getIt() {
        return service.getJsonList();
    }
}
