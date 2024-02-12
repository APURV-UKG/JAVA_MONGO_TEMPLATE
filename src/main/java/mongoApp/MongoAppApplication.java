package mongoApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MongoAppApplication {

	public static void main(String[] args) {
//			if (args.length == 0 || !args[0].startsWith("CONN_STR=")) {
//				System.err.println("Error: MongoDB connection string not provided. Usage: java -jar mongodock.jar CONN_STR=\"your_mongodb_connection_string\"");
//				System.exit(1);
//			}
//		String connStr = args[0].substring("CONN_STR=".length());
//		System.out.println("MongoDB connection string: " + connStr);
		SpringApplication.run(MongoAppApplication.class, args);
	}
}

//	@Component
//	public static class MongoInitializer implements CommandLineRunner {
//
//		@Override
//		public void run(String... args) throws Exception {
//			if (args.length == 0 || !args[0].startsWith("CONN_STR=")) {
//				System.err.println("Error: MongoDB connection string not provided. Usage: java -jar mongodock.jar CONN_STR=\"your_mongodb_connection_string\"");
//				System.exit(1);
//			}
//
//			String connStr = args[0].substring("CONN_STR=".length());
//			// Use connStr as your MongoDB connection string
//			System.out.println("MongoDB connection string: " + connStr);
//		}
//	}

