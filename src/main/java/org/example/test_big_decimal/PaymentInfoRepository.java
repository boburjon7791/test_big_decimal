package org.example.test_big_decimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, UUID> {
}
