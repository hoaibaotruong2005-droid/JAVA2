package sanpham.fpoly;

public class ImportedProduct extends Product {
    private double thueNhapKhau;
    private double phiVanChuyen;

    public ImportedProduct(String ten, String id, double gia, double thueNhapKhau, double phiVanChuyen) {
        super(ten, id, gia);
      setThueNhapKhau(thueNhapKhau);
        setPhiVanChuyen(phiVanChuyen);
    }

    public void setPhiVanChuyen(double phiVanChuyen) {
        if (phiVanChuyen < 0) {
            throw new IllegalArgumentException("Phi van chuyen khong duoc am");
        }
        this.phiVanChuyen = phiVanChuyen;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        if (thueNhapKhau < 0 || thueNhapKhau > 1) {
            throw new IllegalArgumentException("Thue nhap khau phai nam trong khoang tu 0 den 1");
        }
        this.thueNhapKhau = thueNhapKhau;
    }

    public double getPhiVanChuyen() {
        return phiVanChuyen;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    @Override
    public double finalPrice() {
        return getGia() + (getGia() * thueNhapKhau) + phiVanChuyen;
    }

    @Override
    public String toString() {
        return "ImportedProduct [id=" + getId() + ", ten=" + getTen() + ", gia=" + getGia() 
                + ", thueNhapKhau=" + thueNhapKhau + ", phiVanChuyen=" + phiVanChuyen 
                + ", finalPrice=" + finalPrice() + "]";
    }
}