package org.example.test_big_decimal;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "payment_info")
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private BigDecimal amount;

    private BigDecimal price;

    private BigDecimal tax;

    private BigDecimal quantity;

    private ZonedDateTime createdAt=ZonedDateTime.now();
}
