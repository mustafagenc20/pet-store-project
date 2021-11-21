package be.intecbrussel.petstoreproject.controller;

import be.intecbrussel.petstoreproject.models.ApiResponse;
import be.intecbrussel.petstoreproject.models.entity.Order;
import be.intecbrussel.petstoreproject.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/inventory")
    public ResponseEntity<List<Order>> findAllByStatus(String status){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.findAllByStatus(status));
    }

    @PostMapping("/order")
    public ResponseEntity<ApiResponse> postOrder(@RequestBody Order order){
        return ResponseEntity.badRequest().body(new ApiResponse(400,
                "Invalid order",
                "Invalid order"));
    }

    @GetMapping("/order/{id}")
    public ResponseEntity getOrderById(@PathVariable("id") Long id) {
        return ResponseEntity.badRequest().body(new ApiResponse(400,
                    "Invalid ID supplied",
                    "Invalid ID supplied"));
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity deleteOrderById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(new ApiResponse(200,"OK","Order deleted"));
    }
}
