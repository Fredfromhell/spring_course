package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    void returnBook() {
        System.out.println("Возвращаем книгу");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал");
    }
}
