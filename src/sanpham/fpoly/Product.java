package sanpham.fpoly;

public class Product {
    private String ten;
    private String id;
    private double gia;

    public Product(String ten, String id, double gia) {
        setTen(ten);
        setId(id);  
        setGia(gia);
    }

    public void setTen(String ten) {
        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten san pham khong duoc de trong");
        }
        this.ten = ten;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID san pham khong duoc de trong");
        }
        this.id = id;
    }

    public void setGia(double gia) {
        if (gia < 0) {
            throw new IllegalArgumentException("Gia san pham khong duoc am");
        }
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public String getId() {
        return id;
    }

    public double getGia() {
        return gia;
    }

    public double finalPrice() {
        return gia;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", ten=" + ten + ", gia=" + gia + "]";
    }
}