package com.liteinventory.db;

import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;

import com.liteinventory.core.DaftarMasuk;

import io.dropwizard.hibernate.AbstractDAO;

public class DaftarMasukDAO extends AbstractDAO<DaftarMasuk> {

	public DaftarMasukDAO(SessionFactory sessionFactory) {
		super(sessionFactory);		
	}
	
	public DaftarMasuk create(DaftarMasuk daftarMasuk) {
		return persist(daftarMasuk);
	}
	
	public Optional<DaftarMasuk> findById(long id) {
		return Optional.ofNullable(get(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<DaftarMasuk> findAll() {
		return list(namedQuery("com.liteinventory.core.DaftarMasuk.findAll"));
	}
	
	public void delete(long id) {
		Optional<DaftarMasuk> dm = findById(id);
		
		if(dm.isPresent()) {
			currentSession().delete(dm);
		}		
	}
	
}

