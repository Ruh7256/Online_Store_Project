package com.task.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.task.bean.ProductBean;
import com.task.connect.DBConnect;

public class UpdateProductDAO {
public int updateProduct(ProductBean pbean) {
	int row=0;
	try {
		String query="update product set PRODUCT_PRICE=?,PRODUCT_QUANTITY=? where PRODUCT_CODE=?";
		Connection con = DBConnect.connect();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, pbean.getpPrice());
		pstmt.setInt(2, pbean.getpQty());
		pstmt.setString(3, pbean.getpCode());
		
		row = pstmt.executeUpdate();


	}catch(Exception e) {
		e.printStackTrace();

	}
	return row;
	
}
}
