package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;


@Repository
public class InMemoryLanguagesRepository implements ProgrammingLanguagesRepository {
	
	List<ProgrammingLanguages> programmingLanguages;
	
	public InMemoryLanguagesRepository() {
		
		programmingLanguages =  new ArrayList<ProgrammingLanguages>(); 
		programmingLanguages.add(new ProgrammingLanguages(1, "JAVA"));
		programmingLanguages.add(new ProgrammingLanguages(2, "PHP"));
		programmingLanguages.add(new ProgrammingLanguages(3, "C#"));
		programmingLanguages.add(new ProgrammingLanguages(4, "C++"));
		programmingLanguages.add(new ProgrammingLanguages(5, "ASP.NET"));
		
	}
	@Override
	public List<ProgrammingLanguages> getAll() {
		
		return programmingLanguages;
	}
	@Override
	public void delete(int id) {
		programmingLanguages.remove(id);
		
	}
	@Override
	public void update(ProgrammingLanguages programmingLanguage) {
		for (ProgrammingLanguages languages : programmingLanguages) {
			if (programmingLanguage.getId()==languages.getId()) {
				languages.setName(languages.getName());
			}
		}
	}
	@Override
	public ProgrammingLanguages getById(int id) {
		 for(ProgrammingLanguages programmingLanguage: programmingLanguages){
	            if(programmingLanguage.getId()==id){
	                return programmingLanguage;
	            }

	        }

	        return null;
	
	}
	
	@Override
	public void add(ProgrammingLanguages programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}
	
}
