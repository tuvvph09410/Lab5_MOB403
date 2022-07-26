<?php
$server='localhost';
$user='id16540630_tuvvph09410';
$password='TKLtJs2&fZ?lhRAW';
$database='id16540630_android_networking_mob403_vuvantu';
$connect=new mysqli($server,$user,$password,$database);
if($connect->connect_error)
{
    die("Connection Failed: " .$connect->connect_error);
}
if(isset($_POST['id']) && isset($_POST['name']) && isset($_POST['price']) && isset($_POST['description'])){
     $id= $_POST['id'];
    $name= $_POST['name'];
    $price= $_POST['price'];
    $description= $_POST['description'];
    $sql="UPDATE product SET name='$name', price='$price', description='$description' WHERE id='$id'";
    if($connect->query($sql) === TRUE){
        $response["success"]=1;
        $response["message"]="Product successfully update.";
        echo json_encode($response);
    }else{
        $response["success"]=0;
        $response["message"]= "Required field(s) is missing."; 
        echo json_encode($response);
        
    }
}
else{
    $response["success"]=0;
    $response["message"]="Required field(s) is missing."; 
    echo json_encode($response);
  
    
}
    $connect->close();
    ?>