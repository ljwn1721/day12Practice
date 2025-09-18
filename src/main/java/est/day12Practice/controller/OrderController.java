package est.day12Practice.controller;

import est.day12Practice.dto.DetailedOrderResponse;
import est.day12Practice.dto.OrderResponse;
import est.day12Practice.repository.OrderRepository;
import est.day12Practice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    /**
     * 주문 목록 조회 API
     * - 주문 ID, 상품명 리스트, 배송 상태만 간단히 반환
     * GET /api/orders
     */
    @GetMapping
    public ResponseEntity<List<OrderResponse>> getOrders() {
        List<OrderResponse> orders = orderService.findAllOrders();
        return ResponseEntity.ok(orders);
    }

    /**
     * 주문 상세 조회 API
     * - 주문 ID, 상품 상세(name, price), 배송 정보(address, status) 포함
     * GET /api/orders/details
     */
    @GetMapping("/details")
    public ResponseEntity<List<DetailedOrderResponse>> getDetailedOrders() {
        List<DetailedOrderResponse> detailedOrders = orderService.findAllDetailedOrders();
        return ResponseEntity.ok(detailedOrders);
    }

}
