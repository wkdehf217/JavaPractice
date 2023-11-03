import java.util.Scanner;

public class Main {
    // 스캐너 함수
    public static int thisScanner(String matchInt) {
        int num = 0;
        if (matchInt != null && matchInt.matches("[-+]?\\d*\\.?\\d+")) {
            num = Integer.parseInt(matchInt);
        } else {
            return -1;
        }
        return num;
    }

    // 메인 메뉴 출력 함수
    public static void printMainMenu(Menu[] menuArray) {
        System.out.println();
        System.out.println();
        System.out.println("====================================================");
        System.out.println("\"HANJOON BOSSAM 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ BOSSAM MENU ]");

        // 메뉴판이 갱신 될 수도 있으므로 메뉴 리스트를 순회하며 메뉴들을 출력한다
        for (int i = 0; i < menuArray.length; i++) {
            System.out.println(i + 1 + ". " + String.format("%-17s", menuArray[i].name) + " | " + menuArray[i].explanation);
        }

        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
        System.out.println("====================================================");
    }

    // 하위 메뉴 출력 함수
    // menuNumber : 고른메뉴번호
    public static int printUnderMenu(Menu[] menuArray, int menuNumber, Order order) {
        // scanner 숫자 체크용
        String checkInt;
        // 고른 상품 번호
        int productNum;
        // 상품 객체 길이
        int productLength;
        // 상품 옵션
        int optionChoice;
        // 임시 추가 가격
        double tempAddPrice = 0;
        // 확인 취소
        int comfirmOrCancle;
        // 상품 메뉴를 골랐을 때, 해당 메뉴의 상품 길이만큼 반복문들을 돌며 메뉴 안의 상품들을 출력 해 준다
        for (int i = 0; i < menuArray[menuNumber - 1].product.length; i++) {
            System.out.println(i + 1 + ". " + String.format("%-17s", menuArray[menuNumber - 1].product[i].name) +
                    " | " + "W " + menuArray[menuNumber - 1].product[i].price +
                    " | " + menuArray[menuNumber - 1].product[i].explanation);
        }

        // 상품 버튼을 눌렀을 때 장바구니에 추가하는 화면
        // 메뉴[고른메뉴번호].상품[고른상품번호].이름
        // productNum : 고른 상품 번호
        // comfirmOrCancle : 확인 / 취소

        // 고른 상품 int 체크
        Scanner scan = new Scanner(System.in);
        checkInt = scan.next();
        productNum = thisScanner(checkInt);
        productLength = menuArray[menuNumber - 1].product.length;
        if (productNum <= productLength && productNum != 0 && productNum != -1) {
            // 제대로 선택했을 때 고른 메뉴 출력
            System.out.println("\"" + String.format("%-17s", menuArray[menuNumber - 1].product[productNum - 1].name) +
                    " | " + "W " + String.format("%.1f", menuArray[menuNumber - 1].product[productNum - 1].price) +
                    " | " + menuArray[menuNumber - 1].product[productNum - 1].explanation + "\"");

            // 선택 요구사항 2. 상품 옵션 기능 추가
            System.out.println("위 메뉴의 어떤 옵션으로 추가하시겠습니까?");
            System.out.println("1. Single(W 5.4)        2. Double(W 9.0)");

            // 옵션 int 체크
            checkInt = scan.next();
            optionChoice = thisScanner(checkInt);

            if (optionChoice == 1) tempAddPrice = 5.4;
            else if (optionChoice == 2) tempAddPrice = 9.0;
            else {
                return -1;
            }

            // 옵션 적용된 가격
            double tempNum = menuArray[menuNumber - 1].product[productNum - 1].price + tempAddPrice;
            System.out.println("\"" + String.format("%-17s", menuArray[menuNumber - 1].product[productNum - 1].name) +
                    " | " + "W " + String.format("%.1f", tempNum) +
                    " | " + menuArray[menuNumber - 1].product[productNum - 1].explanation + "\"");

            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인       2. 취소");
            checkInt = scan.next();
            comfirmOrCancle = thisScanner(checkInt);
            if (comfirmOrCancle == 1) {
                order.appendOrder(menuArray[menuNumber - 1].product[productNum - 1], optionChoice);
                System.out.printf("%-17s%n", menuArray[menuNumber - 1].product[productNum - 1].name + "(이)가 장바구니에 추가되었습니다.");
            } else if (comfirmOrCancle == 2) {
                System.out.println("취소되었습니다.");
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // 대기자 수
        int waitingNumber = 0;
        // 총 판매 값
        double RealTotalPrice = 0;
        // scanner 숫자 체크용
        String checkInt;

        // 주문 클래스
        Order order = new Order();

        // 메뉴 클래스
        Menu[] menuArray = new Menu[]{
                new Menu("1인 보쌈", "혼자먹기 적당한 양"),
                new Menu("2인 보쌈", "둘이먹기 적당한 양"),
                new Menu("보쌈도시락", "점심특선 11시 ~ 낮 2시"),
                new Menu("추가메뉴", "기타등등")
        };

        // 상품 클래스
        Product[] soloBossam = new Product[]{
                new Product("보쌈", "혼자먹다 둘이 죽어도 모를 보쌈", 1.1),
                new Product("족발", "혼자먹다 둘이 죽어도 모를 족발", 1.2),
                new Product("훈제보쌈", "다같이 죽어도 모를 훈제보쌈", 1.3)
        };
        Product[] coupleBossam = new Product[]{
                new Product("보쌈보쌈", "둘이먹다 넷이 죽어도 모를 보쌈", 2.4),
                new Product("보쌈족발", "둘이먹다 넷이 죽어도 모를 족발", 2.5),
                new Product("보쌈훈제보쌈", "둘이먹다 넷이 죽어도 모를 훈제보쌈", 2.6)
        };
        Product[] lunchBossam = new Product[]{
                new Product("보쌈도시락", "야무진 점심특선", 0.9),
                new Product("특보쌈도시락", "더 야무진 점심특선", 1.2)
        };
        Product[] addArray = new Product[]{
                new Product("비빔막국수", "빠지면 섭한 비빔막국수", 0.5),
                new Product("소주", "키야", 0.3),
                new Product("맥주", "크아", 0.4)
        };

        // 메뉴 클래스에 상품 클래스 추가
        menuArray[0].setProduct(soloBossam);
        menuArray[1].setProduct(coupleBossam);
        menuArray[2].setProduct(lunchBossam);
        menuArray[3].setProduct(addArray);

        // 로직
        while (true) {
            // 메인 메뉴 출력
            printMainMenu(menuArray);

            // 메인 메뉴 선택 입력값
            Scanner scan = new Scanner(System.in);
            checkInt = scan.next();
            int menuNumber = thisScanner(checkInt);

            System.out.println();
            switch (menuNumber) {
                case -1:
                    System.out.println("잘못 입력하셨습니다! 메뉴판으로 돌아갑니다.");
                    break;
                case 1:
                    System.out.println("\"HANJOON BOSSAM 에 오신걸 환영합니다.\"");
                    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                    System.out.println("[ Solo MENU ]");
                    if (printUnderMenu(menuArray, 1, order) == -1) {
                        System.out.println("잘못 입력하셨습니다! 메뉴판으로 돌아갑니다.");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("\"HANJOON BOSSAM 에 오신걸 환영합니다.\"");
                    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                    System.out.println("[ Couple Bossam MENU ]");
                    if (printUnderMenu(menuArray, 1, order) == -1) {
                        System.out.println("잘못 입력하셨습니다! 메뉴판으로 돌아갑니다.");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("\"HANJOON BOSSAM 에 오신걸 환영합니다.\"");
                    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                    System.out.println("[ Lunch MENU ]");
                    if (printUnderMenu(menuArray, 1, order) == -1) {
                        System.out.println("잘못 입력하셨습니다! 메뉴판으로 돌아갑니다.");
                        break;
                    }
                    break;
                case 4:
                    System.out.println("\"HANJOON BOSSAM 에 오신걸 환영합니다.\"");
                    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                    System.out.println("[ Add MENU ]");
                    if (printUnderMenu(menuArray, 1, order) == -1) {
                        System.out.println("잘못 입력하셨습니다! 메뉴판으로 돌아갑니다.");
                        break;
                    }
                    break;
                case 5:
                    System.out.println("아래와 같이 주문 하시겠습니까?");
                    System.out.println();
                    System.out.println("[ Orders ]");
                    // 옵션 넣었을 때 총 가격
                    double totalPrice = 0;
                    for (int i = 0; i < order.product.size(); i++) {
                        System.out.println(String.format("%-17s", order.product.get(i).name) +
                                " | " + "W " + String.format("%.1f", order.product.get(i).tempPrice) +
                                " | " + order.product.get(i).num + " 개 " +
                                " | " + order.product.get(i).explanation);

                        // 선택 요구사항 3. 총 판매금액 조회 기능 추가(tempPrice)
                        totalPrice += order.product.get(i).tempPrice;
                    }
                    System.out.println();
                    System.out.println("[ Total ]");
                    System.out.println("W " + String.format("%.1f", totalPrice));
                    System.out.println();
                    System.out.println("1. 주문       2. 메뉴판");
                    // 주문하기 or 메뉴판으로 돌아가기 선택지
                    checkInt = scan.next();
                    int orderOrMenu = thisScanner(checkInt);
                    if (orderOrMenu == 1) {
                        if (totalPrice == 0) {
                            System.out.println("주문 할 수 없습니다!");
                            break;
                        }
                        System.out.println("주문이 완료되었습니다!");
                        // 모든 가격 합친것
                        RealTotalPrice += totalPrice;

                        // 선택 요구사항 4. 총 판매상품 목록 조회 기능 추가
                        for (int i = 0; i < order.product.size(); i++) {
                            order.allSaleStatus(order.product.get(i).name, order.product.get(i).tempPrice);
                        }

                        // 대기번호
                        waitingNumber++;
                        System.out.println("대기번호는 [ " + waitingNumber + " ] 번 입니다.");
                        System.out.println("3초후 메뉴판으로 돌아갑니다.");

                        // 선택 요구사항 1. 주문 개수 기능 추가(num 이용)
                        for (int i = 0; i < order.product.size(); i++) {
                            order.product.get(i).num = 0;
                            order.product.get(i).tempPrice = 0;
                        }
                        order.product.clear();
                        // 3초 수면
                        try {
                            Thread.sleep(3000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (orderOrMenu == 2) {
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                    break;
                case 6:
                    System.out.println("진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1. 확인       2. 취소");
                    checkInt = scan.next();
                    int orderOkOrCancle = thisScanner(checkInt);
                    if (orderOkOrCancle == 1) {
                        for (int i = 0; i < order.product.size(); i++) {
                            order.product.get(i).num = 0;
                            order.product.get(i).tempPrice = 0;
                        }
                        order.product.clear();
                        System.out.println("진행하던 주문이 취소되었습니다.");
                    } else {
                        break;
                    }
                    break;
                case 0:
                    System.out.println("[ 총 판매금액 현황 ]");
                    System.out.println("현재까지 총 판매된 금액은 [ W " + String.format("%.1f", RealTotalPrice) + " ] 입니다.");
                    System.out.println();
                    System.out.println("[ 총 판매상품 목록 현황 ]");
                    System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
                    System.out.println();
                    for (int i = 0; i < order.allSalesName.size(); i++) {
                        System.out.printf("%-17s%n", "- " + order.allSalesName.get(i) + " | W " + String.format("%.1f", order.allSalesPrice.get(i)));
                    }
                    System.out.println("1. 돌아가기");
                    checkInt = scan.next();
                    int back = thisScanner(checkInt);
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}

