
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Person Information</h2>
      <form method = "POST" action = "/WebDemo3/addPerson">
         <table>
            <tr>
               <td><label name = "name">Name</label></td>
               <td><input name = "name" /></td>
            </tr>
            <tr>
               <td><label name = "age">Age</label></td>
               <td><input name = "age" /></td>
            </tr>
            <tr>
               <td><label name = "id">id</label></td>
               <td><input name = "id" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>
      </form>
   </body>

</html>