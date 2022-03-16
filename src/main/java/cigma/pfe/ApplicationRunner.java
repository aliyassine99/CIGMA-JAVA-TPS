package cigma.pfe;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationRunner {





		public static void main(String[] args) {


			SpringApplication.run(ApplicationRunner.class, args);
		/*	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
			ClientController ctr= (ClientController) ctx.getBean("ctrl1");
			Client client1 = new Client("Omar");
			Client client2 = new Client("Said");
			Client client3 = new Client("Ahmed");

			client1=ctr.save(client1);
			client2=ctr.save(client2);
			client3=ctr.save(client3);

			ctr.getAll().stream()
					.forEach(i-> System.out.println(i));

			System.out.println(ctr.getOne(1));

			client1.setName("Hassan");
			ctr.modify(client1);

			ctr.remove(2);

			ctr.getAll().stream()
					.forEach(i-> System.out.println(i));



		}
		*/
		}
		}



