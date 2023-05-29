import java.util.HashMap;

public class Cart {
    private HashMap<Menu, Integer> menuList = new HashMap<Menu, Integer>();
    private int totalAmount = 0;
    private int currentItemCount = 0;

    // 장바구니에 메뉴 담기
    boolean addMenu(Menu menu) {
        return true;
    }

    // 카트에 담긴 항목 보기(없으면 비었다는 문자열, 있으면 카트 항목 가공한 문자열 리턴)
    // '2. 장바구니 보기' 때문에 추가
    String showCartInfo() {
        return "";
    }
}
