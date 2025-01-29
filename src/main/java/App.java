import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());



        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println("Пара HelloWorld " +(bean==bean1));


        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);


        Cat cat = (Cat) applicationContext1.getBean("cat");
        System.out.println(cat);

        Cat cat1 = (Cat) applicationContext1.getBean("cat");
        System.out.println(cat1);

        System.out.println("Пара Cat "+(cat==cat1));


    }
}