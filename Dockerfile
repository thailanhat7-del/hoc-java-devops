# Bước 1: Chọn hệ điều hành nền có cài sẵn Java (gọi là Base Image)
FROM eclipse-temurin:25-jdk-alpine

# Bước 2: Tạo một thư mục làm việc bên trong Container ảo
WORKDIR /app

# Bước 3: Copy file Main.class từ server Codespaces vào bên trong Container
COPY Main.class /app/Main.class

# Bước 4: Lệnh sẽ chạy tự động khi Container này khởi khởi động
CMD ["java", "Main"]