package nhanvien.fpoly;

public class PartTimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double baseSalary, double workingHours, double hourlyRate) {
        super(id, name, baseSalary);
       setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    public void setWorkingHours(double workingHours) {
        if (workingHours < 0) {
            throw new IllegalArgumentException("So gio lam viec khong duoc am!");
        }
        this.workingHours = workingHours;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Muc luong theo gio khong duoc am!");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double income() {
        return workingHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee [id=" + getId() + ", name=" + getName() 
                + ", workingHours=" + workingHours + ", hourlyRate=" + hourlyRate 
                + ", income=" + income() + "]";
    }
}