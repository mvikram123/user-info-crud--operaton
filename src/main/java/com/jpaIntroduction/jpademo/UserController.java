package com.jpaIntroduction.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("add")
    public String addUser(@RequestBody User user){

        return userService.addUser(user);
    }
//    @GetMapping("/get_user/{id}")
//
//    public User getUser(@PathVariable ("id") int id){
//      return  userService.getUser(id);
//
//    }

    @GetMapping("/get_user")

    public User getUser(@RequestParam ("id") int id){
        return  userService.getUser(id);

    }
    @GetMapping("/get_users")
    List<User> getUsers(){
        return userService.getUsers();
    }

    //delete

    @DeleteMapping("/delete_user/{id}")

    public String deleteUser(@PathVariable("id") int id){
        return  userService.deleteUser(id);

    }

    @PutMapping("/update_user")

    public ResponseEntity<User> updateUser(@RequestParam("id") int id, @RequestBody User updatedUser) {

        try {
            User updatedUserInfo = userService.updateUser(id, updatedUser);
            return ResponseEntity.ok(updatedUserInfo);
        } catch (UserNotFoundException err) {
            return ResponseEntity.notFound().build();
        }
    }


}
