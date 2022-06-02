package lap6;

public enum Category {
    FOOD ("Thuc pham"), HOUSEWARE ("Do gia dung"), COSMETICS ("My pham"), FASION ("Thoi trang");

    private String value;

    private  Category(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
