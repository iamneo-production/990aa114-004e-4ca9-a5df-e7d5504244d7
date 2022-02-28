<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    %>

    

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Document</title>
        <style>
                input[type=button]{
                    background-color:#cd84f1;
                    color:black;
                    margin:4px*2px;
                    text-align:center;
                }
                input[type=submit]{
                    background-color:#cd84f1;
                    color:black;
                    text-align:center;
    
                }
                div.content{
                    background-color:#cd84f1;
                    height:20px;
                    width:1500px;
                    margin:10px;
                    text-align:left;
                }
                div.content1{
                    background-color:aqua;
                    height: 585px;
                    float:left;
                    margin:20px;
                }
                div#tbl{
                    width:900px;
                }
                div#right{
                    width:500px;
                    background-color: aqua;
                }
                
                div.add{
                    width:500%;
                }
                form#add{
                    margin:40px;
                }
        </style>
	</head>
	<body>
    <body bgcolor="#d1ccc0">
        
    <table>
        <tr>
            <table cellpadding="27" width="1500px" bgcolor="#cd84f1" height="30px" id="tbl2">
            <tr><td><h3>MOBILE GADGETS</h3></td>
            <td><table cellpadding="5" bgcolor="#cd84f1">
            <td><form><input type="search" id="searchId" name="searchId" placeholder="enter gadget id"></form></td>
            <td><form action="<%= request.getContextPath()%>"/search method="POST" id="search"><input type="button" id="s_buttton" value="Search">
            </form></td>
            <td><form action="<%= request.getContextPath()%>"/edit method="POST" id="edit">
                <input type="button" id="e_buttton" value="Edit"></form></td>
            <td><form action="<%= request.getContextPath()%>"/delete method="POST" id="edit">
                <input type="button" id="d_buttton" value="Delete"></form></td>
            </tr></table></table>
        </tr>
        <tr>
        <td><div class="content1" id="left">
            <table cellpadding="22" width="900px" id="tbl">
            <thead bgcolor="#cd84f1">
                <tr>
                    <th>IMAGE</th>
                    <th>CoverName</th>
                    <th>Price</th>
                    <th>Quantity</th>
                <tr>
            </thead>
            <tbody>
                <c:forEach items="${theList}" var="gadget">
                    <tr>
                        <td>
                            <c:out value="${gadget.imageUrl}"/>
                        </td>
                        <td>
                            <c:out value="${gadget.gadgetName}"/> 
                        </td>
                        <td>
                            <c:out value="${gadget.gadgetPrice}"/> 
                        </td>
                        <td>
                           <c:out value="${gadget.quantity}"/>
                        </td>
                    </tr>


                </c:forEach>
            </tbody>
            </table>
            </form>
        </div>
        </td>
        <td>
        <div class="content1" id="right">
        <h2 align="center">Add Cover</h2>
	    <form action="<%= request.getContextPath()%>/add" method="POST" id="add">
		    <table align="center" cellpadding="10">
			<td><input type="text" name="coverName" id="coverName" placeholder="enter the cover name"></tr>
            <td><input type="number" name="enterPrice" id="enterPrice" placeholder="enter the cover price"></tr>
            <td><input type="url" name="enterImageUrl" id="enterImageUrl" placeholder="enter the image url"></tr>
            <td><input type="number" name="enterQuantity" id="enterQuantity" placeholder="enter the no.of pieces"></tr>
            <td><input type="text" name="enterDetails" id="enterDetails" placeholder="enter the cover details"></tr>
            <td><input type="submit" name="add_button" id="addButton" id="addButton" value="ADD"></tr>
            </table>
        </form>
        </div>
        </td></tr> 
    </table>
    </body>
</html>

