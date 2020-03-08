<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <!-- Shamik Bhesaniya - 000770928-->
        <meta charset="UTF-8">
        <title>Temperature Conversion Calculator</title>
  
    </head>
    
    <body>
        <style>
            h1{
                text-align: center;
                text-decoration: underline;
            }
            
            #forms{
                text-align: center;    
            }
            
            .buttons{
                background-color: lightblue;
                
            }
            
            #menu{
                background-color: lightyellow;
            } 
            
           
            
        </style>
        <h1>Temperature Converter</h1>
        <!--form created for choice of user for conversion which gets action from the file2.php which has a calculation of conversion.-->
        <form action="file2.php" method="POST" id="forms">
            <!-- menu1 for selection -->
            <select name="menu_1" id="menu">
                <option value="°C">Celsius</option>
                <option value="°F">Fahrenheit</option>
            </select>
            <!--menu2 for selection's-->
            <h2>TO</h2>
            <select name="menu_2" id="menu">
                
                <option value="°C">Celsius</option>
                <option value="°F">Fahrenheit</option>
            </select>
            <br><br>
            <!--user input textbox-->
           &nbsp;Minimum Value-<input type="number" name="min" id="menu"><br>
            Maximum Value-<input type="number" name="max" id="menu"><br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Difference-<input type="number" name="step" id="menu"><br><br><br>
            <!--submit button-->
            <button type="submit" value="submit" name="submit" class="buttons">Convert</button>
            &nbsp;&nbsp;
            <!--reset button for reseting the page--> 
            <button type="reset" value="reset" name="reset" class="buttons">Clear</button>
        </form> 
    </body>
</html>
