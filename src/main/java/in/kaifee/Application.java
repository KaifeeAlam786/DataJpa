package in.kaifee;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.kaifee.entity.Book;
import in.kaifee.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cctxt = SpringApplication.run(Application.class, args);
		BookRepository repo = cctxt.getBean(BookRepository.class);
		//List<Book> book = repo.findByBookPriceGreaterThan(500.00);
		//List<Book> book = repo.findByBookName("Java");
		List<Book> book = repo.getBook();
		for(Book b:book) {
			System.out.println(b);
			
		}
		
		
		/*
		 * Book b = new Book();
		 * 
		 * b.setBookId(101); b.setBookName("Java"); b.setBookPrice(580.00);
		 * 
		 * Book b2 = new Book();
		 * 
		 * b2.setBookId(102); b2.setBookName("Html"); b2.setBookPrice(300.00);
		 * 
		 * 
		 * List l=new ArrayList(); l.add(b); l.add(b2);
		 * 
		 * repo.saveAll(l);
		 * 
		 * repo.saveAll(Arrays.asList(b, b2));
		 * 
		 * boolean status = repo.existsById(110);
		 * System.out.println("Record presence ::" + status);
		 * 
		 * System.out.println("Total number of record present ::" + repo.count());
		 * System.out.println("record inserted");
		 * 
		 * System.out.println("==================================");
		 * System.out.println("Retrieving element by findById method"); Optional<Book>
		 * byId = repo.findById(101); System.out.println(byId.get());
		 * System.out.println("==================================");
		 * System.out.println("Retrieving element by findAllById method");
		 * Iterable<Book> allById = repo.findAllById(Arrays.asList(101, 102, 103)); for
		 * (Book b1 : allById) { System.out.println(b1); }
		 * System.out.println("==================================");
		 * System.out.println("Retrieving element by findAll method"); Iterable<Book>
		 * all = repo.findAll(); for (Book a : all) { System.out.println(a); }
		 * System.out.println("==================================");
		 * 
		 * System.out.println("Deleting element by deleteById method");
		 * 
		 * if (repo.existsById(106)) { repo.deleteById(106); } else {
		 * System.out.println("record not found with given id"); }
		 * 
		 * System.out.println("==================================");
		 * System.out.println("Deleting element by deleteAllById method");
		 * repo.deleteAllById(Arrays.asList(101, 102));
		 * 
		 * System.out.println("==================================");
		 * System.out.println("Deleting element by deleteAllById method");
		 * //repo.delete(b2);
		 */
	}
}
