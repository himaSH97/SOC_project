package com.mash.project_mark_2;

import com.mash.project_mark_2.models.Payment;
import com.mash.project_mark_2.models.Product;
import com.mash.project_mark_2.models.Reservation;
import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.repositories.PaymentRepository;
import com.mash.project_mark_2.repositories.ProductRepository;
import com.mash.project_mark_2.repositories.ReservationRepository;
import com.mash.project_mark_2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ProjectMark2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMark2Application.class, args);
    }

	@Autowired
    private PasswordEncoder passwordEncoder;
/*
	@Bean
    CommandLineRunner runner(ReservationRepository repository){
		return args -> {
			Reservation reservation= new Reservation ("sala","2","34","no description");
			repository.insert(reservation);
		};
	}


//*/
/*
    @Bean
    CommandLineRunner runner(ProductRepository repository){
        return args -> {
            Product product =new Product("dish 1","2000","lorem ipsum");
            Product product1 =new Product("dish 2","3000","lorem ipsum");
            Product product2 =new Product("dish 3","2400","lorem ipsum");
            Product product3 =new Product("dish 4","1200","lorem ipsum");
            Product product4 =new Product("dish 5","4300","lorem ipsum");
            Product product5 =new Product("dish 6","2100","lorem ipsum");
            Product product6=new Product("dish 7","4600","lorem ipsum");
            repository.insert(product);
            repository.insert(product1);
            repository.insert(product2);
            repository.insert(product3);
            repository.insert(product4);
            repository.insert(product5);
            repository.insert(product6);

        };
    }
//*/
}
