import java.util.Scanner;

public class Panel {
    private Scanner sc = new Scanner(System.in); // 입력을 받기위한 Scanner
    private Controller controller; // 양방향 연관

    void setController(Controller controller) {
        this.controller = controller;
    }

    void startKiosk() {
        controller.powerOn();
        while (true) {
            int option = controller.run();
            if (option == 4) { break; }
        }
    }

    // user로부터 숫자 입력 받기 위한 함수
    int getInput() {
        return sc.nextInt();
    }

    // 기본 선택지를 출력해주는 함수
    int printStartOption() {
        System.out.print("--------선택지---------\n" +
                "1번: 주문하기\n" +
                "2번: 장바구니 보기\n" +
                "3번: 결제하기\n" +
                "4번: 종료하기\n" +
                "----------------------\n" +
                "실행할 메뉴의 번호를 입력해주세요: ");
        return sc.nextInt();
    }

    void printPowerOn() {
        System.out.println("어서오세요 햄버거 가게입니다~🍔");
    }

    void printPowerOff() {
        System.out.println("키오스크를 종료합니다.");
    }

    // panel을 통한 출력을 위한 함수
    void print(String str) {
        System.out.println(str);
    }
}
