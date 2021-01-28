

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        
        
         <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

      <script src="bootstrap/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account update</title>
        <style type="text/css">
            .algn{
                text-align: right;
            }
        </style>
        <script type="text/javascript">
            function compare()
            {
                if (document.getElementById("npd").value !== document.getElementById("cpd").value)
                {
                    document.getElementById("cof").innerHTML = "No Match!";
                    document.getElementById("cof").style.color = "red";
                    return false;
                }
                return true;
            }
            function checkpwd()
            {
                if (!document.getElementById("opd").value)
                {
                    document.getElementById("new").innerHTML = "You must enter your new Password";
                    document.getElementById("new").style.color = "red";
                    return false;
                }
                return true;
            }
            function check() {


                if (!document.getElementById("opd").value)
                {
                    //alert("You must enter your old Password");
                    document.getElementById("old").innerHTML = "You must enter your old Password";
                    document.getElementById("old").style.color = "red";
                }
                if (checkpwd() && compare()) {
                    document.frm.submit();
                }


            }
        </script>
        
    </head>
    <body background="bak.JPG">
         <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
 <a class="navbar-brand" href="admin">Administrator</a>
 <ul class="navbar-nav"> 
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Options
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="staffid.jsp">Update Staff ID</a>
        <a class="dropdown-item" href="#">Change Password</a>
        
      </div>
    </li>
   <li class="nav-item">
      <a class="nav-link" href="signin.jsp">Logout</a>
    </li>
  </ul>
</nav>
        
        <div class="container-fluid">
            <form class="form-horizontal" method="post" action="adminpwd" name="frm"> 
                <div class="col-sm-6">
                <table class="table table-hover "><tr class="table-info"><th>Change password</th></tr></table>
                </div>
               <div class="form-group row">
                   <label for="opd" class="control-label col-sm-3 algn">Old Password:</label>
                   <div class="col-sm-3">
               <input class="form-control" type="password" id="opd" name="opd" size="15"/>
               
                   </div>
                   <div class="col-sm-2">
                   <label id="old"></label>
                   </div>
               </div>
            <div class="form-group row">
                
                <label for="npd" class="control-label col-sm-3 algn">New Password:</label>
                <div class="col-sm-3">
                <input class="form-control" type="password" id="npd" name="npd" size="15"/>
                </div>
                <div class="col-sm-3">
                <label id="new"></label>
                </div>
            </div>
            <div class="form-group row">
                
                <label for="cpd" class="control-label col-sm-3 algn">Confirm New Password:</label>
                <div class="col-sm-3">
                <input class="form-control" type="password" id="cpd" name="cpd" size="15"/>
                </div>
                <div class="col-sm-3">
                <label id="cof"></label>
                </div>
                </div>
                 <div class="form-group row">
                    <label class="col-sm-3 control-label"></label>
                     <div class="col-sm-3">
                <input class="  btn btn-outline-warning btn-block" type="button" name="subm" onclick=" return check();" value="Update password"/>
                     </div>
                    
                 </div>
            
            
            
        </form>
        </div>
    </body>
</html>
