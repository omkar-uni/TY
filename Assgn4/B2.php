<?php
          $a=$_GET["t"];
          $num=$_GET["t1"];
          $b=explode(" ",$a);
          
          echo " Array Elements Are : ";
          foreach($b as $c)
                       echo "$c\t";
          echo "<br>";
        
          if (array_search($num,$b))
          {
             echo "The Number $num is present"; 
             return;
             }
          else   
             echo "The Number $num is Not present";   
         /* $cn=count($b);
          
          for($i=0;$i<$cn;$i++)
          { 
             if($b[$i]==$num)
             {
                echo "The Number $num is present";
                return;
             }
          }
          echo "The Number $num is Not present";*/
?>                                                                                                                                                 
