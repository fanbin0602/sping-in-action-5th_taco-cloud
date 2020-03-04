package me.fanbin.tacocloud.data;


import me.fanbin.tacocloud.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
