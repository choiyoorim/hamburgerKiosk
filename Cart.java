import java.util.HashMap;

public class Cart {
    private HashMap<Menu, Integer> menuList = new HashMap<Menu, Integer>();
    private int totalAmount = 0;
    private int currentItemCount = 0;

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

    // Payment에서 requestPayment할때 Cart 클래스 자체를 넘긴다고 했을때, 총 금액 정보만 가져갈 수 있도록 함수 추가
    int getTotalAmount() {
        return  totalAmount;
    }

    // 카트에 담긴 항목 보기(없으면 비었다는 문자열, 있으면 카트 항목 가공한 문자열 리턴)
    // '2. 장바구니 보기' 때문에 추가
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

    StringBuilder showCartList() {
        StringBuilder cartInfo = new StringBuilder();
            cartInfo.append("[주문 목록]\n");
            for(Menu menu:menuList.keySet()){
                cartInfo.append("\uD83C\uDF54 "+menu.getMenuName()+" "+menuList.get(menu)+"개\n");
            }
            cartInfo.append("결제 금액: "+totalAmount);
        return cartInfo;
    }
}
