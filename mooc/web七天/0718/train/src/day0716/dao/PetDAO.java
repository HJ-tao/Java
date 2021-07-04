package day0716.dao;

import java.util.List;
import java.util.Map;

import day0716.entity.Pet;

public interface PetDAO {
    List<Pet> queryAllPets();
    Pet getPetById(int pId);
    int addPet(Pet p);
    int addPetType(String pType); //单独增加宠物类型
    String getAllPType();  //String类中的split方法可以将对应的String分割成字符串数组
    Map<Integer, String> getPType(); 

}
