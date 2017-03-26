package nl.hu.iac.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.hu.iac.service.ServiceProvider;
import nl.hu.iac.service.TrackServiceImpl;

@Path("/list")
public class TrackRestService {

	@GET
	@Path("/mean/{list}")
	@Produces({MediaType.APPLICATION_JSON})
	public String getMean(@PathParam("list") String list) {
		TrackServiceImpl trackServiceImpl = ServiceProvider.getTrackService();
		return trackServiceImpl.getMean(list);
	}
	@GET
	@Path("/variance/{list}")
	@Produces({MediaType.APPLICATION_JSON})
	public String getVariance(@PathParam("list") String list) {
		TrackServiceImpl trackServiceImpl = ServiceProvider.getTrackService();
		return trackServiceImpl.getVariance(list);
	}
	@GET
	@Path("/std/{list}")
	@Produces({MediaType.APPLICATION_JSON})
	public String getStd(@PathParam("list") String list) {
		TrackServiceImpl trackServiceImpl = ServiceProvider.getTrackService();
		return trackServiceImpl.getStd(list);
	}



}
