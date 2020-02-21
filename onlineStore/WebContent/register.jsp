<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <link rel="stylesheet" type="text/css" href="css/register.css">
</head>
<body>
    <table>
        <tr>
            <th>Register</th>
        </tr>
        <tr>
            <td>username </td>
            <td>
                <input type="text" name="username" id="username">
            </td>
        </tr>
        <tr>
            <td>password </td>
            <td>
                <input type="text" name="password" id="password">
            </td>
        </tr>
        <tr>
            <td>phone</td>
            <td>
                <input type="text" name="phone" id="phone">
            </td>
        </tr>
        <tr>
            <td>email</td>
            <td>
                <input type="text" name="email" id="email">
            </td>
        </tr>
    </table>
    <table>
        <tr>
            <td>
                <button><a href="${pageContext.request.contextPath}/UserServlet?method=regist">submit</a></button>
            </td>
        </tr>
    </table>
</body>
</html>