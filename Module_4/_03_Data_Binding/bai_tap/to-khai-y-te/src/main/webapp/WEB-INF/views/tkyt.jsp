<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tr" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="tkyt" modelAttribute="kbyt" method="post">
    <h3>Ho va ten</h3>
    <form:input path="hoTen" cssStyle="width: 100%"/>
    <table style="width: 100%; text-align: left">
        <tr>
            <th>Nam Sinh</th>
            <th>Gioi Tinh</th>
            <th>Quoc tich</th>
        </tr>
        <tr>
            <td>
                <form:select path="tuoi" items="${namSinh}" cssStyle="width: 100%"/>
            </td>
            <td>
                <form:select path="gioiTinh" items="${gioiTinh}" cssStyle="width: 100%"/>
            </td>
            <td>
                <form:select path="quocTich" items="${quocTich}" cssStyle="width: 100%"/>
            </td>
        </tr>
    </table>
    <h3>CMNH hoac Ho Chieu</h3>
    <form:input path="cmnd" cssStyle="width: 100%"/>

    <h3>Thong Tin Di Lai</h3>
    <td><form:radiobuttons path="thongTinDiLai" items="${thongTinDiLai}"/></td> <br> <br>

    <table style="width: 100%; text-align: left">
        <tr>
            <th>So Hieu Phuogn Tien</th>
            <th>So Ghe</th>
        </tr>
        <tr>
            <td>
                <form:input path="soHieuPhuongTien" cssStyle="width: 100%"/>
            </td>
            <td>
                <form:input path="soGhe" cssStyle="width: 100%"/>
            </td>
        </tr>
        <tr>
            <th>Ngay Khoi Hanh</th>
            <th>Ngay Ket Thuc</th>
        </tr>
        <tr>
            <td>
                <form:input type="date" path="ngayKhoiHanh"  cssStyle="width: 100%"/>
            </td>
            <td>
                <form:input type="date" path="ngayKetThuc"  cssStyle="width: 100%"/>
            </td>
        </tr>
    </table>
    <h3>Trong 14 gio qua, Anh/Chi co den tinh/thanh pho nao?</h3>
    <td><form:textarea path="diChuyen14" cssStyle="width: 100%" /></td> <br> <br>
    <h3>Dia chi lien lac</h3>
    <table style="width: 100%; text-align: left">
        <tr>
            <th>Tinh/Thanh</th>
            <th>Quan/Huyen</th>
            <th>Phuong/Xa</th>
        </tr>
        <tr>
            <form:form modelAttribute="diaChiLienLac" path="diaChiLienLac" >
                <td>
                    <form:input path="tinhThanh" cssStyle="width: 100%"/>
                </td>
                <td>
                    <form:input path="quanHuyen"  cssStyle="width: 100%"/>
                </td>
                <td>
                    <form:input path="phuongXa"  cssStyle="width: 100%"/>
                </td>
            </form:form>
        </tr>

    </table>

    <form:button>Update</form:button>
</form:form>
</body>
</html>
