
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="fontawesome/css/all.css">
          <script src="bootstrap/jquery.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
        <title>Signup</title>
        <link rel="stylesheet" href="jquery-ui-1.12.1/jquery-ui.css">
  
  
  <script src="jquery-ui-1.12.1/jquery-ui.js"></script>
        
        <script type="text/javascript" language="javascript">
            function checkpwd(){
           if (document.getElementById("v3").value !== document.getElementById("v4").value)
                {
                    alert("Password Mismatch!");
                }
            }
        </script>
        
        <style type="text/css">
            .aln{text-align: right;}
            .bg_valuz{
                padding-top: 20px;
                margin-left: 20%;
                 
                }
              
                
            
        </style>
        
    </head>
    <body background="bak.JPG" onload=document.fm.v1.focus();>
        
        
            
            
        <nav class="navbar navbar-expand-sm bg-primary navbar-dark justify-content-between">
 <a class="navbar-brand" href="#">
     Intranet Mail 
 </a>
 <span class="navbar-text">SignUp</span>
 <ul class="navbar-nav "> 
   
  
  </ul>
 
 
</nav>  
         <div class="container-fluid bg_valuz">  
             
       <form class="form-horizontal" action="signup" method="post" name="fm">
           
           
          <div class="form-group row ">
              
               <label for="fnm" class="col-sm-2 control-label aln" >Full Name:
              </label> 
             
              <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-user"></i></span>  </div>
           <input pattern=".{5,}" required title="name too short" class="form-control" name="v1" id="fnm" />
                 
              </div>
          </div>
           
           <div class="form-group row">
               <label for="unm" class="col-sm-2 control-label aln" placeholder="username@imail.org">Username:</label> 
             
                    <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-user-circle"></i></span>  </div>
                      
               <input class="form-control"  name="v2"  id="unm" pattern=".{3,}" required title="name too short" />
               <div class="input-group-append">
                      <span class="input-group-text">@imail.org</span>  </div>
                    </div>  
              
           </div> 
           
           <div class="form-group row">
              <label for="pwdi" class="col-sm-2 control-label aln">Password:</label> 
                <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-lock"></i></span>  </div>
               <input class="form-control" type="password" name="v3" id="v3" pattern=".{6,}" required title="Password should be atleast 6 in length"  />
               </div>
           </div>
           
           <div class="form-group row">
               <label for="pwdc" class="col-sm-2 control-label aln">Confirm Password:</label> 
               <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-key"></i></span>  </div>
               <input class="form-control "  type="password" name="v4" id="v4" required/>
               </div>
           </div>
           
           <div class="form-group row ">
               <label  class="col-sm-2 control-label aln">Gender:</label> 
               <div class="col-sm-3">
                   <div class="custom-control custom-radio custom-control-inline col-sm-1">
                   <input class="custom-control-input" type="radio"  name="v5" id="gen1" value="Male" required/>
                   <label class="custom-control-label" for="gen1">Male:</label>
                   </div>
                   <label class="control-label col-sm-1"></label>
                   <div class="custom-control custom-radio custom-control-inline col-sm-1">
                   <input class="custom-control-input" type="radio" name="v5" id="gen" value="Female" required/>
                   <label class="custom-control-label" for="gen">Female:</label>
                   </div>
               </div>
               </div>
           
           <div class="form-group row ">
               <label for="dob" class="col-sm-2 control-label aln">Date of Birth:</label> 
                <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-calendar-check"></i></span>  </div>
               <input class="form-control" type="date" name="v6" id="dob" required/>
               </div>
           </div>
           
           <div class="form-group row">
               <label for="eml" class="col-sm-2 control-label aln">Email address:</label> 
                <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-envelope-open"></i></span>  </div>
               <input type="email" class="form-control"  name="v7" id="email" required/>
               </div>
           </div>
           
           <div class="form-group row ">
              <label for="phn" class="col-sm-2 control-label aln">Phone Number:</label> 
                <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-phone"></i></span>  </div>
              <input class="form-control" type="number" name="v8" id="phn" pattern=".{8,20}" required title="name too short or too long(8-20)" />
               </div>
           </div>
           
           <div class="form-group row">
               <label for="stf" class="col-sm-2 control-label aln">Staff Id:</label> 
                <div class="input-group col-sm-3">
                  <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fa fa-id-card"></i></span>  </div>
               <input class="form-control" name="v9" id="stf" />
               </div>
           </div>
           
           <div class="form-group row ">
               <label class="control-label col-sm-2"></label>
                <div class="col-sm-1">
               <input class="form-control btn-warning" type=reset value="Reset"/><br/>
               </div>
               
                <div class="col-sm-2">
               <input class="form-control btn-primary" type=submit value="Register"  onClick="checkpwd();"/>
               </div>
           </div>
           </form>
           </div>
           
       
        <script src="validate.js" type="text/css"></script>
    </body>
</html>
