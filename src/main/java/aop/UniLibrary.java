package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary ");
    }
    public void getMagazine() {
        System.out.println("Мы берём ЖУРНАЛ из UniLibrary");
    }
    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }
    public void returnMagazine() {
        System.out.println("Мы возвращаем ЖУРНАЛ в UniLibrary");
    }
    public void addBook() {
        System.out.println("Мы добовляем книгу в UniLibrary ");
    }
    public void addMagazine() {
        System.out.println("Мы добовляем ЖУРНАЛ в UniLibrary");
    }
}
