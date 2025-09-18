package est.day12Practice.dto;

import est.day12Practice.domain.Delivery;
import est.day12Practice.domain.Order;
import est.day12Practice.domain.Product;
import lombok.Getter;

import java.util.List;

@Getter
public class DetailedOrderResponse {
    private Long orderId;
    private List<ProductDto> products;
    private DeliveryDto delivery;

    public DetailedOrderResponse(Order order) {
        this.orderId = order.getId();
        this.products = order.getProducts().stream().map(ProductDto::new).toList();
        this.delivery = order.getDelivery() != null ? new DeliveryDto(order.getDelivery()) : null;
    }

    @Getter
    public static class ProductDto {
        private String name;
        private int price;
        public ProductDto(Product product) {
            this.name = product.getName();
            this.price = product.getPrice();
        }
    }

    @Getter
    public static class DeliveryDto {
        private String address;
        private String status;

        public DeliveryDto(Delivery delivery) {
            this.address = delivery.getAddress();
            this.status = delivery.getStatus().toString();
        }
    }

}
