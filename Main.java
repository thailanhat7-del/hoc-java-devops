package com.hr.management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo một danh sách kiểu 'Employee' (Cha) nhưng có thể chứa cả các con (FullTime, PartTime)
        // Đây chính là sức mạnh của tính Đa hình!
        List<Employee> employeeList = new ArrayList<>();

        // Thêm nhân viên Full-time (ID: 1, Tên: Huy, Lương cứng: 10tr, Thưởng: 2tr)
        Employee emp1 = new FullTimeEmployee(1, "Nguyen Van Huy", 10000000, 2000000);
        
        // Thêm nhân viên Part-time (ID: 2, Tên: An, Lương cứng: 0, Làm 20 ca, 300k/ca)
        Employee emp2 = new PartTimeEmployee(2, "Tran Thi An", 0, 20, 300000);

        employeeList.add(emp1);
        employeeList.add(emp2);

        // Duyệt qua danh sách để in bảng lương công ty
        System.out.println("=== BẢNG LƯƠNG NHÂN VIÊN ===");
        for (Employee emp : employeeList) {
            // Biến 'emp' lúc này tự biết gọi hàm calculateSalary() của đúng lớp con tương ứng
            // Mặc dù kiểu khai báo của nó là kiểu Cha (Employee)
            System.out.println("Nhân viên: " + emp.getName() + " | Thực nhận: " + emp.calculateSalary() + " VND");
        }
    }
}