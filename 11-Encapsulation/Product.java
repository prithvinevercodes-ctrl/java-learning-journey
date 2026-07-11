public class Product {
    // Private fields
    private int productId;
    private String productName;
    private double price;
    private int stock;

    // Constructor
    public Product(int productId, String productName, double price, int stock) {
        this.productId = productId;
        setProductName(productName);
        setPrice(price);
        setStock(stock);
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    // Validate product name
    public void setProductName(String productName) {
        if (productName != null && !productName.trim().isEmpty()) {
            this.productName = productName;
        } else {
            System.out.println("Invalid product name. Setting default name.");
            this.productName = "Unnamed Product";
        }
    }

    public double getPrice() {
        return price;
    }

    // Validate price
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative. Setting price to 0.");
            this.price = 0;
        }
    }

    public int getStock() {
        return stock;
    }

    // Validate stock
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock cannot be negative. Setting stock to 0.");
            this.stock = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 55000, 10);
        Product p2 = new Product(2, "", -1000, -5);

        System.out.println("Product 1:");
        p1.displayDetails();

        System.out.println("
Product 2:");
        p2.displayDetails();
    }
}
