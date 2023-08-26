<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
    <style>
        body {
            align-items: center;
  display: flex;
  flex-direction: column;
  min-height: 100vh;
  background-color: aqua;
  margin-top: 50px;
}

  .form{
     display: block; */
     background-color: aquamarine; */
   
    text-decoration-color: blue;
    margin-left: 100px;
    margin-right: 100px;
  }
  .section1{
    border-color:black;
    display: flexbox;
    background-color: aliceblue;
    
  }

    </style>
</head>
<body style="">
    <section class="section1">
        <form action="<%request.getContextPath();%>/register" method="post" class="form">
            <h1><b>Register</b></h1>
            <a href="login.html">Already have account?</a>

            <br><div>
                <label for="name">Name:</label><br>
                <input type="text" name="name" id="name">

            </div><br><br>
            <div>
                <label for="email">Email:</label><br>
                <input type="email" name="email" id="email">
            </div><br><br>

            <div>
                <label for="age">Age:</label><br>
                <input type="number" name="age" id="age">
            </div><br><br>

        <div>
            <label for="phone">Phone NO:</label><br>
            <input type="number" name="phone" id="phone">
        </div><br><br>
        <div>
            <label for="password">Password</label><br>
            <input type="password" name="password" id="password">
        </div><br><br>
        <div>
            <label for="cpassword">Confirm password:</label><br>
            <input type="password" name="cpassword" id="cpassword">
        </div><br><br>

        <div>
            <input type="submit" value="Submit">
        </div><br><br>


        </form>
    </section>
    
</body>
</html>