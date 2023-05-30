public class Main {
    public static void main(String[] args) {
        Panel panel = new Panel();
        Controller controller = new Controller();
        panel.setController(controller);
        controller.setPanel(panel);
        panel.startKiosk();
    }
}