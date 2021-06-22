package com.springbootrest.restservice;

import com.springbootrest.restservice.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class RestServiceApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(RestServiceApplication.class, args);

//		Implement a decoder for the Ceasar cipher where N = 5

//		char[] ch = "ffff".toCharArray();
//
//		 IntStream.range(0, ch.length).mapToObj(a -> Character.valueOf( (char)(ch[a]-'5'))).forEach(System.out::println).;
//		List<String> people1 = Arrays.asList("try","saurabh", "singh", "rana", "ronak");
//		List<String> people2 = Arrays.asList("Shalinini", "Nandini", "Anjali", "Anjelika");
//		Map<Boolean, List<String>> mp = people.stream()
//				.collect(Collectors.partitioningBy( p -> p.length()>6));

		/*Map<Integer, List<String>> mp = people.stream()
				.collect(Collectors.groupingBy( p -> p.length()));


		for( Map.Entry e : mp.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}*/

//		List<List<String>> collection = Arrays.asList( people1, people2);
//		List<String> res = collection.stream()
//				.flatMap( r -> r.stream())
//				.collect(Collectors.);
//		System.out.println(res);


	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("saurabh");
	}
}
