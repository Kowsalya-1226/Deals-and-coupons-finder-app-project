package com.order.orderservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.order.orderservice.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
  List <Order> findByUserId(String userId);
  
  Order findByOrderId(int orderId);

List<Order> findByOrderStatus(String orderStatus);
 


void deleteByOrderId(int orderId);
}
