<?php
$servername = "localhost";
$username = "root";  // Change if needed
$password = "";      // Change if needed
$database = "formDB";

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Get form data
$name = $_POST['name'];
$email = $_POST['email'];
$contact = $_POST['contact'];
$address = $_POST['address'];

// Insert into database
$sql = "INSERT INTO users (name, email, contact, address) VALUES ('$name', '$email', '$contact', '$address')";

if ($conn->query($sql) === TRUE) {
    echo "Data stored successfully!";
} else {
    echo "Error: " . $conn->error;
}

$conn->close();
?>
