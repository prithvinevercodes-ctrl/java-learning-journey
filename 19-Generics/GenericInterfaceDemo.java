// Generic interface for saving data
interface Repository<T> {
    void save(T item);
    T getById(int id);
}

// Simple student class
class StudentData {
    int id;
    String name;

    StudentData(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Student repository implementation
class StudentRepository implements Repository<StudentData> {
    private StudentData student;

    @Override
    public void save(StudentData item) {
        student = item;
    }

    @Override
    public StudentData getById(int id) {
        if (student != null && student.id == id) {
            return student;
        }
        return null;
    }
}

// Product class
class ProductData {
    int id;
    String name;

    ProductData(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Product repository implementation
class ProductRepository implements Repository<ProductData> {
    private ProductData product;

    @Override
    public void save(ProductData item) {
        product = item;
    }

    @Override
    public ProductData getById(int id) {
        if (product != null && product.id == id) {
            return product;
        }
        return null;
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        StudentRepository studentRepo = new StudentRepository();
        studentRepo.save(new StudentData(1, "Sarthak"));

        ProductRepository productRepo = new ProductRepository();
        productRepo.save(new ProductData(101, "Laptop"));

        StudentData student = studentRepo.getById(1);
        ProductData product = productRepo.getById(101);

        System.out.println("Student: " + (student != null ? student.name : "Not found"));
        System.out.println("Product: " + (product != null ? product.name : "Not found"));
    }
}
