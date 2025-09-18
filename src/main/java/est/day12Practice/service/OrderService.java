package est.day12Practice.service;

import est.day12Practice.domain.Order;
import est.day12Practice.domain.Product;
import est.day12Practice.dto.DetailedOrderResponse;
import est.day12Practice.dto.OrderResponse;
import est.day12Practice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<OrderResponse> findAllOrders() {
        List<Order> orders = orderRepository.findAllWithDeliveryAndProducts();

        return orders.stream()
                .map(order -> new OrderResponse(
                        order.getId(),
                        order.getProducts().stream()
                                .map(Product::getName)
                                .toList(),
                        order.getDelivery() != null ? order.getDelivery().getStatus() : null
                ))
                .toList();
    }

    public List<DetailedOrderResponse> findAllDetailedOrders() {
        List<Order> orders = orderRepository.findAllWithDeliveryAndProducts();;

        return orders.stream().map(DetailedOrderResponse::new).toList();
    }


}
