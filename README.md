# <p align="center">🔥 Nhóm: SE2022-15.2 🔥</p>
![image](https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.15752-9/318555024_1329625234477079_3514193759606326494_n.png?_nc_cat=104&ccb=1-7&_nc_sid=ae9488&_nc_ohc=c_qTARUiAOYAX_j-7kC&_nc_ht=scontent.fsgn2-5.fna&oh=03_AdSjcKzlW7fPImTIFj62kVm2HulUSDqOa92_CHKXSkyvYQ&oe=63C811BF)
# <p align="center">ĐỀ TÀI: Back-End mastering với các công nghệ CI/CD/Cloud hiện đại</p>
<p align="center">
 <a href="https://github.com/Hunter1202/se2022-15.2/main/README.md#2011---2711">Báo cáo tuần 1</a>
 .
 <a href="https://github.com/Hunter1202/se2022-15.2/edit/main/README.md#2711---312">Báo cáo tuần 2</a>
 .
 <a href="https://github.com/Hunter1202/se2022-15.2/edit/main/README.md#412---1212">Báo cáo tuần 3</a>
 .
 <a href="https://github.com/Hunter1202/se2022-15.2/edit/main/README.md#1212---2112">Báo cáo tuần 4</a>
 .
 </p>
 <p align="center"><img src="https://img.thuthuatphanmem.vn/uploads/2018/10/26/anh-gif-dep-nhat_054957921.gif" </p>
  
  - Tự động triển khai dự án phần mềm với Github Action
  - Nghiên cứu docker, triển khai một dịch vụ đơn giản.
  - SV cùng mentor xây dựng đề bài và giải quyết vấn đề

* Project Backlog: https://github.com/users/Hunter1202/projects/5

# Các thành viên:
* Lã Anh Trúc - 20002169 (C) 
* Khuất Đăng Sơn - 20002159
* Hoàng Hữu Hiếu - 20002125
* Chu Phạm Đình Tú - 20002173

# Tech Stack
### Back-end
![Java](http://img.shields.io/badge/-Java-007396?style=flat-square&logo=java&logoColor=ffffff)
![Docker](https://img.shields.io/badge/-Docker-black?style=flat-square&logo=docker)
![Servlet](https://img.shields.io/badge/Servlets--yellowgreen)
### Front-end
![JSP](https://img.shields.io/badge/-JSP-%23E44D27?style=flat-square&logo=jsp&logoColor=ffffff)
![CSS3](https://img.shields.io/badge/-CSS3-%231572B6?style=flat-square&logo=css3)
### Database
![PostgreSQL](https://img.shields.io/badge/-MySQL-336791?style=flat-square&logo=mysql)
### Others
![Git](https://img.shields.io/badge/-Git-%23F05032?style=flat-square&logo=git&logoColor=%23ffffff)
![Github Actions](http://img.shields.io/badge/-Github%20Actions-2088FF?style=flat-square&logo=github-actions&logoColor=ffffff)
![Eclipse](https://img.shields.io/badge/-Eclipse-purple)
****************************
# <p align="center">REPORTS</p>
## 12/12 - 21/12
- Viết Dockerfile cho ứng dụng Java Web đã làm
```Dockerfile
FROM tomcat:9.0.70-jdk17-corretto-al2

MAINTAINER trucla

RUN mv webapps webapps2 && mv webapps.dist webapps
ADD build/javaweb.war /usr/local/tomcat/webapps/
EXPOSE 8080
RUN chmod +x /usr/local/tomcat/bin/catalina.sh
CMD ["catalina.sh", "run"] -b 0.0.0.0
```
- Build image javaweb từ Dockerfile
![image](https://user-images.githubusercontent.com/94958811/209753554-f03ae1b8-008e-438a-894d-1adcc0fc0b0a.png)

- Tạo cointainer từ image vừa build 
![image](https://user-images.githubusercontent.com/94958811/209753799-2a538667-1a63-46a6-8194-1483d89fc8e8.png)

- Test project
![image](https://user-images.githubusercontent.com/94958811/209753694-30a5a7b9-ddeb-4d17-bbf2-e4691b58a5b0.png)
![image](https://user-images.githubusercontent.com/94958811/209753703-5d014b3d-78d2-42ad-9fbc-fd98a9cdeb36.png)


## 4/12 - 12/12
Tạo 1 website đăng ký 
+ Nhập thông tin

![image](https://user-images.githubusercontent.com/94958811/209754269-c9e958c6-76a1-4df8-85df-62ad7a0b45d5.png)

+ Xuất thông tin

![image](https://user-images.githubusercontent.com/94958811/207770267-fca57813-7221-4025-a952-a1db7409381e.png)

- Kết nối tới cơ sở dữ liệu mysql

![image](https://user-images.githubusercontent.com/94958811/207770388-c8c83a9a-8cbc-4cbc-90a1-e1096c9d3315.png)

src code: https://github.com/Hunter1202/se2022-15.2/blob/main/source.zip


****************************

## 27/11 - 3/12
- Tuần này em đã tạo 1 web servlet cơ bản tính chu vi và diện tích hình tam giác chạy trên localhost qua Tomcat 9:

![image](https://user-images.githubusercontent.com/94958811/206072188-04eda89b-9248-4358-8940-680d223ae70b.png)

![image](https://user-images.githubusercontent.com/94958811/206072175-d703c276-49c1-4a20-8d76-3cc85dd73d32.png)

Giao diện trên localhost:
![image](https://user-images.githubusercontent.com/94958811/206072163-47e7269a-508c-4742-b40f-ffa597e5d5bc.png)

Demo tính diện tích:

![image](https://user-images.githubusercontent.com/94958811/206072144-cd85f493-71e9-4f2c-ac29-a732f7107ef0.png)

Demo tính chu vi:

![image](https://user-images.githubusercontent.com/94958811/206072119-673cbd43-082e-441f-ac92-e07c67333f4a.png)

****************************

## 20/11 - 27/11

Tìm hiểu Docker, nắm được các khái niệm, cách cài đặt và sử dụng Docker về mặt cơ bản.

Dưới đây là demo image em Build dựa trên image gốc ubuntu latest:
```Dockerfile
FROM ubuntu

MAINTAINER trucla

RUN apt-get update
RUN apt-get install wget -y
RUN apt-get install curl -y

CMD curl ifconfig.io
```

Kết quả sau khi build và run image
![image](https://user-images.githubusercontent.com/94958811/206072319-7c490c21-6bfa-4330-8902-25044eda19d5.png)

Đồng thời em cũng đang triển khai 1 soap web service phục vụ cho việc deploy lên docker
![image](https://user-images.githubusercontent.com/94958811/206072345-19f79576-df34-43fa-8f77-a75730723e62.png)
![image](https://user-images.githubusercontent.com/94958811/206072358-587decce-eea9-4321-bd9e-193ed6b93cf0.png)
Tuy nhiên em đang gặp lỗi khi code nên em sẽ sửa trong tuần tới
![image](https://user-images.githubusercontent.com/94958811/206072368-c4955038-e72a-4cd1-9c12-029edafbdad4.png)

****************************


