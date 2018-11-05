package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiDesignItem;

public interface TransaksiDesignItemDao {
	public void save(TransaksiDesignItem transaksiDesignItem);
	public List<TransaksiDesignItem> getAll();
}
