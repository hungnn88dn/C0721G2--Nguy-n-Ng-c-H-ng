use quanlysinhvien;

select * from student 
where StudentName like "h%";

select * from class 
where month(StartDate) = 12;

select * from subject 
where Credit >= 3 And Credit <= 5;

update student
set student.ClassID= 2
where StudentName= "hung";

select student.studentid, student.studentname, subject.subname, mark.mark
from student join `subject` on student.studentid = subject.subid 
 join mark on student.studentid = mark.markid; 

