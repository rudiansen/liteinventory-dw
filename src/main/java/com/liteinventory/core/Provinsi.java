package com.liteinventory.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provinsi")
public class Provinsi implements Serializable {

	private static final long serialVersionUID = 112311111L;
	
	@Id
	@Column(name="KD_PROVINSI", nullable=false, length=2)
	private String kdProvinsi;	
	@Column(name="NAMA", nullable=false, length=30)
	private String nama;
	
	public Provinsi() {		
	}
	
	public Provinsi(String kdProvinsi, String nama) {
		this.kdProvinsi = kdProvinsi;		
		this.nama = nama;
	}
	
	/**
	 * @return the kdProvinsi
	 */
	public String getKdProvinsi() {
		return kdProvinsi;
	}
	/**
	 * @param kdProvinsi the kdProvinsi to set
	 */
	public void setKdProvinsi(String kdProvinsi) {
		this.kdProvinsi = kdProvinsi;
	}	
	/**
	 * @return the nama
	 */
	public String getNama() {
		return nama;
	}
	/**
	 * @param nama the nama to set
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}
}
