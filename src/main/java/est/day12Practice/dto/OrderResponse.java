package est.day12Practice.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import est.day12Practice.domain.enums.DeliveryStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"orderId", "productsNames", "status"})
public class OrderResponse {
    private Long OrderId;
    private List<String> productsNames;
    private DeliveryStatus status;


}
