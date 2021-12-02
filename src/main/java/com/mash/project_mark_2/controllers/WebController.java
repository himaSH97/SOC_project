package com.mash.project_mark_2.controllers;

import com.mash.project_mark_2.models.Product;
import com.mash.project_mark_2.models.Reservation;
import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.repositories.ProductRepository;
import com.mash.project_mark_2.repositories.ReservationRepository;
import com.mash.project_mark_2.repositories.UserRepository;
import com.mash.project_mark_2.services.ProductService;
import com.mash.project_mark_2.services.ReservationService;
import com.mash.project_mark_2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class WebController {
    @Autowired
    private  UserRepository repository;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ReservationService reservationService;



    @GetMapping("/")
    public String user() {
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/admin")
    public String getUsr(Model model,Model model1,Model model2){
        List<User> listuser = userService.getAllUsers();
        model.addAttribute("listUser",listuser);
        List<Product> listproduct = productService.getAllProducts();
        model1.addAttribute("listProduct",listproduct);
        List<Reservation> listreservation = reservationService.getAllReservations();
        model2.addAttribute("listreservation",listreservation);
        return "users";
    }

    @GetMapping("/new")
    public String addUser(Model model) {
        model.addAttribute("user",new User());  // passing the model to new html page.
        return "signup"; //return index page name should be matched.

    }
    @GetMapping("/newproduct")
    public String addProduct(Model model) {
        model.addAttribute("product",new Product());  // passing the model to new html page.
        return "new_product"; //return index page name should be matched.

    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("user") User user)
    {
        repository.save(user);
        return "redirect:/";
    }
    @PostMapping("/save_product")
    public String saveProduct(@ModelAttribute("product") Product product)
    {
        productRepository.save(product);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") String id){
        repository.deleteById(id);
        return "redirect:/admin";
    }

    @GetMapping("/update/{id}")
    public String UpdatePage(@PathVariable("id") String id,Model model){
        User user = userService.getCustomerByEmail(id);
        model.addAttribute("user",user);
        return "signup";
    }


    @GetMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable("id") String id) {
        productRepository.deleteByName(id);
        return "redirect:/admin";
    }

    @GetMapping("/product_list")
    public String getprd(Model model){
        List<Product> listproduct = productService.getAllProducts();
        model.addAttribute("listProduct",listproduct);
        return "products";
    }


    @GetMapping("/update_product/{id}")
    public String showUpdatePage(@PathVariable("id") String id,Model model){
      Product product = productService.getProductByName(id);
      model.addAttribute("product",product);
      return "update_product";
    }

    /*/for reservations
    @GetMapping("/new_reservation")
    public String addReservation(Model model) {
        model.addAttribute("res", new Reservation());  // passing the model to new html page.
        return "reservation"; //return index page name should be matched.
    }


    @PostMapping("/save_reservation")
    String saveReservation(@ModelAttribute("reservation") Reservation reservation)
    {
        reservationRepository.save(reservation);
        return "redirect:/";
    } */
}
