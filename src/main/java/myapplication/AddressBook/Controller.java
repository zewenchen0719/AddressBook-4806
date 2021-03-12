package myapplication.AddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private AddressBookRepository abr;
    private BuddyInfoRepository buddyInfoRepository;

    public Controller(BuddyInfoRepository buddyInfoRepository, AddressBookRepository abr) {
        this.buddyInfoRepository = buddyInfoRepository;
        this. abr= abr;
    }

    @GetMapping("/buddyinfo")
    public String buddyForm(Model model, @RequestParam(value = "bookId", required = false, defaultValue = "-1") long bookId) {
        if(bookId == -1)
        {
            AddressBook newAb = abr.save(new AddressBook());
            bookId = newAb.getId();
        }

        model.addAttribute("buddyinfo", new BuddyInfo());
        model.addAttribute("abr", abr);
        model.addAttribute("bookId", bookId);
        return "buddyinfo";
    }

    @PostMapping("/buddyinfo")
    public String buddySubmit(@ModelAttribute BuddyInfo buddy, Model model) {
        model.addAttribute("newBuddy",buddy);
        buddyInfoRepository.save(buddy);
        model.addAttribute("bir", buddyInfoRepository.findAll());
        //AddressBook ab = abr.findById(bookId);
        //abr.save(ab);
        return "result";
    }

    @GetMapping("/book")
    public String getCurrentID(@RequestParam Long bookId, Model model){
       if(abr.findById(bookId)==null){

       }
       else {
           model.addAttribute("buddyinfo", new BuddyInfo());
           model.addAttribute("bookId", bookId);
       }
        return "buddyinfo";
    }


}
