package untitled.common;


import untitled.DriverApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DriverApplication.class })
public class CucumberSpingConfiguration {
    
}
