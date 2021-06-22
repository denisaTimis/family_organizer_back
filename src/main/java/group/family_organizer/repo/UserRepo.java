package group.family_organizer.repo;

import group.family_organizer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

    User findByUsername(String username);
    List<User> findAll();
}
