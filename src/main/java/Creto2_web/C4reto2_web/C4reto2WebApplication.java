package Creto2_web.C4reto2_web;

import Creto2_web.C4reto2_web.interfaces.InterfacePeripherals;
import Creto2_web.C4reto2_web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C4reto2WebApplication implements CommandLineRunner{
    @Autowired
    private InterfacePeripherals interfacePeripherals;
    @Autowired
    private InterfaceUser interfaceUser;

	public static void main(String[] args) {
		SpringApplication.run(C4reto2WebApplication.class, args);
	}
        
        @Override
        public void run(String... args) throws Exception{
            
            interfacePeripherals.deleteAll();
            interfaceUser.deleteAll();
        }

}
