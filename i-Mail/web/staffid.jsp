


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
        <title>Staff ID</title>
        
         <script language=javascript>
	function check()
	{
		if(document.fmr.upd.value=="")
		{
			alert("You must enter a value");
			document.fmr.upd.focus();
		}
               else if(document.fmr.fpd.value=="")
		{
			alert("You must enter a value");
			document.fmr.fpd.focus();
		}
		else
			document.fmr.submit();
	}
        
</script>

<style type="text/css">
  .bgy{padding-top: 20px;
                 top:50%;
                 left:50%;
                 position: absolute;
                 transform: translate(-50%,-50%);
                 background-color: paleturquoise;
  } 
  .aln1{text-align: right;
  color: #10707f}
</style>
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
        <a class="dropdown-item" href="viewIDs">View Staff IDs</a>
        <a class="dropdown-item" href="adminpwd.jsp">Change Password</a>
        
      </div>
    </li>
   <li class="nav-item">
      <a class="nav-link" href="signin.jsp">Logout</a>
    </li>
  </ul>
</nav>
        
        <div class="container-fluid bgy col-sm-6">
      
            <form method="post" action="staffUpdate" name="fmr">
                 <div class="form-group row">
                     <label for="updet" class="control-label col-sm-3 aln1"><i>(Staff)</i> Full name:</label>  
                    <div class="col-sm-9">
                        <input class="form-control" type="text" id="fupdet" name="fpd"/>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="updet" class="control-label col-sm-3 aln1">Update Staff ID:</label>  
                    <div class="col-sm-9">
                        <input class="form-control" type="text" id="updet" name="upd"/>
                    </div>
                </div>
                 <div class="form-group row">
                     <label class="col-sm-3"></label> 
                     <div class="col-sm-9">
                         <input class="btn btn-block btn-outline-info" type="button" value="Update ID" onclick="check();"/>  
                    </div> 
                
                </div>
            </form>
            
                
          
        </div> 
       
    </body>
</html>
