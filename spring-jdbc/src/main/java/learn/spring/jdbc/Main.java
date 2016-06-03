package learn.spring.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LOG.info("Creating tables");

        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(id int NOT NULL AUTO_INCREMENT, first_name VARCHAR(255), last_name VARCHAR(255))");

        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

        splitUpNames.forEach(name -> LOG.info(String.format("Inserting customer record for %s %s", name[0], name[1])));

        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES(?,?)", splitUpNames);
        LOG.info("Querying for customer records where first_name = 'Josh':");

        jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?", new Object[] {"Josh"},
                (rs, rowNum) ->new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name")))
        .forEach(customer -> LOG.info(customer.toString()));
    }
}
