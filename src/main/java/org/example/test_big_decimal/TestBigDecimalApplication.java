package org.example.test_big_decimal;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class TestBigDecimalApplication {
    private final PaymentInfoRepository paymentInfoRepository;
    public static void main(String[] args) {
        SpringApplication.run(TestBigDecimalApplication.class, args);
    }
    @PostConstruct
    public void init(){
        paymentInfoRepository.saveAllAndFlush(
                List.of(
                        new PaymentInfo(null, BigDecimal.valueOf(100), BigDecimal.valueOf(200), BigDecimal.valueOf(1), BigDecimal.valueOf(51), ZonedDateTime.now()),
                        new PaymentInfo(null, BigDecimal.valueOf(100), BigDecimal.valueOf(200), BigDecimal.valueOf(6), BigDecimal.valueOf(58), ZonedDateTime.now()),
                        new PaymentInfo(null, BigDecimal.valueOf(1080), BigDecimal.valueOf(200), BigDecimal.valueOf(8), BigDecimal.valueOf(50), ZonedDateTime.now()),
                        new PaymentInfo(null, BigDecimal.valueOf(1050), BigDecimal.valueOf(200), BigDecimal.valueOf(10.55), BigDecimal.valueOf(50), ZonedDateTime.now())
                )
        );
    }
}
