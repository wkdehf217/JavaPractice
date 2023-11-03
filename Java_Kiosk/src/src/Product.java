public class Product extends Menu {
    // 가격
    double price;
    // 주문화면 상품 개수
    int num;
    // 옵션 넣었을 때 임시 가격
    double tempPrice = 0;

    public Product(String name, String explanation, double price) {
        //  ?
        super(name, explanation);
        this.price = price;
        this.num = 0;
    }
}
