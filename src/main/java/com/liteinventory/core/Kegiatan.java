package com.liteinventory.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kegiatan")
public class Kegiatan implements Serializable {

	private static final long serialVersionUID = 112817821881L;
	
	@Id
	@Column(name="KD_KEGIATAN", nullable=false, length=5)
	private String kdKegiatan;
	@Column(name="ID_PERUSAHAAN", nullable=false, length=12)
	private String idPerusahaan;
	@Column(name="NAMA", nullable=false, length=60)
	private String nama;
	
	public Kegiatan() {		
	}
	
	public Kegiatan(String kdKegiatan, String idPerusahaan, String nama) {
		this.kdKegiatan = kdKegiatan;
		this.idPerusahaan = idPerusahaan;
		this.nama = nama;
	}
	
	/**
	 * @return the kdKegiatan
	 */
	public String getKdKegiatan() {
		return kdKegiatan;
	}
	/**
	 * @param kdKegiatan the kdKegiatan to set
	 */
	public void setKdKegiatan(String kdKegiatan) {
		this.kdKegiatan = kdKegiatan;
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
