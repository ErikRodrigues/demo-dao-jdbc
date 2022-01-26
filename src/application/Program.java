package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("\n=== TEST 3: Seller FindAll");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Seller Insert");
		Seller newSeller = new Seller (null, "Grag", "Greg@gmail.com", new Date(), 400.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo id: " +newSeller.getId());
		
		System.out.println("\n=== TEST 5: Seller Update");
		seller = sellerDao.findById(1);
		seller.setName("Erik Rodrigues");
		sellerDao.update(seller);
		System.out.println("Atualizado!");
		
		
		System.out.println("\n=== TEST 6: Seller Delete");
		System.out.println("Informe um id: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deletado com sucesso!");
		
				
				
		sc.close();
				
	}
}