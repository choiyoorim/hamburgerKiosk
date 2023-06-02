import java.util.HashMap;

public class Receipt {
    private Cart cartInfo;
    private int totalAmount;
    private int orderNumber;

    Receipt(Cart cartInfo, int totalAmount, int orderNumber) {
        this.cartInfo = cartInfo;
        this.totalAmount = totalAmount;
        this.orderNumber = orderNumber;
    }

    String print() {
        return "\n✅ 결제가 완료되었습니다."+ "\n---------------" + "\nReceipt #" + this.orderNumber
                + "\n" + cartInfo.showCartList();
    }
}
