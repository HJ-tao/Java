package day0719.dao;

import day0719.entity.Ware;

public interface WareDAO {
   Ware getWareByName(String wareName);
   int addWre(Ware w);
   int updateWare(Ware w);
}
