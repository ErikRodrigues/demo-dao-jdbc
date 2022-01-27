package application;

import model.dao.DaoFactory;
import model.dao.DerpatmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		DerpatmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Vamos tester o findbyid do Seller");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Novo departamento inserido. Id: " +newDepartment.getId());
		
	

	}

}
