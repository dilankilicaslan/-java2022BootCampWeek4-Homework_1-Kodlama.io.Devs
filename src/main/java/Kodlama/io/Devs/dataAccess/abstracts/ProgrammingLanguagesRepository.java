package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguagesRepository {
	List<ProgrammingLanguages>  getAll();

	void delete(int id);

	void update(ProgrammingLanguages programmingLanguage);

	ProgrammingLanguages getById(int id);

	void add(ProgrammingLanguages programmingLanguage);



}
