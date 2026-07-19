import java.util.ArrayList;

class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ProductRepository {
    private ArrayList<Product> products = new ArrayList<>();

    // Save product
    public void save(Product product) {
        products.add(product);
    }

    // Find product by id
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        repo.save(new Product(101, "Mobile"));
        repo.save(new Product(102, "Headphones"));

        Product result = repo.findById(101);
        if (result != null) {
            System.out.println("Found product: " + result.getName());
        } else {
            System.out.println("Product not found.");
        }
    }
}
