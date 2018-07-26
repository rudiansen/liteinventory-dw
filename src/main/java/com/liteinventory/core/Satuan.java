package com.liteinventory.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="satuan")
public class Satuan {

	@Id
	@Column(name="KD_SATUAN", nullable=false, length=3)
	private String kdSatuan;	
	@Column(name="NAMA", nullable=false, length=20)
	private String nama;
	
	public Satuan() {		
	}
	
	public Satuan(String kdSatuan, String nama) {
		this.kdSatuan = kdSatuan;		
		this.nama = nama;
	}
	
	/**
	 * @return the kdSatuan
	 */
	public String getKdSatuan() {
		return kdSatuan;
	}
	/**
	 * @param kdSatuan the kdSatuan to set
	 */
	public void setKdSatuan(String kdSatuan) {
		this.kdSatuan = kdSatuan;
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
