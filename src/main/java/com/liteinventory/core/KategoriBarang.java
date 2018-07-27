package com.liteinventory.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kategori_barang")
public class KategoriBarang implements Serializable {
	
	private static final long serialVersionUID = 113281872188L;

	@Id
	@Column(name="KD_KATEGORI", nullable=false, length=5)
	private String kdKategori;
	@Column(name="NAMA", nullable=false, length=60)
	private String nama;
	
	public KategoriBarang() {		
	}
		
	public KategoriBarang(String kdKategori, String nama) {		
		this.kdKategori = kdKategori;
		this.nama = nama;
	}

	public String getKdKategori() {
		return kdKategori;
	}
	public void setKdKategori(String kdKategori) {
		this.kdKategori = kdKategori;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}	
	
}
