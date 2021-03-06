<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="bootstrap413/css/bootstrap-grid.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.css"/>
    <script src="jquery/jquery-3.5.1.min.js"></script>
    <script src="datatables/js/jquery.dataTables.min.js"></script>
    <script src="datatables/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row bg-info p-xl-3">
        <div class="col-lg-3 col-md-6 col-sm-12 d-flex justify-content-center ">
            <img style="height: 32px; width: 32px"
                 src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Blackberry_Logo_without_wordmark.svg/1200px-Blackberry_Logo_without_wordmark.svg.png">
        </div>
        <div class="col-lg-6 col-md-6 col-sm-12"></div>
        <div class="col-lg-3 col-md-6 col-sm-12  d-flex justify-content-md-end">
                <p style="color: red"> <c:if test='${usernameSession == null}'>
                    <a href="/login?action=login">Sign In</a>
                </c:if></p>
            <p style="color: red"> <c:if test='${usernameSession != null}'>

                <a href="/login?action=hungnn"> <%=request.getSession().getAttribute("usernameSession")%></a>
            </c:if></p>
        </div>
    </div>
    <div class="row bg-light p-xl-3 d-flex justify-content-center">
        <div class=" col-md-6 col-lg-9 col-sm-12 d-flex justify-content-center ">
            <a class="navbar-brand fw-bold " href="#">Home</a>
            <button class="navbar-toggler " type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
            </button>
            <a class="navbar-brand" href="/employee">Employee</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
            </button>
            </button>
            <a class="navbar-brand" href="customer">Customer</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
            </button>
            <a class="navbar-brand" href="facility">Service</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
            </button>
            <a class="navbar-brand" href="contract">Contract</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
            </button>
        </div>

        <div class=" col-md-6 col-lg-3 col-sm-12 ">
            <div>
                <input type="search" placeholder="What're you searching for?" aria-describedby="button-addon2"
                       class="form-control border-0 bg-light">
            </div>
        </div>
    </div>
    <div class="row ">
        <div class="col-md-12 col-lg-2 col-sm-12  bg-danger h-100">
            <div class="row ">
                <div class="col-md-12 col-lg-12 col-sm-12 ">
                    <a class="navbar-brand" href="#">Item One</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                    </button>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 col-lg-12 col-sm-12 ">
                    <a class="navbar-brand" href="#">Item Two</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                    </button>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 col-lg-12 col-sm-12 h-100 ">
                    <a class="navbar-brand" href="#">Item Three</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                    </button>
                </div>
            </div>
        </div>
        <div class="col-md-12 col-lg-10 col-sm-12  bg-white d-flex justify-content-center">
            <div>
                <iframe width="720px" height="480px" src="https://www.youtube.com/embed/CaIhgUtGh48"
                        title="YouTube video player" frameborder="0"
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                        allowfullscreen></iframe>
            </div>
        </div>
    </div>
    <div class="row fixed-bottom">
        <div class="col-md-12 col-lg-12 col-sm-12  bg-success d-flex justify-content-center">
            <h3>CodeGym</h3>
        </div>
    </div>
</div>


<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>
