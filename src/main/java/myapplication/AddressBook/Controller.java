package myapplication.AddressBook;

import myapplication.AddressBook.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private AddressBookRepository abr;
    @GetMapping("ZewenWebPage")
    public String x(Model model){

        model.addAttribute("addressbookrepository",abr.findAll());
        return "ZewenWebPage";
    };


}
