import java.util.HashMap;

public class Cart {
    private HashMap<Menu, Integer> menuList = new HashMap<Menu, Integer>(); // 담긴 메뉴와 메뉴별 수량을 담는 변수
    private int totalAmount = 0;

    // 장바구니에 메뉴 담기
    boolean addMenu(Menu menu) {
        if (menuList.containsKey(menu)) {
            menuList.put(menu, menuList.get(menu)+1);
        } else {
            menuList.put(menu, 1);
        }
        totalAmount += menu.getMenuPrice();
        return true;
    }

    int getTotalAmount() {
        return  totalAmount;
    }

    // 장바구니에 담긴 메뉴와 총 금액을 전달하는 함수
    StringBuilder showCartInfo() {
        StringBuilder cartInfo = new StringBuilder();
        if(totalAmount == 0){
            cartInfo.append("✉\uFE0F 담긴 상품이 없습니다");
        }
        else{
            cartInfo.append("[\uD83D\uDED2 장바구니]\n");
            for(Menu menu:menuList.keySet()){
                cartInfo.append("\uD83C\uDF54 "+menu.getMenuName()+" "+menuList.get(menu)+"개\n");
            }
            cartInfo.append("총 금액: "+totalAmount);
        }
        return cartInfo;
    }

    // 주문 내역과 총 금액을 전달하는 함수
    StringBuilder showCartList() {
        StringBuilder cartInfo = new StringBuilder();
            cartInfo.append("[주문 목록]\n");
            for(Menu menu:menuList.keySet()){
                cartInfo.append("\uD83C\uDF54 "+menu.getMenuName()+" "+menuList.get(menu)+"개\n");
            }
            cartInfo.append("결제 금액: "+totalAmount);
        return cartInfo;
    }

    void resetCart() {
        menuList.clear();
        totalAmount = 0;
    }
}
