
<?php
     $x=$_POST['x'];
     $y=$_POST['y'];
     function mod(int $x,int $y)
     {
       $op = $x % $y;
      echo "x % y = $op";
     }
     mod($x,$y);
?>

