package com.tkhts.order.bo;

import com.tkhts.order.bo.exception.BOException;
import com.tkhts.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
