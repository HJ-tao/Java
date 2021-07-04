package day0719.service.impl;

import day0719.dao.WareDAO;
import day0719.dao.impl.WareDAOImpl;
import day0719.entity.Ware;
import day0719.service.WareService;

public class WareServiceImple implements WareService {
    private WareDAO dao;
   public WareServiceImple(){
	   this.dao = new WareDAOImpl();
   }
	public Ware getWareByName(String wareName) {
		
		return dao.getWareByName(wareName);
	}

	public int addWre(Ware w) {
		// TODO Auto-generated method stub
		return dao.addWre(w);
	}

	public int updateWare(Ware w) {
		// TODO Auto-generated method stub
		return dao.updateWare(w);
	}

}
