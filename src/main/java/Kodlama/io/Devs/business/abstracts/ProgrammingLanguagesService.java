package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;


public interface ProgrammingLanguagesService {
	List<ProgrammingLanguages> getAll();
	void add(ProgrammingLanguages programmingLanguage) throws Exception;
	void delete(int id);
	void update(ProgrammingLanguages programmingLanguage);
	ProgrammingLanguages getById(int id);
}
