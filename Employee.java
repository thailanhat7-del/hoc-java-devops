
// Từ khóa 'abstract' nghĩa là lớp này chưa hoàn chỉnh, không thể tạo trực tiếp bằng lệnh 'new Employee()'
public abstract class Employee {
    
    // Sử dụng 'private' để bảo mật dữ liệu (Tính đóng gói)
    // Các lớp con muốn lấy hoặc sửa dữ liệu phải đi qua hàm Getter/Setter công khai
    private int id;
    private String name;
    private double baseSalary;

    // Constructor (Hàm khởi tạo): Dùng để nạp dữ liệu khi vừa tạo đối tượng
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Một hàm 'abstract' (trừu tượng): Không có thân hàm {}, kết thúc bằng dấu chấm phẩy
    // Ép buộc tất cả các lớp con kế thừa từ nó PHẢI tự viết lại logic tính lương riêng
    public abstract double calculateSalary();

    // --- Các hàm Getter và Setter để lớp bên ngoài có thể truy cập hợp pháp ---
    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}