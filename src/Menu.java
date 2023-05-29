public class Menu {
    private int menuNum;
    private String menuName;
    private int menuPrice;
    private String category;
    private String desc;

    Menu(int menuNum, String menuName, int menuPrice, String category, String desc){
        this.menuNum = menuNum;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.category = category;
        this.desc = desc;
    }

    public String toString() {
        return "메뉴명: " + menuName + "\n가격: " + menuPrice;
    }
}