package cigma.pfe;



import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.presentation.ClientController;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationRunner {







			public static void main(String[] args) {
				ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
				ClientController ctr= (ClientController) ctx.getBean("ctrl1");
				Client client = new Client("OMAR");
				CarteFidelio carteFidelio = new CarteFidelio("A29930489");
				carteFidelio.setClient(client);
				client.setCarteFidelio(carteFidelio);
				ctr.save(client);
			}


		}



