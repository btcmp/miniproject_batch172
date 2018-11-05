package com.marcomm.model;

import java.util.List;

public class FormTransaksiDesign {

	private TransaksiDesign header;
	private List<TransaksiDesignItem> details;
	
	public TransaksiDesign getHeader() {
		return header;
	}
	public void setHeader(TransaksiDesign header) {
		this.header = header;
	}
	public List<TransaksiDesignItem> getDetails() {
		return details;
	}
	public void setDetails(List<TransaksiDesignItem> details) {
		this.details = details;
	}
	
}
