import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "meowMeow")
    @Scope ("prototype")
    public  Cat getMeowMeow(){
        Cat cat = new Cat();
        cat.setMessage("Meow-Meow");
        return cat;

    }
}