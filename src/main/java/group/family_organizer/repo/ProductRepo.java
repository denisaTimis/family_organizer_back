package group.family_organizer.repo;

import group.family_organizer.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    Product findByText(String text);
    List<Product> findByType(String type);
    boolean deleteByText(String text);
    List<Product> findAll();
}
