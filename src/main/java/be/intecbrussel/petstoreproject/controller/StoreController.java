package be.intecbrussel.petstoreproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {


//    @Autowired
//    PetDAO petDAO;
//    @Autowired
//    OrderDAO orderDAO;
//
//    @GetMapping("/inventory")
//    public ResponseEntity<List<Pet>> getAllPets(){
//        List<Pet> pets = petDAO.findAll();
//        return ResponseEntity.ok(pets);
//    }
//
//    @PostMapping("/order")
//    public ResponseEntity<ApiResponse> postOrder(@RequestBody Order order){
//
//        try {
//            orderDAO.save(order);
//            return ResponseEntity.ok(new ApiResponse(200,"OK", "Order placed successfully"));
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body(new ApiResponse(400,"Bad Request", "Order did not place"));
//
//        }
//
//    }
//
//    @GetMapping("/order/{id}")
//    public ResponseEntity getOrderById(@PathVariable("id") Long id) {
//        if (id == null || id == 0) {
//            return ResponseEntity.badRequest().body(new ApiResponse(404, "not found", " Order not found."));
//        } else {
//            Optional<Order> byId = orderDAO.findById(id);
//            if (byId.isPresent())
//                return ResponseEntity.ok(byId.get());
//            else {
//                return ResponseEntity.badRequest().body(new ApiResponse(404, "not found", " Order not found."));
//            }
//        }
//    }
//
//    @DeleteMapping("/order/{id}")
//    public ResponseEntity deleteOrderById(@PathVariable("id") Long id) {
//        if (id == null || id == 0) {
//            return ResponseEntity.badRequest().body(new ApiResponse(404, "not found", " Order not found."));
//        } else {
//            orderDAO.deleteById(id);
//            return ResponseEntity.ok(new ApiResponse(200,"OK","Order deleted from the database"));
//        }
//    }
}
