# TEST REPORT - White-box Testing

## 📌 Mục tiêu
Kiểm thử chương trình nhằm:
- Đảm bảo các câu lệnh được thực thi (Statement Coverage)
- Bao phủ tất cả các nhánh điều kiện (Branch Coverage)

---

## 🧪 1. Hàm rectangleArea(length, width)

### 🔹 Mô tả:
Tính diện tích hình chữ nhật

### 🔹 Test cases:

| TC | Input | Expected Output | Result |
|----|------|----------------|--------|
| TC01 | (3,4) | 12 | Pass |
| TC02 | (5,2) | 10 | Pass |
| TC03 | (-1,4) | Exception | Pass |
| TC04 | (3,-2) | Exception | Pass |
| TC05 | (0,5) | Exception | Pass |

---

## 🧪 2. Hàm isPrime(n)

### 🔹 Mô tả:
Kiểm tra số nguyên tố

### 🔹 Test cases:

| TC | Input | Expected Output | Result |
|----|------|----------------|--------|
| TC01 | 7 | true | Pass |
| TC02 | 2 | true | Pass |
| TC03 | 8 | false | Pass |
| TC04 | 1 | false | Pass |
| TC05 | 0 | false | Pass |
| TC06 | -5 | false | Pass |

---

## 📊 Đánh giá độ bao phủ

| Loại | Mức độ |
|------|--------|
| Statement Coverage | 100% |
| Branch Coverage | 100% |

---

## ✅ Kết luận

- Tất cả test case đều Pass
- Các nhánh điều kiện đã được kiểm thử đầy đủ
- Chương trình hoạt động đúng với yêu cầu
