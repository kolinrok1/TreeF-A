import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        Service service = new Service();
        Presenter presenter = new Presenter(view, service);
        view.start();
        System.out.println();
    }
}