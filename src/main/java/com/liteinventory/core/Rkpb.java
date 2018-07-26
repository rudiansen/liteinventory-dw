package com.liteinventory.core;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="rkpb")
public class Rkpb {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="doc_id_seq")
	@SequenceGenerator(name="doc_id_seq", sequenceName="doc_id_seq")
	private long idRkpb;
	@Column(name="ID_PERUSAHAAN", nullable=false, length=12)
	private String idPerusahaan;
	@Column(name="OPD", nullable=true, length=50)
	private String opd;
	@Column(name="CABANG", nullable=true, length=50)
	private String cabang;
	@Column(name="BALAI", nullable=true, length=50)
	private String balai;
	@Column(name="UNIT", nullable=true, length=50)
	private String unit;
	@Column(name="KD_PROVINSI", nullable=true, length=2)
	private String kdProvinsi;
	@Column(name="TAHUN_ANGGARAN_1", nullable=true, length=4)
	private String tahunAnggaran1;
	@Column(name="TAHUN_ANGGARAN_2", nullable=true, length=4)
	private String tahunAnggaran2;
	@Temporal(value=TemporalType.DATE)
	@Column(name="SERVER_DATETIME", nullable=false)
	private Timestamp serverDatetime;	
	
	public Rkpb() {		
	}
		
	public Rkpb(String idPerusahaan, String opd, String cabang, String balai, String unit,
			String kdProvinsi, String tahunAnggaran1, String tahunAnggaran2, Timestamp serverDatetime) {		
		this.idPerusahaan = idPerusahaan;
		this.opd = opd;
		this.cabang = cabang;
		this.balai = balai;
		this.unit = unit;
		this.kdProvinsi = kdProvinsi;
		this.tahunAnggaran1 = tahunAnggaran1;
		this.tahunAnggaran2 = tahunAnggaran2;
		this.serverDatetime = serverDatetime;
	}

	/**
	 * @return the idRkpb
	 */
	public long getIdRkpb() {
		return idRkpb;
	}
	/**
	 * @param idRkpb the idRkpb to set
	 */
	public void setIdRkpb(long idRkpb) {
		this.idRkpb = idRkpb;
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
	 * @return the opd
	 */
	public String getOpd() {
		return opd;
	}
	/**
	 * @param opd the opd to set
	 */
	public void setOpd(String opd) {
		this.opd = opd;
	}
	/**
	 * @return the cabang
	 */
	public String getCabang() {
		return cabang;
	}
	/**
	 * @param cabang the cabang to set
	 */
	public void setCabang(String cabang) {
		this.cabang = cabang;
	}
	/**
	 * @return the balai
	 */
	public String getBalai() {
		return balai;
	}
	/**
	 * @param balai the balai to set
	 */
	public void setBalai(String balai) {
		this.balai = balai;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
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
	 * @return the tahunAnggaran1
	 */
	public String getTahunAnggaran1() {
		return tahunAnggaran1;
	}
	/**
	 * @param tahunAnggaran1 the tahunAnggaran1 to set
	 */
	public void setTahunAnggaran1(String tahunAnggaran1) {
		this.tahunAnggaran1 = tahunAnggaran1;
	}
	/**
	 * @return the tahunAnggaran2
	 */
	public String getTahunAnggaran2() {
		return tahunAnggaran2;
	}
	/**
	 * @param tahunAnggaran2 the tahunAnggaran2 to set
	 */
	public void setTahunAnggaran2(String tahunAnggaran2) {
		this.tahunAnggaran2 = tahunAnggaran2;
	}
	/**
	 * @return the serverDatetime
	 */
	public Timestamp getServerDatetime() {
		return serverDatetime;
	}
	/**
	 * @param serverDatetime the serverDatetime to set
	 */
	public void setServerDatetime(Timestamp serverDatetime) {
		this.serverDatetime = serverDatetime;
	}
}
