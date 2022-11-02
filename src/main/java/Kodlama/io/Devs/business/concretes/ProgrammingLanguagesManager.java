package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguagesService {

	private ProgrammingLanguagesRepository programmingLanguagesRepository;

	@Autowired
	public ProgrammingLanguagesManager(ProgrammingLanguagesRepository programmingLanguagesRepository) {

		this.programmingLanguagesRepository = programmingLanguagesRepository;
	}

	@Override
	public List<ProgrammingLanguages> getAll() {

		return programmingLanguagesRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguages programmingLanguage) throws Exception {
		List<ProgrammingLanguages> programmingLanguages = programmingLanguagesRepository.getAll();

		for (ProgrammingLanguages languages : programmingLanguages) {
			if (languages.getName().isEmpty() || languages.getName()==programmingLanguage.getName()) {
				throw new Exception("Daha önce eklenen bir Programlama dili girdiniz veya değer girmediniz.");
			} else {
				programmingLanguagesRepository.add(programmingLanguage);
			}

		}
	}

	

	@Override
	public void delete(int id) {
		programmingLanguagesRepository.delete(id);

	}

	@Override
	public void update(ProgrammingLanguages programmingLanguages) {
		programmingLanguagesRepository.update(programmingLanguages);

	}

	@Override
	public ProgrammingLanguages getById(int id) {
		ProgrammingLanguages programmingLanguages = programmingLanguagesRepository.getById(id);
		return programmingLanguages;
	}
}
