<%-- 
    Document   : welcome
    Created on : Jul 31, 2018, 3:34:36 AM
    Author     : Nexo Bentola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
         <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        
           <script src="jquery/3.3.1/jquery.min.js"></script>
          <script src="bootstrap/js/bundle.js"></script>
          <script src="bootstrap/js/bundle.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        
        <style>
 
  .carousel-inner img {
      width: 100%;
      height: 100%;
  }
  .carousel {
  width:640px;
  height:360px;
  max-height: 360px;
}
  .imail{
     padding-top: 30px;
      height: 60%;
      
  }
  .body{
      color: blue;
      text-align: center;
  }
  </style>
    </head>
    <body background="bak.JPG">
        <p><font text-align="center">Welcome to the Intranet Mailing System(i-Mail)</font></p>
        
     <div id="imail" class="carousel slide imail col-sm-9" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#imail" data-slide-to="0" class="active"></li>
    <li data-target="#imail" data-slide-to="1"></li>
    <li data-target="#imail" data-slide-to="2"></li>
    <li data-target="#imail" data-slide-to="3"></li>
  </ul>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="send.png" alt="Send" width="200px" height="150px">
      <div class="carousel-caption">
        <h3>Send</h3>
        <p>Mails</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="receive.jpg" alt="Receive" width="200px" height="50%">
      <div class="carousel-caption">
        <h3>Receive</h3>
        <p>Mails</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="intanet.jpg" alt="Intranet" width="200px" height="50%">
      <div class="carousel-caption">
        <h3>Over</h3>
        <p>The Intranet</p>
      </div>   
    </div>
      <div class="carousel-item">
      <img src="intranet.jpg" alt="Intranet width="200px" height="50%">
      <div class="carousel-caption">
        <h3>i-Mail</h3>
        <p><i>intranetmailingsystem</i></p>
      </div>   
    </div>
  </div>
  <a class="carousel-control-prev" href="#imail" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#imail" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
    </body>
</html>
