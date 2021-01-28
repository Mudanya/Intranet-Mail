
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <div class="container-fluid">
            <form class="form-horizontal" method="post" action="resetpwd" name="frm"> 
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
        <form method="post" action="imageUpdate" name="image_form" enctype="multipart/form-data">
            <div class="form-group row">
            <div class="col-sm-6">
     <table class="table table-hover ">
     <tr class="table-info"><th><b>Upload a profile photo</b></th></tr>
     </table>
                
                </div>
            </div>
                <div class="form-group row">
                    
                    
                    <div class="custom-file col-sm-6">
                    <input class="custom-file-input " id="fle" type="file" name="file"/>
                    <label class=" custom-file-label " for="fle">Upload image</label>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-6">
     <input class="btn btn-outline-warning btn-block" type="submit" value="Update image"/>
                    </div>
                </div>
               
      </form>
        </div>
    </body>
</html>
