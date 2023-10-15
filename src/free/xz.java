package free;

public class xz {
    public static void main(String[] args) {

        String name = "Den";
//
//                System.out.println(name);
        String s = "Тут Был Денчик";
        System.out.println("Размер строки - " + s.length());
        System.out.println("Поиск символа - " + s.indexOf('т'));
        System.out.println("Взятие подстроки - " + s.substring(3));
        System.out.println("Замена символа - " + s.replace(' ', '_'));
        System.out.println("Возведение в верхний регистр - " + s.toUpperCase());
        System.out.println("Возведение в нижний регистр - " + s.toLowerCase());

    }
}
