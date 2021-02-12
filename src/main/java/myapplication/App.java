package myapplication;
import myapplication.AddressBook.AddressBook;
import myapplication.AddressBook.AddressBookRepository;
import myapplication.AddressBook.BuddyInfo;
import myapplication.AddressBook.BuddyInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository BuddyRepository, AddressBookRepository addressBookRepository) {
        return (args) -> {
            // save a few customers
            BuddyInfo buddy1=new BuddyInfo("zewen","1833","123456");
            BuddyInfo buddy2=new BuddyInfo("zewen","1833","123456");
            BuddyInfo buddy3=new BuddyInfo("zewen","1833","123456");
            BuddyRepository.save(buddy1);
            BuddyRepository.save(buddy2);
            BuddyRepository.save(buddy3);
            AddressBook ab1 = new AddressBook();
            ab1.addBuddy(buddy1);
            ab1.addBuddy(buddy2);
            ab1.addBuddy(buddy3);
            addressBookRepository.save(ab1);
        };

    }

}
