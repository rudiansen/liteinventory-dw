package com.liteinventory.resources;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.liteinventory.core.DaftarMasuk;
import com.liteinventory.db.DaftarMasukDAO;

import io.dropwizard.hibernate.UnitOfWork;

@Path("/daftarmasuk")
@Produces(MediaType.APPLICATION_JSON)
public class DaftarMasukResource {
	
	private final DaftarMasukDAO dmDAO;

	public DaftarMasukResource(DaftarMasukDAO dmDAO) {
		this.dmDAO = dmDAO;
	}

	@POST
	@UnitOfWork
	public DaftarMasuk create(DaftarMasuk daftarMasuk) {
		return dmDAO.create(daftarMasuk);
	}
	
	@GET
	@UnitOfWork
	public List<DaftarMasuk> listDaftarMasuk() {
		return dmDAO.findAll();
	}
	
	@GET
	@Path("/{id}")
	@UnitOfWork
	public Optional<DaftarMasuk> findById(long id) {
		return dmDAO.findById(id);
	}
	
	@DELETE
	@Path("/{id}")
	@UnitOfWork
	public Response deleteById(long id) {
		dmDAO.delete(id);
		
		return Response.noContent().build();
	}
}
