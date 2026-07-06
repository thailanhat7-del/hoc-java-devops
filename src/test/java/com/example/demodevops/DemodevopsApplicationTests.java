package com.example.demodevops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemodevopsApplicationTests {

    @Autowired
    private ApiController apiController;

    @Test
    void testGetAllMembersNotNull() {
        // Bài test quy định: Hàm này chạy PHẢI ra kết quả, KHÔNG ĐƯỢC PHÉP NULL!
        assertNotNull(apiController.getAllMembers(), "Lỗi nghiêm trọng: Danh sách trả về bị null rồi!");
    }
}