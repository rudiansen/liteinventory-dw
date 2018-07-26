package com.liteinventory.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wilayah")
public class Wilayah {

	@Id
	@Column(name="KD_WILAYAH", nullable=false, length=5)
	private String kdWilayah;
	@Column(name="ID_PERUSAHAAN", nullable=false, length=12)
	private String idPerusahaan;
	@Column(name="NAMA", nullable=false, length=60)
	private String nama;
	
	public Wilayah() {		
	}
	
	public Wilayah(String kdWilayah, String idPerusahaan, String nama) {
		this.kdWilayah = kdWilayah;
		this.idPerusahaan = idPerusahaan;
		this.nama = nama;
	}
	
	/**
	 * @return the kdWilayah
	 */
	public String getKdWilayah() {
		return kdWilayah;
	}
	/**
	 * @param kdWilayah the kdWilayah to set
	 */
	public void setKdWilayah(String kdWilayah) {
		this.kdWilayah = kdWilayah;
	}
	/**
	 * @return the idPerusahaan
	 */
	public String getIdPerusahaan() {
		return idPerusahaan;
	}
	/**
	 * @param idPerusahaan the idPerusahaan to set
	 */
	public void setIdPerusahaan(String idPerusahaan) {
		this.idPerusahaan = idPerusahaan;
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
