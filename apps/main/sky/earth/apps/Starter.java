package sky.earth.apps;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sky.earth.apps.manga.controller.MangaPutController;


@SpringBootApplication(scanBasePackages = {"sky.earth.apps", "sky.earth.manga"})
public class Starter {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
        applicationContext = new AnnotationConfigApplicationContext(MangaPutController.class);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        checkBeansPressence("manga");
    }

    private static void checkBeansPressence(String... beans){
        for (String bean : beans) {
            System.out.println("Is" + bean + " in ApplicationContext: "
                    + applicationContext.getBean(bean));
        }
    }
}