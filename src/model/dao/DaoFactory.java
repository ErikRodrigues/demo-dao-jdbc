package model.dao;

import db.DB;
import model.dao.impl.DerpatmentDaoJDB;
import model.dao.impl.SellerDaoJDBC;


public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DerpatmentDao createDepartmentDao ( ) {
		return new DerpatmentDaoJDB(DB.getConnection());
	}


}