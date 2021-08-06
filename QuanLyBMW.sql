 create database QuanLyBMW

 use QuanLyBMW
 create table LoaiSanpham
(
	IDLoai varchar(20) primary key,
	TenLoai nvarchar(20),
	Chongoi int
)

GO
create table Sanpham
(
	IDSanPham varchar(20) primary key,
	TenSanPham nvarchar(40),
	IDLoai varchar(20) FOREIGN KEY REFERENCES LoaiSanpham(IDLoai),
	Gia money,
	Brand nvarchar(20)
)
alter table Sanpham add  Soluong int 

ALTER TABLE Sanpham  ALTER COLUMN  Gia  BIGINT




GO
create table Hoadon
(
	IDHoadon int IDENTITY(1,1) primary key,
	Ngay varchar(255),
	Total bigint,
	Tienkhachtra int,
	Tienthoi bigint
)
alter table Hoadon 
add IDKH varchar(50) FOREIGN KEY REFERENCES KhachHang(IDKH)



GO
create table KhachHang
(
	IDKH varchar(50) Primary Key,
	HoTen nvarchar(50),
	SDT varchar(50),
	GioiTinh nvarchar(50)
)




GO
create table CTHD
(
	ID int IDENTITY(1,1) primary key,
	IDHoadon int FOREIGN KEY REFERENCES Hoadon(IDHoadon),
	IDSanPham varchar(20),
	Gia bigint,
	Soluong int ,
	Total bigint
)




GO
create table Administrator
(
	TaiKhoan varchar(50) Primary key,
	MatKhau varchar(20)
)



GO
create table QuanLyKho
(
	TKNhanVien varchar(50) Primary key,
	MKNhanVien varchar(20),
	HoTen nvarchar(50),
	GioiTinh nvarchar(10),
	Phone varchar(20),
	Email varchar(50),
	Chucvu nvarchar(50),
	luong int,
	IDNhanVien varchar(50)
)



GO
create table QuanLyNhanSu
(
	TKNhanVien varchar(50) Primary key,
	MKNhanVien varchar(20),
	HoTen nvarchar(50),
	GioiTinh nvarchar(10),
	Phone varchar(20),
	Email varchar(50),
	Chucvu nvarchar(50),
	luong int,
	IDNhanVien varchar(50)
)



GO
create table NhanVien
(
	TKNhanVien varchar(50) Primary key,
	MKNhanVien varchar(20),
	HoTen nvarchar(50),
	GioiTinh nvarchar(10),
	Phone varchar(20),
	Email varchar(50),
	Chucvu nvarchar(50),
	luong int,
	IDNhanVien varchar(50)
)





-- Thêm 4 TK admin vào nhóm 
Insert into Administrator values('GTY','333888')
Insert into Administrator values('Uyensexy','333888')
Insert into Administrator values('Nguyenmanhme','333888')
Insert into Administrator values('Anhmenly','333888')

--Thêm 3 Nhân viên bán hàng 
Insert into NhanVien values('Hung','123456',N'Min Hoo','Nam','090988965','Nguyenmanhme@gmail.com',N'Nhân Viên',1000000,'NV001')
Insert into NhanVien values('Vy','123456',N'Nhật Vỹ',N'Nữ','01237766','Uyenmumim@yahoo.com',N'Quản Lý',1500000,'NV001')
Insert into NhanVien values('Dat','123456',N'Quảng Đạt','Nam','0908776655','Datngokngeck@gmail.com',N'Nhân Viên',1000000,'NV001')
Insert into NhanVien values('Thai','123456',N'Thái Dúi','Nam','0908723425','Thaingokngeck@gmail.com',N'Nhân Viên',1000000,'NV001')


--Thêm 3 Nhân viên Kho 
Insert into QuanLyKho values('Hiphopnevadie','123456',N'SnoopDog','Nam','090988965','imonthetop@gmail.com',N'Quản Lý Kho',1000000,'QLK001')


--Thêm QuanLyKho Nhân viên nhân sự
Insert into QuanLyNhanSu values('Killer','123456',N'John Wick','Nam','090988965','donttouchmydog@gmail.com',N'Quản lý nhân sự',1000000,'QLNS001')

--Thêm Khách hàg
Insert into KhachHang values('KH001',N'Minh Hưng','09081630889',N'Nam')

--Inser 4 Loại hàng
Insert into LoaiSanpham values('B01','Sedan','5')
Insert into LoaiSanpham values('B02','SUV','7')
Insert into LoaiSanpham values('B03','Coupe','2')
Insert into LoaiSanpham values('B04','Sport','2')

--Inser 4 Sản phẩm
Insert into Sanpham values('T001','BMW 330i','B01','1800000000','BMW','10')
Insert into Sanpham values('T002','BMW X5 xDrive35i','B02','3788000000','BMW','10')
Insert into Sanpham values('T003','BMW 420i Gran Coupe','B03','2000000000','BMW','10')
Insert into Sanpham values('T004','BMW I8 Protonic Frozen Yellow Edition','B04','7000000000','BMW','10')


select * from NhanVien

ALTER TABLE NhanVien
 ADD IDNhanVien varchar(50)

Select * from NhanVien where * like '%T%'

 SELECT * FROM Sanpham
WHERE Gia >= 1800000000 AND Gia <= 4700000000

SELECT * FROM Sanpham
WHERE Gia BETWEEN 1800000000 AND 5700000000

Select * from LoaiSanpham where Chongoi BETWEEN 2 and 3

UPDATE Sanpham SET Soluong = 10 WHERE IDSanPham = 'T001'
UPDATE Sanpham SET Soluong = 10 WHERE IDSanPham = 'T002'
UPDATE Sanpham SET Soluong = 10 WHERE IDSanPham = 'T003'
UPDATE Sanpham SET Soluong = 10 WHERE IDSanPham = 'T004'

SELECT SUM(total) AS DOANHTHU FROM Hoadon WHERE Year(Ngay) = ? and Day(Ngay)=? and MONTH(Ngay) = ?

select * from Sanpham