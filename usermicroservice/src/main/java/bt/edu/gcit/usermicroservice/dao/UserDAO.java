package bt.edu.gcit.usermicroservice.dao;

import java.util.List;
import java.util.Optional;

import bt.edu.gcit.usermicroservice.entity.User;

public interface UserDAO{
    
 User save(User user);
 List<User> findAll();
 Optional<User> findById(Long id);
 void deleteById(int theId);
 User update(User user);
 User findByEmail(String email);

 User findByID(int theId);

 void updateUserEnabledStatus(int id, boolean enabled);
}
