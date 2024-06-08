package ohy.web.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jakarta.activation.DataSource;

@Component
public class PostgreSQLConfig implements ApplicationRunner {
  private final DataSource dataSource;
  private final JdbcTemplate jdbcTemplate;

  public PostgreSQLConfig(DataSource dataSource, JdbcTemplate jdbcTemplate) {
    this.dataSource = dataSource;
    this.jdbcTemplate = jdbcTemplate;
  }
  
  @Override
  public void run(ApplicationArguments args) throws Exception {
    // try(Connection  connection = dataSource.getConnection()) {
    //   System.out.println("" + dataSource.getClass());
    // }
  }
}
