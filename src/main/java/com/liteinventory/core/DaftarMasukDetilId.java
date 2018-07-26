package com.liteinventory.core;

import javax.persistence.Embeddable;

@Embeddable
public class DaftarMasukDetilId {

	private long idMasuk;
	private int noItem;
	
	public DaftarMasukDetilId() {		
	}

	public DaftarMasukDetilId(long idMasuk, int noItem) {
		this.idMasuk = idMasuk;
		this.noItem = noItem;
	}

	/**
	 * @return the idMasuk
	 */
	public long getIdMasuk() {
		return idMasuk;
	}

	/**
	 * @param idMasuk the idMasuk to set
	 */
	public void setIdMasuk(long idMasuk) {
		this.idMasuk = idMasuk;
	}

	/**
	 * @return the noItem
	 */
	public int getNoItem() {
		return noItem;
	}

	/**
	 * @param noItem the noItem to set
	 */
	public void setNoItem(int noItem) {
		this.noItem = noItem;
	}
	
}
