import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> menuList = new ArrayList<Menu>(); // 굳이 하나의 클래스로 만들 필요 x
        menuList.add(new Menu(1, "불고기버거", 3000, "버거", "불고기가 들어간 버거"));
        menuList.add(new Menu(2, "치즈버거", 3500, "버거", "치즈가 들어간 버거"));

        for (int i=0; i<menuList.size();i++) {
            System.out.println(menuList.get(i));
        }
    }
}

// https://koronya.tistory.com/entry/%EC%82%AC%EC%9A%A9%EC%9E%90-%EC%A0%95%EC%9D%98-%ED%81%B4%EB%9E%98%EC%8A%A4-%EA%B0%9D%EC%B2%B4%EC%9D%98-%EB%82%B4%EC%9A%A9-%EC%B6%9C%EB%A0%A5%ED%95%98%EA%B8%B0-toString