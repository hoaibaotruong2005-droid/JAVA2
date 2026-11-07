package nhanvien.fpoly;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new FullTimeEmployee("FT01", "Nguyen Van A", 10000000, 2000000, 500000));
        list.add(new FullTimeEmployee("FT02", "Tran Thi B", 12000000, 3000000, 0));

        list.add(new PartTimeEmployee("PT01", "Le Van C", 0, 80, 50000));
        list.add(new PartTimeEmployee("PT02", "Pham Thi D", 0, 100, 60000));

        list.add(new Employee("NV03", "Hoang Van E", 8000000));
        

        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (Employee e : list) {
            System.out.println(e.toString() + " | Thu nhap: " + e.income());
            System.out.println("");
        }

        if (!list.isEmpty()) {
            Employee maxIncomeEmployee = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).income() > maxIncomeEmployee.income()) {
                    maxIncomeEmployee = list.get(i);
                }
            }

            System.out.println("\n=== NHAN VIEN CO THU NHAP CAO NHAT ===");
            System.out.println(maxIncomeEmployee.toString() + " | Thu nhap: " + maxIncomeEmployee.income());
        }
    }
}