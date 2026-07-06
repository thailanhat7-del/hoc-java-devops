package com.example.demodevops;

import org.springframework.data.jpa.repository.JpaRepository;

// Kế thừa JpaRepository để lấy toàn bộ phép thuật thao tác Database
public interface MemberRepository extends JpaRepository<DevOpsMember, Long> {
}