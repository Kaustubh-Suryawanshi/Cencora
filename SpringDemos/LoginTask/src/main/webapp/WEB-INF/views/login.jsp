<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px; /* Fixed width for better layout */
        }
        h2 {
            text-align: center;
        }
        fieldset {
            border: 1px solid #ddd;
            border-radius: 5px;
            padding: 10px;
        }
        legend {
            font-weight: bold;
            padding: 0 10px; /* Padding for better aesthetics */
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 3px;
        }
        .btn {
            background-color: #5cb85c;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            width: 100%;
        }
        .btn:hover {
            background-color: #4cae4c;
        }
        .options {
            text-align: center;
            margin-top: 15px;
        }
        .options a {
            text-decoration: none;
            color: #007bff;
        }
        .options a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form action="/LoginTask/dashboard/" method="post">
            <fieldset>
                <legend>Enter your credentials</legend>
                <div class="form-group">
                    <label for="uname">Username:</label>
                    <input type="text" id="uname" name="uname" required>
                </div>
                <div class="form-group">
                    <label for="pass">Password:</label>
                    <input type="password" id="password" name="pass" required>
                </div>
                <button type="submit" class="btn">Login</button>
            </fieldset>
        </form>
        <div class="options">
            <a href="forgotPassword.jsp">Forgot Password?</a> | 
            <a href="/LoginTask/signup">Sign Up</a>
        </div>
    </div>
</body>
</html>

