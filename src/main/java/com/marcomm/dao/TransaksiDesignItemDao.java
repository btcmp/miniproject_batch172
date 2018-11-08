package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiDesign;
import com.marcomm.model.TransaksiDesignItem;

public interface TransaksiDesignItemDao {
	public void save(TransaksiDesignItem transaksiDesignItem);
	public List<TransaksiDesignItem> getAll();
	public TransaksiDesignItem getById(int id);
	public List<TransaksiDesignItem> getItemByDesign(TransaksiDesign transaksiDesign);
}
