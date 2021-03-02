package kz.talipovsn.an.demo;

import lombok.NonNull;

// Пример интерфейса с аннотацией-предупреждением, что значение не должно быть пустым
interface IGreetingService {
    @NonNull String sayMessage(@NonNull String message);
}

public class launch {

    public static void main(String[] args) {
        // Пример создания безимянного класса через интерфейс с лямбда-выражением
        IGreetingService gs = (String message) -> {
            return message == null ? null : message+"!"; // На этой строке выходит предупреждение от аннатации @NonNull
        };
        System.out.println(gs.sayMessage("Java"));
        System.out.println(gs.sayMessage(null)); // На этой строке выходит предупреждение от аннатации @NonNull
        MyBooks mb = new MyBooks(2020, "Java", "TSN");
        mb.setYear(2021); // Данный сеттер неявно сделан аннотацией @Data
        System.out.println(mb.getAuthor()); // Данный геттер неявно сделан аннотацией @Data
    }

}
