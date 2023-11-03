import java.util.*;

public class Main {

    public static void main(String[] args) {


        Map<Items, String> menu = new HashMap<>();
        {
            menu.put(new Items("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거!!!", 6900), "burger_1");
            menu.put(new Items("SmokeShack", "애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉐소스가 토핑된 치즈 버거", 8900), "burger_2");
            menu.put(new Items("ShroomBurger",
                    "몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 뒤겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쇅소스를 올린 베지테리안 버거",
                    9400), "burger_1");
            menu.put(new Items("Shack Stack",
                    "슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴",
                    12400), "burger_3");
            menu.put(new Items("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거!!!", 6900), "burger_4");
            menu.put(new Items("Cheeseburger",
                    "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                    6900), "burger_5");
            menu.put(new Items("Hamburger",
                    "포테이토 번과 비프패티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거",
                    5400), "burger_6");

            menu.put(new Items("Shake of the Week", "특별한 커스터드 플레이버", 6500), "drink_1");
            menu.put(new Items("Shake of the Week", "특별한 커스터드 플레이버", 6500), "drink_2");
            //,...
        }











        // 버거 메뉴 -> 버거메뉴 맵<Item,ID) -> 메인메뉴 맵<버거맵,ID> -> 불러올 때 키 활용, 새로 만들때도 키 활용 -> 이걸 다시한번 map으로 묶어서 menus
        // 음료 메뉴 ->
        // 3 메뉴   ->
        ArrayList <HashMap<Items,String>> list = new ArrayList<HashMap<Items,String>>();
        메뉴 1 = 버거;(index = 1)
        메뉴 2 = 음료;(index = 2)
                list.add()
        ...

        Map<Items, String> menu = new HashMap<>();
        {
            menu.put(new Items("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거!!!", 6900), "burger_1");
            menu.put(new Items("SmokeShack", "애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉐소스가 토핑된 치즈 버거", 8900), "burger_2");
            menu.put(new Items("ShroomBurger",
                    "몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 뒤겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쇅소스를 올린 베지테리안 버거",
                    9400), "burger_1");
            menu.put(new Items("Shack Stack",
                    "슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴",
                    12400), "burger_3");
            menu.put(new Items("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거!!!", 6900), "burger_4");
            menu.put(new Items("Cheeseburger",
                    "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                    6900), "burger_5");
            menu.put(new Items("Hamburger",
                    "포테이토 번과 비프패티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거",
                    5400), "burger_6");

            menu.put(new Items("Shake of the Week", "특별한 커스터드 플레이버", 6500), "drink_1");
            menu.put(new Items("Shake of the Week", "특별한 커스터드 플레이버", 6500), "drink_2");
            //,...
        }

        //itemIDMap에 ID, Items 형식으로 정리
        Map<String, Items> itemIDMap = new HashMap<>();
        for (Map.Entry<Items, String> entry : menu.entrySet()) {
            itemIDMap.put(entry.getValue(), entry.getKey());
        }

        //이거로 출력 메서드 만들기 --> menuID의 밸류가 burger이면 burger메뉴화면에 출력
        Map<String, String> menuID = new HashMap<>();
        menuID.put("burger_1","burger");
        menuID.put("burger_2","burger");
        menuID.put("burger_3","burger");
        menuID.put("burger_4","burger");
        menuID.put("burger_5","burger");
        menuID.put("burger_6","burger");
        menuID.put("drink_1","drink");
        menuID.put("drink_2","drink");
        //...

        for (Map.Entry<String,String>)
            menuID.keySet()




        Map<Map<Items,String>, String> mainMenu = new HashMap<>();
        mainMenu.put(menuID(0),)




        List<Items> menu1 = new ArrayList<>();
        menu1.add(new Items("ShackBurger",
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거!!!",
                6900));
        menu1.add(new Items("SmokeShack",
                "애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉐소스가 토핑된 치즈 버거",
                8900));
        menu1.add(new Items("ShroomBurger",
                "몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 뒤겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쇅소스를 올린 베지테리안 버거",
                9400));
        menu1.add(new Items("Shack Stack",
                "슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴",
                12400));
        menu1.add(new Items("Cheeseburger",
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                6900));
        menu1.add(new Items("Hamburger",
                "포테이토 번과 비프패티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거",
                5400));

        List<Items> menu2 = new ArrayList<>();
        menu2.add(new Items("Shake", "바닐라, 초콜렛, 솔티드 카라멜, 블랙& 화이트, 스트로베리, 피넛버터, 커피", 5900));
        menu2.add(new Items("Shake of the Week", "특별한 커스터드 플레이버", 6500));
        menu2.add(new Items("Red Bean Shake", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", 6500));
        menu2.add(new Items("Floats", "루트 비어, 퍼플 카우, 크림시클", 5900));
        menu2.add(new Items("Cups&Cones", "바닐라, 초콜렛, Flavor of the Week", 4900));
        menu2.add(new Items("Concretes", "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합", 5900));

        List<Items> menu3 = new ArrayList<>();
        menu3.add(new Items("Shack-made Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 3900));
        menu3.add(new Items("Fresh Brewed Ice Tea", "직접 유기농 홍차를 우려낸 아이스티", 3400));
        menu3.add(new Items("Fifty/Fifty", "레몬에이트와 아이스티의 만남", 3500));
        menu3.add(new Items("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2700));
        menu3.add(new Items("Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 단산음료", 4400));
        menu3.add(new Items("Bottled Water", "지리산 암반대수층으로 만든 프리미엄 생수", 1000));
        menu3.add(new Items("ShackMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", 9800));

        List<Items> menu4 = new ArrayList<>();
        //add 메서드로 입력받아서 추가하게끔
        List<Items> menu5 = new ArrayList<>();
        List<Items> menu6 = new ArrayList<>();
        List<Items> menu7 = new ArrayList<>();
        List<Items> menu8 = new ArrayList<>();
        List<Items> menu9 = new ArrayList<>();
        List<Items> menu10 = new ArrayList<>();


//        new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");

        //하나로 모아서 키-밸류 --> 나중에 카테고르 추가하면 추가한데로 빼오도록
//        Map<String, String> menusText = new HashMap<>();
//        menusText.put("Buger", "앵거스 비프 통살을 다져만든 버거");
//        menusText.put("ForzenCustard", "설명2");
//        menusText.put("Drinks", "설명3");
//
//        List<List<Items>> Items = new ArrayList<>();
//        Items.add(menu1); //....
//
//        Map<Map<String, String>,List<Items>> mainMenus = new HashMap<>();
//
//        for (int i=0; i<menusText.size();i++) {
//            mainMenus.put(menusText,Items);
//
//        }



//        List<List<Items>> menus = new ArrayList<>();
//        if (!menu1.isEmpty()) {
//            menus.add(menu1);
//        }
//        if (!menu2.isEmpty()) {
//            menus.add(menu2);
//        }
//        // 이런식으로 비어있지 않다면 menus에 주가
//
//        menus.add(menu3);
//        menus.add(menu4);
//        menus.add(menu5);
//        menus.add(menu6);
//        menus.add(menu7);
//        menus.add(menu8);
//        menus.add(menu9);
//        menus.add(menu10);

        //첫화면 menus 길이에 따라 1메뉴 2메뉴 3메뉴 4메뉴... 출력 -> Order, 취소, 종료

        //카테고리 속 메뉴 삭제
        menu3.remove(0);

        //카테고리 삭제
        menu3.clear();

        //카테고리를 추가하려면 어떻게 설계?
        if(menu1.isEmpty()) {
            //        이런식으로 읽어보면서 비어있으면 거기에 추가? 아니면 더 간단하게 가능한가..?
        } else if (menu4.isEmpty()) {

            //이건 추가 메서드 만드는게
            Scanner scanner = new Scanner(System.in);
            System.out.println("이름 입력:");
            String name = scanner.nextLine();
            System.out.println("설명 입력:");
            String description = scanner.nextLine();
            System.out.println("가격 입력(long)");
            long price = Long.parseLong(scanner.nextLine());

            menu4.add(new Items(name, description, price));

            System.out.println("메뉴가 추가 되었습니다. 이름:" + menu4.get(0).name + "  설명: " + menu4.get(0).description + "  가격: " + menu4.get(0).price);

        } else if (menu5.isEmpty()) {

        }


//        menu.add(new Items("ShackBurger",
//                "토마토, 양상추, 쉑소스가 토핑된 치즈버거!!!",
//                6900));
//        menu.add(new Items("SmokeShack",
//                "애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉐소스가 토핑된 치즈 버거",
//                8900));
//        menu.add(new Items("ShroomBurger",
//                "몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 뒤겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쇅소스를 올린 베지테리안 버거",
//                9400));
//        menu.add(new Items("Shack Stack",
//                "슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴",
//                12400));
//        menu.add(new Items("Cheeseburger",
//                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
//                6900));
//        menu.add(new Items("Hamburger",
//                "포테이토 번과 비프패티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거",
//                5400));
//
//        // 빈 메뉴 공간
//        for(int i = 6; i < 101; i++) {
//            menu.add(i, null);
//        }
//        // 음료 메뉴 100 ~ 199
//        menu.add(100, new Items("Shake", "바닐라, 초콜렛, 솔티드 카라멜, 블랙& 화이트, 스트로베리, 피넛버터, 커피", 5900));
//        menu.add(101, new Items("Shake of the Week", "특별한 커스터드 플레이버", 6500));
//        menu.add(102, new Items("Red Bean Shake", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", 6500));
//        menu.add(103, new Items("Floats", "루트 비어, 퍼플 카우, 크림시클", 5900));
//        menu.add(104, new Items("Cups&Cones", "바닐라, 초콜렛, Flavor of the Week", 4900));
//        menu.add(105, new Items("Concretes", "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합", 5900));
//
//        // 빈 메뉴 공간
//        for(int i = 107; i < 201; i++) {
//            menu.add(i, null);
//        }
//        // 디저트 메뉴 200~299
//        menu.add(200, new Items("Shack-made Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 3900));
//        menu.add(201, new Items("Fresh Brewed Ice Tea", "직접 유기농 홍차를 우려낸 아이스티", 3400));
//        menu.add(202, new Items("Fifty/Fifty", "레몬에이트와 아이스티의 만남", 3500));
//        menu.add(203, new Items("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2700));
//        menu.add(204, new Items("Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 단산음료", 4400));
//        menu.add(205, new Items("Bottled Water", "지리산 암반대수층으로 만든 프리미엄 생수", 1000));
//        menu.add(206, new Items("ShackMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", 9800));

//        // 주문 목록 리스트 생성
//        List<Items> orderList = new ArrayList<>();
//        //주문 시작 지점
//        Page start = new Page();
//        start.mainPageMethod(menu, orderList);
    }
}

