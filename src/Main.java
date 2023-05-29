public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.powerOn();
        while (true) {
            int option = controller.run();
            if (option == 4) { break; }
        }
    }
}