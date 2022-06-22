import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean_2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean_2.getMessage());

        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat_2 = applicationContext.getBean("cat", Cat.class);
        cat_2.voice();

        System.out.println(bean == bean_2);
        System.out.println(cat == cat_2);
    }
}