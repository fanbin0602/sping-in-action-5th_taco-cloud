package me.fanbin.tacocloud.data;


import me.fanbin.tacocloud.Order;

public interface OrderRepository {

  Order save(Order order);
  
}
