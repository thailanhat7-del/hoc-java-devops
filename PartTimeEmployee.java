
public class PartTimeEmployee extends Employee {
    private int shiftsWorked;     // Số ca làm việc
    private double ratePerShift;  // Tiền lương trên mỗi ca

    public PartTimeEmployee(int id, String name, double baseSalary, int shiftsWorked, double ratePerShift) {
        super(id, name, baseSalary); // Mặc dù Part-time lương cơ bản bằng 0, vẫn phải truyền lên Cha
        this.shiftsWorked = shiftsWorked;
        this.ratePerShift = ratePerShift;
    }

    // @Override: Ghi đè hàm tính lương theo công thức của Part-time
    @Override
    public double calculateSalary() {
        // Lương Part-time = Số ca làm * Tiền mỗi ca
        return shiftsWorked * ratePerShift;
    }
}