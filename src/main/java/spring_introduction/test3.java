package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bespalov Alexey
 * {@link Person} Модель данных человека с методами
 * {@link Pet} Интерфейс для животных
 * {@link ClassPathXmlApplicationContext} Объяевление концейнера Spring
 * Учебный класс
 */
public class test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
  //      Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
