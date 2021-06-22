package group.family_organizer.controller;
import group.family_organizer.entity.*;
import group.family_organizer.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
public class Controller {
    UserRepo userRepo;
    ProductRepo productRepo;

    @Autowired
    public Controller(UserRepo userRepo, ProductRepo productRepo) {
        this.userRepo = userRepo;
        this.productRepo = productRepo;
        System.out.println("Creating user");
        User user = new User("Ana", "Maria", "12.09.2000", "ana.margia@gmail.com", "0789563241", "password", "Maria", 33.2);
        System.out.println("Username is " + user.getUsername());
        userRepo.save(user);
        System.out.println("Saved user in repository");
    }

    // get all users from repo
    @GetMapping("/users")
    public List<User> GetAllUsers() {
        List<User> userList = userRepo.findAll();
        return userList;
    }

    // get user by username
    @GetMapping("/users/{username}")
    public User GetUser(@PathVariable("username") String username) {
        return userRepo.findByUsername(username);
    }

    //add user to repo
    @PostMapping("/users/new")
    public int AddUser(@RequestBody User user) {
        try {
            userRepo.save(user);
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }

    //get number of users
    @GetMapping("/users/count")
    public int CountUsers() {
        return (int) userRepo.count();
    }

    //add product to shop repo
    @PostMapping("/product/new")
    public int AddShopItem(@RequestBody Product product) {
        try {
            productRepo.save(product);
            System.out.println("Added product to repository");
            return 0;
        } catch (Exception e) {
            System.out.println("Failed to add product to repository. Error is: " + e.getMessage());
            return 1;
        }
    }
    //delete product from shop repo
    @DeleteMapping("/product/{text}")
    public int DeleteShopItem(@PathVariable String text) {
        try {
            productRepo.deleteByText(text);
            return 0;
        } catch (Exception e) {
            System.out.println("Failed to delete item. Error is: " + e.getMessage());
            return 1;
        }
    }

    //get all products
    @GetMapping("/products")
    public List<Product> GetAllProducts() {
        List<Product> productList = productRepo.findAll();
        return productList;
    }

    //get product by type
    @GetMapping("/products/{type}")
    public List<Product> findByType(@PathVariable("type") String type) {
        return productRepo.findByType(type);
    }
}
