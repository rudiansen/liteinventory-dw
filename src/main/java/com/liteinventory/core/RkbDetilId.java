package com.liteinventory.core;

import javax.persistence.Embeddable;

@Embeddable
public class RkbDetilId {
		
	private long idRkb;
	private int noItem;
	
	public RkbDetilId() {		
	}
		
	public RkbDetilId(long idRkb, int noItem) {
		this.idRkb = idRkb;
		this.noItem = noItem;
	}

	public long getIdRkb() {
		return idRkb;
	}
	public void setIdRkb(long idRkb) {
		this.idRkb = idRkb;
	}
	public int getNoItem() {
		return noItem;
	}
	public void setNoItem(int noItem) {
		this.noItem = noItem;
	}

}
