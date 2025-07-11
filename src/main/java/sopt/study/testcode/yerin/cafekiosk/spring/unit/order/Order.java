package sopt.study.testcode.yerin.cafekiosk.spring.unit.order;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import sopt.study.testcode.yerin.cafekiosk.spring.unit.beverage.Beverage;

@Getter
@RequiredArgsConstructor
public class Order {
    private final LocalDateTime orderDateTime;
    private final List<Beverage> beverages;
}
