public class Receipt {
    private Cart cartInfo;
    private int totalAmount;
    private int orderNumber;
    public Receipt(Cart cartInfo, int totalAmount, int orderNumber){
        this.cartInfo = cartInfo;
        this.totalAmount = totalAmount;
        this.orderNumber = orderNumber;
    }

    public void print(){
        System.out.println("Receipt #"+this.orderNumber);
        System.out.println(this.cartInfo);
        System.out.println("총 금액은 "+this.totalAmount+" 입니다.");
    }
}
