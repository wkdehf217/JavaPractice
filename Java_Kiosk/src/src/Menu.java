public class Menu {
    // 메뉴 이름
    String name;
    // 메뉴 설명
    String explanation;
    Product[] product;

    public Menu(String name, String explanation) {
        this.name = name;
        this.explanation = explanation;
    }

    public void setProduct(Product... product) {
        this.product = product;
    }


}
