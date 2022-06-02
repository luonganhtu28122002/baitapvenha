package lap6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
    List<Product> listProducts = new ArrayList<>();

    public Repository() {
        listProducts.add(new Product("01", "Banh Doraemon 3 vi", Category.FOOD, 100, 3500, 57));
        listProducts.add(new Product("02", "Xuc xich suon non", Category.FOOD, 150, 3500, 12));
        listProducts.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product("04", "Banh khoai mon", Category.FOOD, 200, 42000, 78));
        listProducts.add(new Product("05", "Thia an com inox ma vang", Category.HOUSEWARE, 50, 8000, 4));
        listProducts.add(new Product("06", "Bat dung gia vi", Category.HOUSEWARE, 65, 4000, 44));
        listProducts.add(new Product("07", "Nuoc hoa hong Soothing Facial Toner Simple", Category.COSMETICS, 140, 92000, 88));
        listProducts.add(new Product("08", "Combo goi xa HAIRBURST", Category.COSMETICS, 100, 639000, 7));
        listProducts.add(new Product("09", "Tinh chat duong am sau Klairs Rich Moist Soothing Serum", Category.COSMETICS, 50, 249000, 24));
        listProducts.add(new Product("10", "Kem duong the Paula's Choice RESIST WEIGHTLESS BODY TREATMENT", Category.COSMETICS, 80, 715000, 63));
        listProducts.add(new Product("11", "Ao thun TSUN", Category.FASION, 250, 320000, 146));
    }
    public void show() {
        //su dung foreach
        //for (Product product : listProduct) {
        //    System.out.println(product):
        //}

        //Su dung lambda
        listProducts.forEach(product -> System.out.println(product));
    }

    public void sorProductByName() {
        //su dung comparator
        //ListProducts.sort(new Comparator<Product>() {

        //@Override
        //public int compare(Produc o1, Product o2) {
        //     return o1.getName().compareTo(o2.getName());
        //}
        //});
        //su dung lambda
        listProducts.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
}
   public void filterProductByPrice(){
    //for (Product product : listProducts) {
      //  if (product.getPrice() > 10000) {
          //  System.out.println(product);
        //}
    //}
    //su dung lambda va stream
    listProducts.stream()
            .filter(product -> product.getPrice() > 10000)
            .forEach(product -> System.out.println(product));
    }
    public void countProductByAmountSale(){
        long count = listProducts.stream()
                .filter(product -> product.getAmountSale() >= 50)
                .count();
        System.out.println("So luong cac san pham bans duoc tu 50 tro len la: " + count);
    }
}
