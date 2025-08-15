package com.erudayu.LLD;

import com.erudayu.LLD.CreationalDesignPattern.order.Order;
import com.erudayu.LLD.CreationalDesignPattern.order.Status;
import com.erudayu.LLD.CreationalDesignPattern.product.Product;
import com.erudayu.LLD.CreationalDesignPattern.product.ProductCategory;
import com.erudayu.LLD.CreationalDesignPattern.product.ProductFactory;
import com.erudayu.LLD.CreationalDesignPattern.user.Gender;
import com.erudayu.LLD.CreationalDesignPattern.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.LinkedList;

@SpringBootApplication
public class LldApplication {

	public static void main(String[] args) {
		SpringApplication.run(LldApplication.class, args);
		System.out.println("Hello");
		ProductFactory pf = new ProductFactory();

		Product clothing = pf.getProduct(ProductCategory.CLOTHING);
		Product electronic = pf.getProduct(ProductCategory.ELECTRONICS);

		User user1 = new User.UserBuilder("Udayakumar", "erudayu@gmail.com")
				.setAge(27)
				.setGender(Gender.MALE)
				.setPhoneNumber("7667549959")
				.setLastname("Udaiappa")
				.build();


		Order order1 = new Order.OrderBuilder("123")
								.setStatus(Status.ORDERED)
								.setProducts(new LinkedList<>(Arrays.asList(clothing, electronic)))
								.build();
		System.out.println(order1);
	}

}
