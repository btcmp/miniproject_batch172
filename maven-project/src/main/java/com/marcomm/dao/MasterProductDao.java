package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterProduct;

public interface MasterProductDao {
public void save(MasterProduct masterProduct);
public List<MasterProduct> getAll(MasterProduct masterProduct);
public String getCodeById();
public void delete(MasterProduct masterProduct);
public void update(MasterProduct masterProduct);
}
