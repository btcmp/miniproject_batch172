package com.marcomm.model;

import java.util.List;

public class FormSouvenir {
	
	private TransaksiSouvenir header;
	private List<TransaksiSouvenirItem> detail;
	
	/*SETTER AND GETTER*/
	public TransaksiSouvenir getHeader() {
		return header;
	}
	public void setHeader(TransaksiSouvenir header) {
		this.header = header;
	}
	public List<TransaksiSouvenirItem> getDetail() {
		return detail;
	}
	public void setDetail(List<TransaksiSouvenirItem> detail) {
		this.detail = detail;
	}
	
}
