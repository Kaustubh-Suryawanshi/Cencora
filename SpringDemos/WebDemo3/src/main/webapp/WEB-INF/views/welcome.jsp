<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${obj.name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${obj.age}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${obj.id}</td>
         </tr>
      </table>
   </body>

</html>