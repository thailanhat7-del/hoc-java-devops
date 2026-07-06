package com.example.demodevops;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Bảo Spring Boot: "Hãy tự tạo một bảng tên là dev_ops_member trong Database"
public class DevOpsMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng ID (1, 2, 3...)
    private Long id;
    
    private String name;

    // Các hàm bắt buộc phải có cho Java Data
    public DevOpsMember() {}
    public DevOpsMember(String name) { this.name = name; }
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}