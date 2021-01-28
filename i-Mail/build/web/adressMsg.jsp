<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>i-Mail</title>
   <script language=javascript>
	function checkfornull()
	{
		if(document.f1.to.value=="")
		{
			alert("ToAddress could not be Empty");
			document.f1.to.focus();
		}
		else
			document.f1.submit();
	}
</script>
<body background="bak.JPG" bgcolor="cyan">
<!--<h2 align=center><font face="times new roman" color=blue>Compose your message</font></h2>-->
<form action="sendMsg" method=post name=f1>
<pre>
   

<table>
    <tr><td>To</td> <td><input type=text name=to value="" size=50></td></tr>
    <tr><td>Subject</td><td><input type=text name=sub size=50></td></tr>
    
    <tr><td>Message</td><td><textarea cols=50 rows=10 name=msg></textarea></td></tr>
    <tr><td></td><td><a href=''>Attachments</a></td></tr>
</table>
<p>
	<input type=button name=sendmail value=Send onclick="checkfornull();">
</form>
</pre>
    </body>
</html>
