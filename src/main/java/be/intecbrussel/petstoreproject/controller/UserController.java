package be.intecbrussel.petstoreproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
//    @Autowired
//    UserDAO userDAO;
//
//    @PostMapping
//    public ResponseEntity<ApiResponse> postUser(@RequestBody User user) {
//        if (user.getId() != null && user.getId() > 0) {
//            return ResponseEntity.badRequest().body(new ApiResponse(404, "Not found", "User not found."));
//        } else {
//            userDAO.save(user);
//            return ResponseEntity.ok(new ApiResponse(200, "OK", "User saved to the database"));
//        }
//    }
}
