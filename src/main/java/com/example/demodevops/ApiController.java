package com.example.demodevops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private MemberRepository memberRepository; // Triệu hồi bộ điều khiển DB vào  đây
 
    // API 1: Thêm thành viên mới qua URL. Ví dụ: /api/add?name=Yen
    @GetMapping("/api/add")
    public String addMember(@RequestParam String name) {
        DevOpsMember newMember = new DevOpsMember(name);
        memberRepository.save(newMember); // Lệnh lưu thẳng xuống PostgreSQL!
        return "Đã thêm thành viên [" + name + "] vào Database thành công!";
    }

    // API 2: Lấy ra toàn bộ danh sách thành viên đang có
    @GetMapping("/api/members")
    public List<DevOpsMember> getAllMembers() {
        return memberRepository.findAll(); // Lệnh quét toàn bộ Database mang về
    }
}