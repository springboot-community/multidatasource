package io.springboot.multidatasource;


import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(value = {
	@MapperScan(basePackages = "io.springboot.multidatasource.mapper1",
			sqlSessionFactoryRef = "sqlSessionFactory1",sqlSessionTemplateRef = "sqlSessionTemplate1"),
	
	@MapperScan(basePackages = "io.springboot.multidatasource.mapper2",
			sqlSessionFactoryRef = "sqlSessionFactory2",sqlSessionTemplateRef = "sqlSessionTemplate2"),
})
public class MultidatasourceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MultidatasourceApplication.class, args);
	}
}
