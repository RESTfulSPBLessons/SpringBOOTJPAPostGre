package controller;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repositories.PersonRepository;
import service.PersonService;
import service.PersonServiceInt;

import java.util.Hashtable;


@Controller
public class PersonController {

    PersonServiceInt psI;


    @Autowired
    PersonService ps;
    PersonRepository personRepository;



    @Autowired
    public void setProductService(PersonServiceInt productService) {
        this.psI = productService;
    }



    /*@RequestMapping("/all")*/
    @GetMapping("/all")
    public Iterable<Person> getAll(){
    //public Hashtable<String, Person> getAll();

        return personRepository.findAll();
        //return ps.getAll();

    }

  /*  @RequestMapping("{id}")
    public Person getPerson(@PathVariable("id") String id){

        return ps.getPerson(id);

    }

*/
}
