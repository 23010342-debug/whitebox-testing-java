# White-box Testing Practice (Java + JUnit)

##  Giới thiệu
Dự án thực hành kiểm thử hộp trắng (White-box Testing) cho các bài toán lập trình cơ bản bằng Java.

Mục tiêu:
- Hiểu cấu trúc chương trình
- Thiết kế test theo luồng xử lý
- Đạt độ bao phủ cao (Statement & Branch Coverage)

---

##  Công nghệ sử dụng
- Java 17
- JUnit 5
- Maven

---

##  Cấu trúc project

src/
├── main/java/
│ └── Practice04.java
└── test/java/
└── Practice04Test.java
pom.xml
README.md
TEST_REPORT.md


---

##  Nội dung bài toán

Chương trình bao gồm:

1. Tính diện tích hình chữ nhật
2. Kiểm tra số nguyên tố

---

## 🧪 Kiểm thử

Sử dụng JUnit để kiểm thử:

- Trường hợp hợp lệ
- Trường hợp không hợp lệ (exception)
- Các nhánh điều kiện (if/else)

Ví dụ:
- rectangleArea(3,4) → 12
- rectangleArea(-1,4) → Exception
- isPrime(7) → true
- isPrime(8) → false

---

##  Cách chạy

### Cách 1: Dùng IntelliJ / VS Code
- Mở project
- Chạy file test

### Cách 2: Dùng Maven
```bash
mvn test
 Mục tiêu kiểm thử
Statement Coverage: 100%
Branch Coverage: 100%
👨‍💻 Tác giả
Sinh viên thực hành kiểm thử phần mềm
