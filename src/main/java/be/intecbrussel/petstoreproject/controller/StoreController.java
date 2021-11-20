package be.intecbrussel.petstoreproject.controller;

public class StoreController {
    /*@Autowired
    PetService petService;
    @Autowired
    OrderService orderService;

    @GetMapping("/inventory")
    public ResponseEntity<List<Pet>> getAllPets(){
        List<Pet> pets = .findAll();
        return ResponseEntity.ok(pets);
    }

    @PostMapping("/order")
    public ResponseEntity<ApiResponse> postOrder(@RequestBody Order order){
    }

    @GetMapping("/order/{id}")
    public ResponseEntity getOrderById(@PathVariable("id") Long id) {
        if (id == null || id == 0) {
            return ResponseEntity.badRequest().body(new ApiResponse(404, "not found", " Order not found."));
        } else {
            Optional<Order> byId = orderDAO.findById(id);
            if (byId.isPresent())
                return ResponseEntity.ok(byId.get());
            else {
                return ResponseEntity.badRequest().body(new ApiResponse(404, "not found", " Order not found."));
            }
        }
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity deleteOrderById(@PathVariable("id") Long id) {
        if (id == null || id == 0) {
            return ResponseEntity.badRequest().body(new ApiResponse(404, "not found", " Order not found."));
        } else {
            orderService.deleteById(id);
            return ResponseEntity.ok(new ApiResponse(200,"OK","Order deleted from the database"));
        }
    }*/
}
