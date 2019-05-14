package com.springboot.cases;

import com.springboot.cases.dao.CustomerRepository;
import com.springboot.cases.dao.RedisDao;
import com.springboot.cases.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CasesApplication implements CommandLineRunner {

    public static Logger logger = LoggerFactory.getLogger(CasesApplication.class);

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private RedisDao redisDao;

    public static void main(String[] args) {
        SpringApplication.run(CasesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /*集成redis*/
        /*redisDao.setKey("name","Jack");
        redisDao.setKey("age","239");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
        */

        /*集成mongodb*/
       /* repository.deleteAll();

        repository.save(new Customer("Alice","Smith"));
        repository.save(new Customer("Bob","Smith"));

        System.out.println("customers found with findAll():");
        System.out.println("---------");
        for(Customer customer:repository.findAll()){
            System.out.println(customer);
        }
        System.out.println();

        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for(Customer customer:repository.findByLastName("Smith")){
            System.out.println(customer);
        }*/
    }

}
