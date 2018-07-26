package com.liteinventory.core;

import javax.persistence.Embeddable;

@Embeddable
public class RkpbDetilId {

	private long idRkpb;
	private int noItem;
	
	public RkpbDetilId() {		
	}
		
	public RkpbDetilId(long idRkpb, int noItem) {
		this.idRkpb = idRkpb;
		this.noItem = noItem;
	}

	public long getIdRkpb() {
		return idRkpb;
	}
	public void setIdRkpb(long idRkpb) {
		this.idRkpb = idRkpb;
	}
	public int getNoItem() {
		return noItem;
	}
	public void setNoItem(int noItem) {
		this.noItem = noItem;
	}
}
