package com.liteinventory.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="balai")
public class Balai {

	@Id
	@Column(name="KD_BALAI", nullable=false, length=5)
	private String kdBalai;
	@Column(name="ID_PERUSAHAAN", nullable=false, length=12)
	private String idPerusahaan;
	@Column(name="NAMA", nullable=false, length=60)
	private String nama;
	
	public Balai() {		
	}
	
	public Balai(String kdBalai, String idPerusahaan, String nama) {
		this.kdBalai = kdBalai;
		this.idPerusahaan = idPerusahaan;
		this.nama = nama;
	}
	
	/**
	 * @return the kdBalai
	 */
	public String getKdBalai() {
		return kdBalai;
	}
	/**
	 * @param kdBalai the kdBalai to set
	 */
	public void setKdBalai(String kdBalai) {
		this.kdBalai = kdBalai;
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
