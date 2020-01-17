package com.revature.dao;

import java.util.List;

import com.revature.pojo.Pet;

public interface PetDAO {
	
	public void createPet(Pet pet);
	
	public Pet readPet(int id);
	
	public void updatePet(Pet pet, int id);
	
	public void deletePet(Pet pet);
	
	public List<Pet> readAllPets();
	
	public List<Pet> readPetsByType(String type);

}
