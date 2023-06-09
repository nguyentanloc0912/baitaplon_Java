USE [QuanLiXe_New]
GO
/****** Object:  Table [dbo].[ct_hoadon]    Script Date: 01/05/2023 11:45:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ct_hoadon](
	[MaCTHoaDon] [varchar](10) NOT NULL,
	[MaHoaDon] [varchar](20) NULL,
	[MaSP] [varchar](10) NULL,
	[SoLuong] [int] NULL,
	[ThanhTien] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCTHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hoadon]    Script Date: 01/05/2023 11:45:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hoadon](
	[MaHoaDon] [varchar](20) NOT NULL,
	[Ngay] [date] NOT NULL,
	[MaKH] [varchar](50) NULL,
	[TongTien] [bigint] NULL,
	[username] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[khachhang]    Script Date: 01/05/2023 11:45:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khachhang](
	[TenKH] [nvarchar](100) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Email] [varchar](50) NULL,
	[MaKH] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[sanpham]    Script Date: 01/05/2023 11:45:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sanpham](
	[MaSP] [varchar](10) NOT NULL,
	[TenSP] [nvarchar](100) NOT NULL,
	[GiaBan] [bigint] NULL,
	[nuocSX] [nvarchar](50) NOT NULL,
	[soSuon] [nvarchar](50) NOT NULL,
	[soPK] [int] NOT NULL,
	[soKhung] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 01/05/2023 11:45:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[username] [varchar](30) NOT NULL,
	[password] [varchar](30) NULL,
	[HoTen] [nvarchar](50) NULL,
	[NgaySinh] [datetime] NULL,
	[Email] [varchar](50) NULL,
	[Phone] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[khachhang] ADD  DEFAULT (NULL) FOR [TenKH]
GO
ALTER TABLE [dbo].[khachhang] ADD  DEFAULT (NULL) FOR [DiaChi]
GO
ALTER TABLE [dbo].[khachhang] ADD  DEFAULT (NULL) FOR [Email]
GO
ALTER TABLE [dbo].[khachhang] ADD  DEFAULT (NULL) FOR [MaKH]
GO
ALTER TABLE [dbo].[ct_hoadon]  WITH CHECK ADD FOREIGN KEY([MaHoaDon])
REFERENCES [dbo].[hoadon] ([MaHoaDon])
GO
ALTER TABLE [dbo].[ct_hoadon]  WITH CHECK ADD FOREIGN KEY([MaSP])
REFERENCES [dbo].[sanpham] ([MaSP])
GO
ALTER TABLE [dbo].[hoadon]  WITH CHECK ADD FOREIGN KEY([MaKH])
REFERENCES [dbo].[khachhang] ([MaKH])
GO
ALTER TABLE [dbo].[hoadon]  WITH CHECK ADD FOREIGN KEY([username])
REFERENCES [dbo].[TaiKhoan] ([username])
GO
--------------------------------------------------------------------------------
drop proc hdtheongay
go
create proc hdtheongay @tungay date, @denngay date
as
select sanpham.TenSP,sanpham.GiaBan, SoLuong, TongTien = SoLuong * sanpham.GiaBan
from [dbo].sanpham join [dbo].ct_hoadon on sanpham.MaSP = ct_hoadon.MaSP
join [dbo].hoadon on hoadon.MaHoaDon = ct_hoadon.MaHoaDon
where Ngay between @tungay and @denngay
--------------------------------------------------------------------------------
go
CREATE VIEW baoCaoView AS 
SELECT sanpham.TenSP,GiaBan,SoLuong,TongTien = SoLuong*GiaBan
FROM sanpham join ct_hoadon 
on sanpham.MaSP = ct_hoadon.MaSP
GO
---------------------------------------------------------------------------------