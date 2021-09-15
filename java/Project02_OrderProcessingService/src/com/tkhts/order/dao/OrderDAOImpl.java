package com.tkhts.order.dao;

import java.sql.SQLException;

import com.tkhts.order.dto.Order;

// incomplete code
public class OrderDAOImpl implements OrderDAO {

	@Override
	public int create(Order order) throws SQLException {
		System.out.println("In create method");
		// to insert data db
		if(true){
			throw new NullPointerException();
		}
		return 0;
	}

	@Override
	public Order read(int id) throws SQLException {
		System.out.println("in read method");
		if(true){
			throw new NullPointerException();
		}
		return null;
	}

	@Override
	public int update(Order order) throws SQLException {
		System.out.println("in update method");
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		System.out.println("in delete");
		return 0;
	}

}
