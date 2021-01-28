

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="fontawesome/css/all.css">
          <script src="bootstrap/jquery.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
        <title>Sign in</title>
        
        <!--Java script-->
        <script type="text/javascript" >
           function validUsr(){
               if(document.Login.usr.value==""){
                   document.getElementById("errorUsr").innerHTML="You must input your username";
                   document.getElementById("errorUsr").style.color="red";
               }
             else if(document.Login.pwd.value==""){
                   document.getElementById("errorPwd").innerHTML="Provide Password";
                   document.getElementById("errorPwd").style.color="red";
                   
               }
               else
               {
                document.Login.submit();
               }
           }
        </script>
             
  <style type="text/css">
    
           .bg-1{
                /* background-color: #1abc9c;  Green */
                 color: #545b62;
                 
                 padding-bottom: 50px;
                 top:55%;
                 left:75%;
                 position: absolute;
                 transform: translate(-50%,-50%);
                }
                
                .pr{
                    color:#1abc9c;
                }
                body{
                   
                }
                .alf{text-align: right;s}
  </style>
    </head>
<body background="bak.JPG"> 
        
      <!--Header container-->   
     <nav class="navbar navbar-expand-sm bg-primary navbar-dark justify-content-between">
 <a class="navbar-brand" href="#">
     Intranet Mail 
 </a>
 <span class="navbar-text">SignIn</span>
 <ul class="navbar-nav "> 
   
  
  </ul>
 
 
</nav>  
      
      <!--Body container-->   
    <div class="container-fluid bg-1 ">
            
     
        <form class="form-horizontal" name="Login" method="post" action="entry"> 
          <!-- Log in details--> 
          
  <!--username-->
    <div class="form-group row">
       <label for="usr" class="col-sm-2 control-label alf" >User Name:</label>
           <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-user-circle"></i></span>  </div>
              <input type="text" class="form-control" id="usr" name="usr" >
          </div>
            
    </div>
 
    <div class="form-group row has-error">
     <label class="col-sm-2 "></label><label class="col-sm-3 control-label" id="errorUsr"></label>  
    </div>
 
 <!--password--> 
       <div class="form-group row">
           <label for="pwd" class="col-sm-2 control-label alf" > Password: </label>
               <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-unlock-alt"></i></span>  </div>
                 <input type="password" class="form-control" id="pwd" name="pwd">
              </div>
       </div>
 
 <div class="form-group row">
     <label class="col-sm-2 "></label><label class="col-sm-3 control-label" id="errorPwd"></label> 
 </div>
 
 <!--signin-->
        <div class="form-group row">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-3">
             <input type="button" class="form-control btn-primary   " Value="Sign in" onclick="validUsr();">
            </div>
        </div>   
          
         <div class="form-group row">
    <label class="col-sm-4"></label> 
 </div>
 <!--signup-->
        <div class="form-group row pr">
          <label  class="col-sm-2 control-label ">Don't have an account?</label>
            <div class="col-sm-3" >  
             <a href="signup.jsp" class="form-control btn btn-secondary ">Sign up</a>
           </div>
        </div>
          
 
          
      </form>
      
    </div>
        
        
    </body>
</html>
