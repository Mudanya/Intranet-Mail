
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="fontawesome/css/all.css">
          <script src="bootstrap/jquery.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
          <style>
              body{
                
              }
              .alin{text-align: right;}
          </style>
       </head>
    <body background="bak.JPG" data-spy="scroll" data-target="#myScrollspy" data-offset="1">
       <div class="container ">

    <ul class="nav flex-column nav-justified nav-pills " id="myScrollspy">
        <li class="nav-item alert-primary">
            <a class="nav-link alin" data-toggle="pill" href="inboxServlet" target="rightside">Inbox <i class="fa fa-inbox"></i></a>
        </li>
        
        <li class="nav-item alert-primary">
        <a class="nav-link alin" data-toggle="pill" href="Compose.jsp" target="rightside">Compose <i class="fa fa-comment-alt"></i></a>
        </li>
        
        <li class="nav-item alert-primary">
        <a class="nav-link alin" data-toggle="pill" href="reset.jsp" target="rightside">Options <i class="fa fa-microchip"></i></a>
        </li>
        
        <li class="nav-item alert-primary">
        <a class="nav-link alin" data-toggle="pill" href="address" target="rightside">Address <i class="fa fa-address-book"></i></a>
        </li>
        
        <li class="nav-item alert-primary">
        <a class="nav-link alin" data-toggle="pill" href="SentMsg" target="rightside">Sent <i class="fa fa-comment-dots"></i></a>
        </li>
        
         <li class="nav-item alert-primary">
        <a class="nav-link alin" data-toggle="pill" href="Spam" target="rightside">Spam <i class="fa fa-exclamation-triangle"></i></a>
        </li>
        
        <li class="nav-item alert-primary">
        <a class="nav-link alin" data-toggle="pill" href="Logout" target="_top">Log out <i class="fa fa-toggle-off"></i></a>
        </li>
    </ul>   

     </div>     
    </body>
</html>
