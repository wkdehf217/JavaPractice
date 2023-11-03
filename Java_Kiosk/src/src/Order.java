import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> product = new ArrayList<Product>();
    // 총 판매
    List<String> allSalesName = new ArrayList<>();
    List<Double> allSalesPrice = new ArrayList<>();

    public void appendOrder(Product product, int optionChoice) {
        // 선택 요구사항 1. 주문 개수 기능 추가
        if (this.product.contains(product)) {
            product.num++;
            if (optionChoice == 1) product.tempPrice = product.price + product.num * 5.4;
            if (optionChoice == 2) product.tempPrice = product.price + product.num * 9.0;
        } else {
            this.product.add(product);
            product.num++;
            if (optionChoice == 1) product.tempPrice = product.price + product.num * 5.4;
            if (optionChoice == 2) product.tempPrice = product.price + product.num * 9.0;
        }
    }

    public void allSaleStatus(String name, double price) {
        allSalesName.add(name);
        allSalesPrice.add(price);
    }
}
