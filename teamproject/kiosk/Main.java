package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 버거 메뉴 0~99
        List<Items> menu = new ArrayList<>();
        menu.add(0, new Items("ShackBurger",
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                6900));
        menu.add(1, new Items("SmokeShack",
                "애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉐소스가 토핑된 치즈 버거",
                8900));
        menu.add(2,new Items("ShroomBurger",
                "몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 뒤겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쇅소스를 올린 베지테리안 버거",
                9400));
        menu.add(3,new Items("Shack Stack",
                "슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴",
                12400));
        menu.add(4,new Items("Cheeseburger",
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                6900));
        menu.add(5,new Items("Hamburger",
                "포테이토 번과 비프패티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거",
                5400));

        // 빈 메뉴 공간
        for(int i = 6; i < 101; i++) {
            menu.add(i, null);
        }
        // 음료 메뉴 100 ~ 199
        menu.add(100, new Items("Shake", "바닐라, 초콜렛, 솔티드 카라멜, 블랙& 화이트, 스트로베리, 피넛버터, 커피", 5900));
        menu.add(101, new Items("Shake of the Week", "특별한 커스터드 플레이버", 6500));
        menu.add(102, new Items("Red Bean Shake", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", 6500));
        menu.add(103, new Items("Floats", "루트 비어, 퍼플 카우, 크림시클", 5900));
        menu.add(104, new Items("Cups&Cones", "바닐라, 초콜렛, Flavor of the Week", 4900));
        menu.add(105, new Items("Concretes", "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합", 5900));

        // 빈 메뉴 공간
        for(int i = 107; i < 201; i++) {
            menu.add(i, null);
        }
        // 디저트 메뉴 200~299
        menu.add(200, new Items("Shack-made Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 3900));
        menu.add(201, new Items("Fresh Brewed Ice Tea", "직접 유기농 홍차를 우려낸 아이스티", 3400));
        menu.add(202, new Items("Fifty/Fifty", "레몬에이트와 아이스티의 만남", 3500));
        menu.add(203, new Items("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2700));
        menu.add(204, new Items("Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 단산음료", 4400));
        menu.add(205, new Items("Bottled Water", "지리산 암반대수층으로 만든 프리미엄 생수", 1000));
        menu.add(206, new Items("ShackMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", 9800));

        // 주문 목록 리스트 생성
        List<Items> orderList = new ArrayList<>();
        //주문 시작 지점
        Page start = new Page();
        start.mainPageMethod(menu, orderList);
    }
}

