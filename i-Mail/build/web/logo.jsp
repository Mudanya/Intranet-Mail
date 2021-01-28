<%-- 
    Document   : logo
    Created on : Jun 18, 2018, 8:12:16 PM
    Author     : Nexo Bentola
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logo</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
          <script src="bootstrap/jquery.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>
          
          <style>
              .bg-1{
                 
              }
              body{
                 
              }
          </style>
    </head>
    <body class="bg-primary">
        
           <%
               PreparedStatement ps;
               
               Connection con;
               ResultSet res;
               try{
                   Class.forName("com.mysql.jdbc.Driver");
                   con =DriverManager.getConnection("jdbc:mysql://localhost/maildata","root","");
                   
                       String nem=null;
              Cookie c[]=request.getCookies();
             if(c!=null){
             for(int i=0;i<c.length;i++)
               {
               if(c[i].getName().equals("signin"))
               {
                   nem=c[i].getValue();
                   break;
               }
               }
             }
                   
                   String file="select filename,full_name from register where username='"+nem+"'";
                   ps=con.prepareStatement(file);
                   res=ps.executeQuery();
                   while(res.next()){
                       String filename=res.getString("filename");
                   String ful=res.getString("full_name");
           %>
           
           <nav class="navbar navbar-expand-sm bg-primary navbar-dark fixed-bottom justify-content-between">
 <a class="navbar-brand" href="#">
     <image src="images/<%=filename%>" width="50px" height="50px" class="rounded-circle"  /> <%=ful%>
 </a>
 <span class="navbar-text">i-Mail</span>
 <ul class="navbar-nav "> 
   
   <li class="nav-item">
      <a class="nav-link" href="#">Logout</a>
    </li>
  </ul>
 
 
</nav>
           
           <% }
                   
               }
               catch(Exception e)
               {
                   
               }%>
      <div class="container-fluid bg-1">
        </div>
    </body>
</html>
