package com.liteinventory.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perusahaan")
public class Perusahaan {
	
	@Id
	@Column(name="ID_PERUSAHAAN", nullable=false, length=12)
	private String idPerusahaan;
	@Column(name="NAMA", nullable=false, length=60)
	private String nama;
	@Column(name="STATUS", nullable=false, length=1)
	private char status;
	
	public Perusahaan() {		
	}
	
	public Perusahaan (String idPerusahaan, String nama, char status) {
		this.idPerusahaan = idPerusahaan;
		this.nama = nama;
		this.status = status;
	}
	
	public String getIdPerusahaan() {
		return idPerusahaan;
	}
	public void setIdPerusahaan(String idPerusahaan) {
		this.idPerusahaan = idPerusahaan;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	
	

}
