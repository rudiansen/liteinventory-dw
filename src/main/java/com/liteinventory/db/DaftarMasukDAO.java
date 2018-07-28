package com.liteinventory.db;

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
}
