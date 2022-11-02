package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;


@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguagesService programmingLanguagesService;
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
		
		this.programmingLanguagesService = programmingLanguagesService;
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguages> getAll(){
		return programmingLanguagesService.getAll();
		
	}
	@PostMapping("/add")
	public void add(ProgrammingLanguages programmingLanguage) {
		try {
			programmingLanguagesService.add(programmingLanguage);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@PutMapping("/update")
    public void  update(ProgrammingLanguages programmingLanguage) throws Exception  {
         programmingLanguagesService.update(programmingLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(int id) throws Exception   {
    	programmingLanguagesService.delete(id);
    }

    @GetMapping("/getById")
    public ProgrammingLanguages getById(int id) {
        return programmingLanguagesService.getById(id);
    }
}
