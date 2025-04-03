<?php
$name = $_POST['name'];
$email = $_POST['email'];
$phone = $_POST['phone'];

$errors = [];

// Name validation (Only letters and spaces)
if (!preg_match("/^[a-zA-Z ]+$/", $name)) {
    $errors[] = "Invalid Name";
}

// Email validation
if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
    $errors[] = "Invalid Email";
}

// Phone validation (Exactly 10 digits)
if (!preg_match("/^[0-9]{10}$/", $phone)) {
    $errors[] = "Invalid Phone Number";
}

// Show validation result
if (empty($errors)) {
    echo "Registration Successful!";
} else {
    foreach ($errors as $error) {
        echo "$error<br>";
    }
}
?>
