package simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Book book = (Book) context.getBean("book");
//        book.add();
    	 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	 Animal book = (Animal) context.getBean("animal");
    	 book.add();
    }
    
    
}
