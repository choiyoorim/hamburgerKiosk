import java.util.HashMap;

public class Payment {
    private int paymentAmount = 0;
    private PaymentType paymentOption = PaymentType.card;
    private static int orderNumber = 0; // 해당 클래스의 모든 객체 통틀어 하나만 쓰이도록 static 선언
    private HashMap<Menu, Integer> orderList = new HashMap<Menu, Integer>();
    private int cardBalance = 6000;



    private int pay(int amount, PaymentType type) {
        if (type == PaymentType.card) {
            if (amount > cardBalance) {
                return -1;
            } else {
                cardBalance -= amount;
                return 0;
            }
        } else if (type == PaymentType.coupon) {
            // 쿠폰인 경우 일단 전부 통과
            return 0;
        } else {
            return -2;
        }
    }

    public String requestPayment(Cart cartInfo, PaymentType type) {
        int payResult = pay(cartInfo.getTotalAmount(), type);
        if (payResult == -1) {
            return "잔액 부족";
        } else {
            orderNumber += 1;
            Receipt receipt = new Receipt(cartInfo, cartInfo.getTotalAmount(), orderNumber);
            return receipt.print();
        }
    }
}

