package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiSouvenir;
import com.marcomm.model.TransaksiSouvenirItem;

public interface TransaksiSouvenirItemDao {
	
	public void save(TransaksiSouvenirItem transaksiSouvenirItem);

	public TransaksiSouvenirItem getSouvenirItemById(int id);
	
	
	public void updateSettlement(TransaksiSouvenirItem transaksiSouvenirItem);
	
	
	
	/*GET ITEM PUNYA MAMAD*/
	public List<TransaksiSouvenirItem> getItemBySouvenir(TransaksiSouvenir transaksiSouvenir);
	
	/*UPDATE MAMAD*/
	public void update(TransaksiSouvenirItem itemLama);


}
