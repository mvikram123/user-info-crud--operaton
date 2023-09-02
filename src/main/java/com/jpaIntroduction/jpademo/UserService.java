package com.jpaIntroduction.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
@Autowired
UserRepository userRepository;
    public String addUser(User user){

         userRepository.save(user);
         return "user added successfully";

    }

    public List<User> getUsers(){

        return userRepository.findAll();

    }
    public User getUser(int id){

        return userRepository.findById(id).get();
    }

    public String deleteUser(int id){
      //  id=userRepository.getId(user)
       userRepository.deleteById(id);
       return "user deleted successfully";
    }


    public User updateUser(int id,User updatedUser) throws UserNotFoundException {
        User existingUser=userRepository.findById(id).get();

        if(existingUser==null)

       {

           throw new UserNotFoundException("user not found with Id"+ id);
       }
        existingUser.setName(updatedUser.getName());

       existingUser.setEmailId(updatedUser.getEmailId());
        existingUser.setMob(updatedUser.getMob());


        System.out.println("user updated successfully =" +id);
       User savedUser= userRepository.save(existingUser);
       return savedUser;

    }
}
