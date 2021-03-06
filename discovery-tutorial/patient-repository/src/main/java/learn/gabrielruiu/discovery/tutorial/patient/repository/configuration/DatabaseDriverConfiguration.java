package learn.gabrielruiu.discovery.tutorial.patient.repository.configuration;

import com.mysql.jdbc.Driver;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@Configuration
public class DatabaseDriverConfiguration {

    @Autowired
    Environment env;

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Bean
    @Profile("in-memory")
    DataSource inMemoryDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        builder.setType(EmbeddedDatabaseType.H2);
        builder.addScript("sql/schema.sql");
        return builder.build();
    }

    @Bean
    @Profile("mysql")
    @Primary
    DataSource mysqlDataSource() throws SQLException {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dataSourceProperties.getUrl());
        basicDataSource.setUsername(dataSourceProperties.getUsername());
        basicDataSource.setPassword(dataSourceProperties.getPassword());
        basicDataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        return basicDataSource;
    }
}
