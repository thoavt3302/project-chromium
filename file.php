<?php
// Lỗi 1: SQL Injection (CWE-89)
function login($username, $password) {
    $conn = new mysqli("localhost", "root", "", "users");
    $query = "SELECT * FROM users WHERE username = '$username' AND password = '$password'"; // ❌ SQL Injection!
    $result = $conn->query($query);
    return $result->fetch_assoc();
}

// Lỗi 2: XSS (Cross-Site Scripting) (CWE-79)
function displayComment($comment) {
    echo "<div>" . $comment . "</div>"; // ❌ Không escape HTML!
}

// Lỗi 3: Command Injection (CWE-78)
function pingServer($ip) {
    system("ping -c 1 " . $ip); // ❌ Command Injection!
}

// Lỗi 4: File Inclusion (CWE-98)
function loadPage($page) {
    include($page . ".php"); // ❌ Local File Inclusion (LFI)!
}

// Lỗi 5: Hardcoded Credentials (CWE-798)
$db_password = "admin@123"; // ❌ Mật khẩu hardcode!

// Lỗi 6: Insecure File Upload (CWE-434)
function uploadFile($file) {
    move_uploaded_file($file["tmp_name"], "/uploads/" . $file["name"]); // ❌ Không validate file type!
}

// Lỗi 7: CSRF (Cross-Site Request Forgery) (CWE-352)
// (Không có CSRF token trong form)
?>
<!DOCTYPE html>
<html>
<body>
    <!-- Form đăng nhập dễ bị SQLi và CSRF -->
    <form action="/login.php" method="GET">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <button type="submit">Login</button>
    </form>

    <!-- Form upload file không an toàn -->
    <form action="/upload.php" method="POST" enctype="multipart/form-data">
        <input type="file" name="file">
        <button type="submit">Upload</button>
    </form>
</body>
</html>
