package day0716.dao;

import java.util.List;
import java.util.Map;

import day0716.entity.Pet;

public interface PetDAO {
    List<Pet> queryAllPets();
    Pet getPetById(int pId);
    int addPet(Pet p);
    int addPetType(String pType); //�������ӳ�������
    String getAllPType();  //String���е�split�������Խ���Ӧ��String�ָ���ַ�������
    Map<Integer, String> getPType(); 

}
