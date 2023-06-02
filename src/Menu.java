public class Menu {
    private int menuNum;
    private String name;
    private int price;
    private String category;
    private String description;
    private int stockCount;

    Menu(int menuNum, String name, int price, String category, String description, int stockCount) {
        this.menuNum = menuNum;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.stockCount = stockCount;
    }

    // 메뉴판에 보일 메뉴 정보 전달
    String showMenuInfo() {
        return menuNum + "번. " + name + "(" + category + ", " + description + ") - 가격: " + price + "원";
    }

    String getMenuName(){ return name; }
    int getMenuPrice() {
        return price;
    }

    // 재고 확인
    boolean checkStock() {
        if (stockCount > 0) {
            stockCount -= 1;
            return true;
        } else {
            return false;
        }
    }
}
