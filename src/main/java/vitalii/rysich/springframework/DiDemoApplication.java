package vitalii.rysich.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import vitalii.rysich.springframework.controllers.ConstructedInjectionController;
import vitalii.rysich.springframework.controllers.MyController;
import vitalii.rysich.springframework.controllers.PropertyInjectedController;
import vitalii.rysich.springframework.controllers.SetterInjectionController;
import vitalii.rysich.springframework.examplebeans.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"vitalii.rysich.springframework.services","vitalii.rysich.springframework"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");
        controller.hello();

        FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource);
    }

}
