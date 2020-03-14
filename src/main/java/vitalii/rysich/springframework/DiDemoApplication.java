package vitalii.rysich.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import vitalii.rysich.springframework.controllers.ConstructedInjectionController;
import vitalii.rysich.springframework.controllers.MyController;
import vitalii.rysich.springframework.controllers.PropertyInjectedController;
import vitalii.rysich.springframework.controllers.SetterInjectionController;

@SpringBootApplication
@ComponentScan(basePackages = {"vitalii.rysich.springframework.services","vitalii.rysich.springframework"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");
        controller.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectionController.class).sayHello());
        System.out.println(context.getBean(ConstructedInjectionController.class).sayHello());
    }

}
