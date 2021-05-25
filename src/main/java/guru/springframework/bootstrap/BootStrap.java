package guru.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;

@Component
public class BootStrap implements CommandLineRunner {
    private final CategoryRepository categoryRepository;

    public BootStrap(CategoryRepository categoryRepository) {
	super();
	this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

	System.out.println("Started in Bootstrap");

	Category fruits = new Category();
	fruits.setName("fruits");

	Category dried = new Category();
	dried.setName("dried");

	Category fresh = new Category();
	fresh.setName("fresh");

	Category exotic = new Category();
	exotic.setName("exotic");

	Category nuts = new Category();
	nuts.setName("nuts");

	categoryRepository.save(fruits);
	categoryRepository.save(dried);
	categoryRepository.save(fresh);
	categoryRepository.save(exotic);
	categoryRepository.save(nuts);

	System.out.println("Data Lombok = " + categoryRepository.count());
    }

}
