package webmodule.test.exampleMyBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "webmodule.test.exampleMyBatis.mapper")
public class ExampleMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleMyBatisApplication.class, args);
	}

}
