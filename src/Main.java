public class Main {
    public static void main(String[] args) {
        boolean sucess = Data.validate("test", "test", "test");
        if (sucess) {
            System.out.println("Данные валидны!");
        } else {
            System.out.println("Данные невалидны!");
        }
    }
}