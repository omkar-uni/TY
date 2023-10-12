<?php
$ch=$_POST["op"];
$a=array("sophia"=>31,"jacob"=>41,"william"=>39,"ramesh"=>40);
print_r($a);
switch($ch)
{
      case 1:asort($a);
             echo"<br>Ascending Order Sort by <b>value</b>:";
             print_r($a);
             break;
       
       case 2:ksort($a);
             echo"<br>Ascending Order Sort by <b>key</b>:";
             print_r($a);
             break;
       
       case 3:arsort($a);
             echo"<br>descending Order Sort by <b>value</b>:";
             print_r($a);
             break;
         
       case 4:krsort($a);
             echo"<br>descending Order Sort by <b>key</b>:";
             print_r($a);
             break;                 
             
}
?>
