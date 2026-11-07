package nhanvien.fpoly;

public class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        setId(id);
        setName(name);
        setBaseSalary(baseSalary);
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID khong duoc de trong!");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong!");
        }
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Luong co ban khong duoc am!");
        }
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double income() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", baseSalary=" + baseSalary + "]";
    }
}