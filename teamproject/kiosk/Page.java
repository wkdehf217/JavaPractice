package kiosk;

import java.util.List;
import java.util.Scanner;

public class Page {

    String mainPage = """
            ====================================================
             
             "SHAKESHACK BURGER 에 오신걸 환영합니다."
             아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.
                            
            [ SHAKESHACK MENU ]
            1. Burgers         | 앵거스 비프 통살을 다져만든 버거
            2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림
            3. Drinks          | 매장에서 직접 만드는 음료
                            
            [ ORDER MENU ]
            4. Order       | 장바구니를 확인 후 주문합니다.
            5. Cancel      | 진행중인 주문을 취소합니다.
            6. 프로그램 종료
            
            ====================================================
            """;
    String burgerPage = """
            ==============================================================================
             
             "SHAKESHACK BURGER 에 오신걸 환영합니다."
             아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
                                
            [ Burgers MENU ]
            1. ShackBurger           | W 6.9  | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
            2. SmokeShack            | W 8.9  | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
            3. Shroom Burger         | W 9.4  | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
            4. Shack Stack           | W 12.4 | 슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴
            5. Cheeseburger          | W 6.9  | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
            6. Hamburger             | W 5.4  | 비프패티를 기반으로 야채가 들어간 기본버거
                                
            [ ORDER MENU ]
            7. Order       | 장바구니를 확인 후 주문합니다.
            8. Cancel      | 진행중인 주문을 취소합니다.
                                
            9. 뒤로 가기
            
            ==============================================================================
            """;
    String frozenCustardPage = """
            ===============================================================================================
             
             "SHAKESHACK BURGER 에 오신걸 환영합니다."
             아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
                                
            [ Forzen Custard MENU ]
            1. Shake                 | W 5.9  | 바닐라, 초콜렛, 솔티드 카라멜, 블랙& 화이트, 스트로베리, 피넛버터, 커피
            2. Shake of the Week     | W 6.5  | 특별한 커스터드 플레이버
            3. Red Bean Shake        | W 6.5  | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크
            4. Floats                | W 5.9  | 루트 비어, 퍼플 카우, 크림시클
            5. Cups&Cones            | W 4.9  | 바닐라, 초콜렛, Flavor of the Week
            6. Concretes             | W 5.9  | 쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합
                                
            [ ORDER MENU ]
            7. Order       | 장바구니를 확인 후 주문합니다.
            8. Cancel      | 진행중인 주문을 취소합니다.
                                
            9. 뒤로 가기
            
            ===============================================================================================
            """;
    String drinkPage = """
            ===============================================================================================
             
             "SHAKESHACK BURGER 에 오신걸 환영합니다."
             아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
                                
            [ Drinks MENU ]
            1. Shack-made Lemonade   | W 3.9  | 매장에서 직접 만드는 상큼한 레몬에이드
            2. Fresh Brewed Ice Tea  | W 3.4  | 직접 유기농 홍차를 우려낸 아이스티
            3. Fifty/Fifty           | W 3.5  | 레몬에이트와 아이스티의 만남
            4. Fountain Soda         | W 2.7  | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프
            5. Abita Root Beer       | W 4.4  | 청량감 있는 독특한 미국식 무알콜 단산음료
            6. Bottled Water         | W 1.0  | 지리산 암반대수층으로 만든 프리미엄 생수
            7. ShackMeister Ale      | W 9.8  | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주
                                
            [ ORDER MENU ]
            8. Order       | 장바구니를 확인 후 주문합니다.
            9. Cancel      | 진행중인 주문을 취소합니다.
                                
            10. 뒤로 가기
            
            ===============================================================================================
            """;

    public void mainPageMethod(List<Items> itemsList, List<Items> orderList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mainPage);
        System.out.print(">");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                burgerPageMethod(itemsList, orderList);
                break;
            case 2:
                frozenCustardPageMethod(itemsList, orderList);
                break;
            case 3:
                drinkPageMethod(itemsList, orderList);
                break;
            case 4:
                cartPage(itemsList, orderList);
                break;
            case 5:
                orderClear(itemsList, orderList);
                break;
            case 6:
                System.out.println("[ 프로그램을 종료합니다... ]");
                break;
        }
    }
    public void burgerPageMethod(List<Items> itemsList, List<Items> orderList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(burgerPage);
        System.out.print(">");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                addBurger(input, itemsList,  orderList);
                break;
            case 7:
                cartPage(itemsList, orderList);
                break;
            case 8:
                orderClear(itemsList, orderList);
                break;
            case 9:
                mainPageMethod(itemsList, orderList);
                break;
        }
    }
    public void frozenCustardPageMethod(List<Items> itemsList, List<Items> orderList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(frozenCustardPage);
        System.out.print(">");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                addFrozenCustard(input, itemsList, orderList);
                break;
            case 7:
                cartPage(itemsList, orderList);
                break;
            case 8:
                orderClear(itemsList, orderList);
                break;
            case 9:
                mainPageMethod(itemsList, orderList);
                break;
        }
    }
    public void drinkPageMethod(List<Items> itemsList, List<Items> orderList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(drinkPage);
        System.out.print(">");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                addDrink(input, itemsList, orderList);
                break;
            case 8:
                cartPage(itemsList, orderList);
                break;
            case 9:
                orderClear(itemsList, orderList);
                break;
            case 10:
                mainPageMethod(itemsList, orderList);
                break;
        }
    }

    // 장바구니 페이지
    public void cartPage(List<Items> itemsList, List<Items> orderList) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0; // 주문금액 값 초기화

        System.out.println("[ 장바구니 ]");
        if (!orderList.isEmpty()) {
            for (Items items : orderList) {
                sum += items.price;
                System.out.printf("%s : %d%n", items.name, items.price);
            }
            System.out.printf("\n주문금액 : %d\n", sum);
            System.out.println("[ 1.주문하기 | 2.메뉴추가 ]");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("카드를 아래와 같이 넣어주세요");
                    System.out.print(">");
                    long payment = scanner.nextLong();
                    if (sum > payment) {
                        System.out.println("금액이 부족합니다");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (sum <= payment) {
                        System.out.println("주문해 주셔서 감사합니다");
                        System.out.println();
                        orderList.clear();
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        mainPageMethod(itemsList, orderList);
                        break;
                    }
                case 2:
                    mainPageMethod(itemsList, orderList);
                    break;
            }

        } else {
        System.out.println("장바구니가 비어있습니다");
            System.out.println();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        mainPageMethod(itemsList, orderList);
        }
    }

    // 장바구니 초기화
    public void orderClear(List<Items> itemsList, List<Items> orderList) {
        orderList.clear();
        System.out.println("장바구니를 비웠습니다");
        System.out.println();System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mainPageMethod(itemsList, orderList);
    }

    public void addBurger(int input,List<Items> itemsList, List<Items> orderList) {
        orderList.add(0, itemsList.get(input-1));
        System.out.println("장바구니에 담겼습니다");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        burgerPageMethod(itemsList, orderList);
    }
    public void addFrozenCustard(int input,List<Items> itemsList, List<Items> orderList) {
        orderList.add(0, itemsList.get(99+input));
        System.out.println("장바구니에 담겼습니다");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        frozenCustardPageMethod(itemsList, orderList);
    }
    public void addDrink(int input,List<Items> itemsList, List<Items> orderList) {
        orderList.add(0, itemsList.get(199+input));
        System.out.println("장바구니에 담겼습니다");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        drinkPageMethod(itemsList, orderList);
    }
}
