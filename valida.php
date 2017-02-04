<?php

$usu = $_REQUEST['usu'];
$pas = $_REQUEST['pas'];
       
echo $_REQUEST['usu'];
echo $_REQUEST['pas'];
        
$cnx = new PDO("mysql:host=localhost;dbname=serviciosandroidphp","root","");
$res = $cnx->query("select * from alumnos where codAlu='$usu'  and pasUsu='$pas' ");

$datos = array();

foreach ($res as $row)  {
    $datos[] = $row;
}

echo json_encode($datos);

?>