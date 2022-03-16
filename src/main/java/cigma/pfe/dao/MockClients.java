package cigma.pfe.dao;


import cigma.pfe.models.Client;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class MockClients implements CommandLineRunner {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(MockClients.class);

    @Autowired
    private ClientDao clientRepository;
    @Override
    public void run(String... args) throws Exception {
        Client c1 = new Client("Omar");
        Client c2 = new Client("Said");
        Client c3 = new Client("Ahmed");
        Client c4 = new Client("Farah");
        clientRepository.save(c1);
        clientRepository.save(c2);
        clientRepository.save(c3);
        clientRepository.save(c4);
        clientRepository.findAll().forEach(c ->
                System.out.println
                        (c)
        );

    }
}
