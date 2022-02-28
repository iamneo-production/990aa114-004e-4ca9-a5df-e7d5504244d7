<!DOCTYPE html>
<html>
    <body>
        <head>
            <meta charset="ISO-8859-1">
            <title>Document</title>
        </head>
        <h2 align="center">Edit Cover</h2>
	    <form method="POST" enctype="multipart/form-data">
		    <table align="center" cellpadding="10">
                <tr><input type="text" name="coverName" id="coverName" placeholder="enter the cover name"></tr>
                <tr><input type="number" name="enterPrice" id="enterPrice" placeholder="enter the cover price"></tr>
                <tr><input type="url" name="enterImageUrl" id="enterImageUrl" placeholder="enter the image url"></tr>
                <tr><input type="number" name="enterQuantity" id="enterQuantity" placeholder="enter the cover details"></tr>
                <tr><input type="text" name="enterDetails" id="enterDetails" placeholder="enter the cover details"></tr>
            <tr><input type="button" name="updateButton" id="updateButton" value="Update"></tr>
            </table>
        </form>
    </body>
</html>