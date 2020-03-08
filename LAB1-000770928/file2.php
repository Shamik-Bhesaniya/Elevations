        <html><head>
    <!-- Shamik Bhesaniya - 000770928-->
    </head><body>
        <style>
            table, button{
                text-align: center;
                margin-left: 45%;
            }
            button{
                margin-top: 1%;
                margin-left: 45.3%;
            }
            p{
                text-align: center;
                font-size: 25pt;
                font-weight: bold;
            }
           
        </style><form action="index.php" method="POST">
<?php
         $minimum = $_POST["min"];///variable minimum for  minimum number output 
         $maximum = $_POST["max"];///variable maximum for  maximum number output 
         $step = $_POST["step"];///variable for step how much number of steps user required output
         $menu_1 = $_POST["menu_1"];///variable menu_1 for storing the choice of user selection from menu-1
         $menu_2 = $_POST["menu_2"];///variable menu_2 for storing the choice of user selection from menu-2
         $final_entry = '';///variable for storing the user output
         
         if($minimum<$maximum && $step<$maximum && $step>0 && $minimum>=0 && $maximum>0){
             ///creating the table for output
         echo"<table border=1><tr><th>$menu_1</th><th>$menu_2</th></tr>";
         ///for loop for minimum and maximum and adding the step so that it will deliver the diffrence 
         for($i=$minimum; $i<=$maximum; $i=$i+$step){
             ///if condition for user choice from menu_1 and menu_2 and calculating the output and storing the value in final_entry variable
         if ($menu_1 == "°C" AND $menu_2 == "°F"){
             $final_entry = $i * 1.8 + 32;
           
         }
         /// else-if condition for user choice from menu_1 and menu_2 and calculating the output and storing the value in final_entry variable
         elseif ($menu_1 == "°F" AND $menu_2 == "°C"){
             $final_entry = ($i - 32) / 1.8;
         }
         ///if condition for user having same choice from menu_1 and menu_2 and calculating the output and storing the value in final_entry variable
         elseif ($menu_1 == "°F" AND $menu_2 == "°F"){
             $final_entry = $i * 1;
         }
         ///if condition for user having same  choice from menu_1 and menu_2 and calculating the output and storing the value in final_entry variable
         elseif ($menu_1 == "°C" AND $menu_2 == "°C"){
             $final_entry = $i * 1;
         }
         ///else condition for having wrong input or blank input
         else{}
         echo "<tr><td>$i</td><td>$final_entry</td></tr>";
         }
         ///creating table
         echo "</table>";}
         else{
             echo "<p>Invalid Input</p>";
         }
?>
            <button type="submit" value="submit" id="forms" >Back</button>
        </form>
</body></html>