package com.jordandusenbury.That.s.Just.Gravy.myservices;

import com.jordandusenbury.That.s.Just.Gravy.entity.User;
import com.jordandusenbury.That.s.Just.Gravy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(long id, User user) {
        Optional<User> userData = userRepository.findById(id);

        if (userData.isPresent()) {
            User _user = userData.get();
            _user.setPassword(user.getPassword());
            _user.setEmail(user.getEmail());
            userRepository.save(_user);
        }
    }

    /*@Override
    @Transactional
    public UserDTO findUserByEmail(String email) {

        UserDTO userOptional = userRepository.findUserByEmail(email);

        if(userOptional.isPresent()) {

            ModelMapper modelMapper = new ModelMapper();
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

            UserDTO userDTO = modelMapper.map(userOptional.get(), UserDTO.class);

            return userDTO;
        }
        else
            throw new RuntimeException("User does not exist");

    }*/

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    public ResponseEntity<List<User>> findByPublished() {
        try {
            List<User> users = userRepository.findByValidated(true);
            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}