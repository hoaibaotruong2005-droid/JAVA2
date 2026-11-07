package nhanvien.fpoly;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus, double penalty) {
        super(id, name, baseSalary);
       setBonus(bonus);
        setPenalty(penalty);
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Tien thuong khong duoc am!");
        }
        this.bonus = bonus;
    }

    public void setPenalty(double penalty) {
        if (penalty < 0) {
            throw new IllegalArgumentException("Tien phat khong duoc am!");
        }
        this.penalty = penalty;
    }

    public double getBonus() {
        return bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    @Override
    public double income() {
        return getBaseSalary() + bonus - penalty;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee [id=" + getId() + ", name=" + getName() 
                + ", baseSalary=" + getBaseSalary() + ", bonus=" + bonus 
                + ", penalty=" + penalty + ", income=" + income() + "]";
    }
}