package day0719.service;

import day0719.entity.Ware;

public interface WareService {
   Ware getWareByName(String wareName);
   int addWre(Ware w);
   int updateWare(Ware w);
}
