package est.day12Practice.domain;

import est.day12Practice.domain.enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private LocalDate deliveryDate;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    // 배송-주문 (1:1)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
}
