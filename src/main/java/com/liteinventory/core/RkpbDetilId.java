package com.liteinventory.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RkpbDetilId implements Serializable {

	private static final long serialVersionUID = 112125634531L;
	
	@Column(name="ID_RKPB", nullable=false)
	private long idRkpb;
	@Column(name="NO_ITEM", nullable=false)
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
