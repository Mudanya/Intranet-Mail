
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="font_awesome/css/font-awesome.min.css">
          <script src="bootstrap/jquery.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
        <title>New Address</title>
        
        <style type="text/css">
            .bg_a{padding-top: 20px;}
            .lb-c{
            text-align: right;
            color: purple;
            }
        </style>
        
        <script type="text/javascript">
            function checknull(){
                if(document.frm.nem.value==""){
                    alert("You must enter the name");
                }
                else if(document.frm.adr.value=="")
                {
                 alert("You must enter the the address for your contact");   
                }
                else 
                {
                    document.frm.submit();
                }
                
            }
            </script>
    </head>
    <body background="bak.JPG"> 
        <div class="container-fluid bg_a">
        <form class="form-horizontal" action="newAdress" method="post" name="frm">
           <div class="form-group row">
               <label for="nem" class="control-label col-sm-1 lb-c">Name:</label>
               <div class="col-sm-4">
                   <input class="form-control" type="text" id="nem" name="nem" />
               </div>
           </div>
            
            <div class="form-group row">
                <label for="addr" class="control-label col-sm-1 lb-c">Address:</label>
               <div class="col-sm-4">
                   <input class="form-control" type="text" id="addr" name="adr" />
               </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-1"></label>
                <div class="col-sm-4">
               <input class="btn btn-outline-primary btn-block" type="button" name="send" value="Add Address" onclick="checknull();"/>
                </div>
            </div>
        </form>
        </div>
    </body>
</html>
