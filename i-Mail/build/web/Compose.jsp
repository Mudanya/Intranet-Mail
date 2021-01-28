
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        
          <script src="bootstrap/jquery.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
        <title>i-Mail</title>
   <script language=javascript>
	function checkfornull()
	{
		if(document.f1.to.value=="")
		{
			alert("You must enter Recipient's address");
			document.f1.to.focus();
		}
		else
			document.f1.submit();
	}
</script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
          <script src="bootstrap/jquery.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
          <style>
              .bg-1{
                  padding-top:20px;
                  padding-bottom:10px;
                 
              }
              .alen{text-align: right;
                 color:purple;
              }
              .msgPad{padding-top: 10px;}
              body{
                
              }
          </style>
    </head>
<body background="bak.JPG">
<!--<h2 align=center><font face="times new roman" color=blue>Compose your message</font></h2>-->
<div class="container-fluid msgPad">
<form class="form-horizontal" action="composeMsg" method=post name=f1 enctype="multipart/form-data">

<div class="form-group row"> 
    <label for="rec" class="control-label col-sm-1 alen">To:</label>
    <div class="col-sm-6">
<input class="form-control" type=text id="rec" name=to size=50 placeholder="Recipient">
    </div>
</div>
    
    <div class="form-group row"> 
        <label for="sub" class="control-label col-sm-1 alen">Subject:</label>
        <div class="col-sm-6">
<input class="form-control" type=text name=sub id="sub" size=50 placeholder="Subject" >
        </div>
    </div>
    
   
    
    <div class="form-group row"> 
        <label for="msg" class="control-label col-sm-1 alen" >Message:</label>
        <div class="col-sm-6 ">
    <textarea  class="form-control" rows=5 id="msg" name=msg placeholder="Enter your message here"></textarea>
        </div>
    </div>
    
    <div class="form-group row"> 
        <label  class="col-sm-1"></label>
       <div class="custom-file col-sm-6"> 
    <input class="custom-file-input" id="fle" type="file" name="file">
    <label for="fle" class="custom-file-label">Attachments</label>
       </div>
    </div>
    
<div class="form-group row"> 
    <label  class="col-sm-1"></label>
    <div class="col-sm-3">
	<input class="btn btn-block btn-outline-primary" id="snd" type=button name=sendmail value=Send onclick="checkfornull();">
    </div>
</div>
    
</form>
</div>
    </body>
</html>
