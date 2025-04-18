
// Example 1
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log1.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 2
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log2.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 3
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log3.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 4
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log4.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 5
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet5 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log5.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 6
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet6 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log6.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 7
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet7 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log7.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 8
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet8 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log8.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 9
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet9 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log9.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 10
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet10 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log10.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 11
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet11 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log11.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 12
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet12 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log12.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 13
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet13 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log13.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 14
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet14 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log14.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 15
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet15 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log15.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 16
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet16 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log16.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 17
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet17 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log17.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 18
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet18 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log18.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 19
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet19 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log19.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 20
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet20 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log20.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 21
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet21 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log21.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 22
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet22 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log22.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 23
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet23 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log23.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 24
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet24 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log24.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 25
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet25 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log25.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 26
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet26 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log26.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 27
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet27 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log27.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 28
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet28 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log28.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 29
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet29 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log29.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 30
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet30 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log30.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 31
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet31 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log31.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 32
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet32 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log32.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 33
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet33 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log33.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 34
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet34 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log34.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 35
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet35 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log35.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 36
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet36 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log36.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 37
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet37 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log37.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 38
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet38 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log38.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 39
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet39 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log39.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 40
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet40 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log40.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 41
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet41 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log41.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 42
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet42 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log42.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 43
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet43 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log43.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 44
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet44 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log44.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 45
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet45 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log45.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 46
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet46 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log46.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 47
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet47 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log47.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 48
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet48 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log48.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 49
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet49 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log49.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}


// Example 50
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableServlet50 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        // SQL Injection
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");

            PrintWriter out = response.getWriter();
            while(rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        // XSS Vulnerability
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>User input: " + user + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded credentials & Insecure file write
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            FileWriter fw = new FileWriter("log50.txt", true);
            fw.write("Login success for: " + username + "\n");
            fw.close();
            response.getWriter().println("Welcome, admin!");
        } else {
            response.getWriter().println("Invalid credentials.");
        }
    }
}
