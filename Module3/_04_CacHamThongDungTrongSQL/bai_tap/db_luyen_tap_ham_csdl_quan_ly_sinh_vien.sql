use quanlysinhvien;

-- Bai 4 : Các hàm thông dụng trong SQL

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.

select subid,subname,credit
from `subject` 
where credit in (select max(credit) from `subject` );

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.

select `subject`.subid,`subject`.subname, mark.mark
from mark join `subject` on mark.subid = `subject`.subid where mark in (select max(mark) from mark );

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

select student.studentid, student.studentname, avg(mark.mark) as `avg`
from student  left join mark on student.studentid = mark.studentid group by student.studentname order by `avg` desc ;


