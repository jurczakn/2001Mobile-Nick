package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.Pet;
import com.revature.util.ConnectionFactory;

public class PetDAOPostgres implements PetDAO {

	@Override
	public void createPet(Pet pet) {
		String sql = "insert into pet (name, type) values('" + pet.getName() + "', '" + pet.getType() + "')";
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	@Override
	public Pet readPet(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePet(Pet pet, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePet(Pet pet) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pet> readAllPets() {
		
		String sql = "select * from pet";
		
		Connection conn = ConnectionFactory.getConnection();
		
		List<Pet> petList = new ArrayList<Pet>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
				petList.add(new Pet(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return petList;
	}

	@Override
	public List<Pet> readPetsByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
