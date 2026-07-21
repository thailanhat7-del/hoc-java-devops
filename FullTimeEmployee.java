package com.hr.management;

public class FullTimeEmployee extends Employee {
    private double bonus; // Tiền thưởng riêng của nhân viên Full-time

    // Constructor của con: Phải gọi lại Constructor của Cha thông qua từ khóa 'super'
    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary); // Đẩy id, name, baseSalary lên cho lớp Cha xử lý
        this.bonus = bonus;         // Riêng bonus thì lớp Con tự giữ
    }

    // @Override: Từ khóa báo hiệu cho Java biết ta đang "Ghi đè" (Overriding) lại hàm của Cha
    @Override
    public double calculateSalary() {
        // Lương Full-time = Lương cơ bản (lấy từ Cha thông qua Getter) + Tiền thưởng
        return getBaseSalary() + bonus;
    }
}