package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: Vamos tester o findbyid do Seller");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Vamos tester o findbyid do Department");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.FindByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
		
	}
}