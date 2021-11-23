### Kế Thừa	 

#### [Bài 10](https://github.com/ch1nhpd/java_KMA/tree/master/src/Buoi4/Bai10) 

Viết một lớp các đối tượng Person với những đặc tính sau: Có thuộc tính tên, Có thuộc tính tuổi, Có thuộc tính giới tính.  

Từ lớp Person phát triển các lớp Employee, Manager, Student và Programmer với những đặc điểm được mô tả lần lượt như sau:  

**Lớp Employee**: Kế thừa những đặc điểm của Person (Employee là Person) 

	 o Có thuộc tính số tiền lương cơ bản. 

	 o Có thuộc tính hệ số cơ bản.  

	 o Có tính năng tính lương theo công thức. Ví du: Tiền lương = hệ số × lương cơ bản.  

**Lớp Manager**: Manager cũng là Employee do vậy mang những đặc điểm của Employee.  

	o Có thêm thuộc tính lương trách nhiệm.  
	
	o Tính năng tính lương sẽ thay đổi lại: tiền lương=(tiền lương tính như Employee) Employee) + lương trách nhiệm.  

**Lớp Student**: Phát triển từ lớp Person. Thêm thuộc tính mã sinh viên. 

**Lớp Programmer**: Phát triển từ lớp Student. Thêm thuộc tính số năm kinh nghiệm.  

#### [Bài 12](https://github.com/ch1nhpd/java_KMA/tree/master/src/Buoi4/Bai12) 

Dùng tính kế thừa khai báo 3 class: 
Class **Sinh Viên** gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền học phí còn nợ. 

Class **Giảng Viên** gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền lương hàng tháng. 

Class **Giám Đốc** gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền tiêu hàng tháng. 

#### [Bài 13](https://github.com/ch1nhpd/java_KMA/tree/master/src/Buoi4/Bai13) 

- Lớp *tên người Việt* gồm 2 thuộc tính: "họ" và "tên" và phương thức hiển thị tên đầy đủ theo thứ tự họ + tên 

- Lớp *tên người nước ngoài* kế thừa từ lớp *tên người Việt* , phương thức hiển thị tên đầy đủ lại theo thứ tự tên + họ 

 

> Vd: tên người Việt: Nguyễn Văn Hiếu ; tên nước ngoài: Văn Hiếu NGUYỄN 

 

#### [Bài 14](https://github.com/ch1nhpd/java_KMA/tree/master/src/Buoi4/Bai14) 

- Lớp *HocSinh* gồm các thuộc tính: hoTen, lop, toan, ly, hoa và phương thức điểm trung bình là trung bình cộng 3 môn 

- Lớp *HocSinhChuyenToan* kế thừa từ lop *HocSinh*, nhưng khi tính điểm trung bình nhân đôi hệ số môn Toán rồi cộng tất cả, chia cho 4.  

 

#### [Bài 15](https://github.com/ch1nhpd/java_KMA/tree/master/src/Buoi4/Bai15) 

 

- Class *USB* có các thuộc tính: mã hàng, giá, số lượng. Phương thức tổng tiền = giá * số lượng, phương thức show in ra toàn bộ thông tin đơn hàng mua USB 

- Class *Mouse* kế thừa từ class USB, ghi đè 2 phương thức tổng tiền (do chuột được giảm giá 20%) và show in toàn bộ thông tin đơn hàng khi khách hàng mua chuột máy tính. 

- Tạo mỗi lớp 1 đối tượng, nhập thông tin từ bàn phím, in thông tin đơn hàng ra màn hình! 
