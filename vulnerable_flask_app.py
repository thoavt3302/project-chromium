
# Example 1
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search1')
def search1():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit1', methods=['POST'])
def submit1():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 2
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search2')
def search2():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit2', methods=['POST'])
def submit2():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 3
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search3')
def search3():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit3', methods=['POST'])
def submit3():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 4
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search4')
def search4():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit4', methods=['POST'])
def submit4():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 5
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search5')
def search5():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit5', methods=['POST'])
def submit5():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 6
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search6')
def search6():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit6', methods=['POST'])
def submit6():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 7
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search7')
def search7():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit7', methods=['POST'])
def submit7():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 8
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search8')
def search8():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit8', methods=['POST'])
def submit8():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 9
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search9')
def search9():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit9', methods=['POST'])
def submit9():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 10
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search10')
def search10():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit10', methods=['POST'])
def submit10():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 11
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search11')
def search11():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit11', methods=['POST'])
def submit11():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 12
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search12')
def search12():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit12', methods=['POST'])
def submit12():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 13
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search13')
def search13():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit13', methods=['POST'])
def submit13():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 14
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search14')
def search14():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit14', methods=['POST'])
def submit14():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 15
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search15')
def search15():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit15', methods=['POST'])
def submit15():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 16
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search16')
def search16():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit16', methods=['POST'])
def submit16():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 17
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search17')
def search17():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit17', methods=['POST'])
def submit17():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 18
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search18')
def search18():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit18', methods=['POST'])
def submit18():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 19
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search19')
def search19():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit19', methods=['POST'])
def submit19():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 20
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search20')
def search20():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit20', methods=['POST'])
def submit20():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 21
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search21')
def search21():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit21', methods=['POST'])
def submit21():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 22
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search22')
def search22():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit22', methods=['POST'])
def submit22():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 23
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search23')
def search23():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit23', methods=['POST'])
def submit23():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 24
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search24')
def search24():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit24', methods=['POST'])
def submit24():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 25
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search25')
def search25():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit25', methods=['POST'])
def submit25():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 26
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search26')
def search26():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit26', methods=['POST'])
def submit26():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 27
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search27')
def search27():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit27', methods=['POST'])
def submit27():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 28
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search28')
def search28():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit28', methods=['POST'])
def submit28():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 29
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search29')
def search29():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit29', methods=['POST'])
def submit29():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 30
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search30')
def search30():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit30', methods=['POST'])
def submit30():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 31
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search31')
def search31():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit31', methods=['POST'])
def submit31():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 32
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search32')
def search32():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit32', methods=['POST'])
def submit32():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 33
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search33')
def search33():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit33', methods=['POST'])
def submit33():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 34
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search34')
def search34():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit34', methods=['POST'])
def submit34():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 35
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search35')
def search35():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit35', methods=['POST'])
def submit35():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 36
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search36')
def search36():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit36', methods=['POST'])
def submit36():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 37
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search37')
def search37():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit37', methods=['POST'])
def submit37():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 38
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search38')
def search38():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit38', methods=['POST'])
def submit38():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 39
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search39')
def search39():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit39', methods=['POST'])
def submit39():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 40
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search40')
def search40():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit40', methods=['POST'])
def submit40():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 41
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search41')
def search41():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit41', methods=['POST'])
def submit41():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 42
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search42')
def search42():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit42', methods=['POST'])
def submit42():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 43
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search43')
def search43():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit43', methods=['POST'])
def submit43():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 44
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search44')
def search44():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit44', methods=['POST'])
def submit44():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 45
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search45')
def search45():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit45', methods=['POST'])
def submit45():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 46
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search46')
def search46():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit46', methods=['POST'])
def submit46():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 47
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search47')
def search47():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit47', methods=['POST'])
def submit47():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 48
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search48')
def search48():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit48', methods=['POST'])
def submit48():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 49
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search49')
def search49():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit49', methods=['POST'])
def submit49():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 50
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search50')
def search50():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit50', methods=['POST'])
def submit50():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 51
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search51')
def search51():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit51', methods=['POST'])
def submit51():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 52
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search52')
def search52():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit52', methods=['POST'])
def submit52():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 53
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search53')
def search53():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit53', methods=['POST'])
def submit53():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 54
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search54')
def search54():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit54', methods=['POST'])
def submit54():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 55
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search55')
def search55():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit55', methods=['POST'])
def submit55():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 56
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search56')
def search56():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit56', methods=['POST'])
def submit56():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 57
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search57')
def search57():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit57', methods=['POST'])
def submit57():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 58
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search58')
def search58():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit58', methods=['POST'])
def submit58():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 59
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search59')
def search59():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit59', methods=['POST'])
def submit59():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 60
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search60')
def search60():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit60', methods=['POST'])
def submit60():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 61
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search61')
def search61():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit61', methods=['POST'])
def submit61():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 62
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search62')
def search62():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit62', methods=['POST'])
def submit62():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 63
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search63')
def search63():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit63', methods=['POST'])
def submit63():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 64
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search64')
def search64():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit64', methods=['POST'])
def submit64():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 65
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search65')
def search65():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit65', methods=['POST'])
def submit65():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 66
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search66')
def search66():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit66', methods=['POST'])
def submit66():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 67
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search67')
def search67():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit67', methods=['POST'])
def submit67():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 68
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search68')
def search68():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit68', methods=['POST'])
def submit68():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 69
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search69')
def search69():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit69', methods=['POST'])
def submit69():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 70
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search70')
def search70():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit70', methods=['POST'])
def submit70():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 71
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search71')
def search71():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit71', methods=['POST'])
def submit71():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 72
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search72')
def search72():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit72', methods=['POST'])
def submit72():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 73
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search73')
def search73():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit73', methods=['POST'])
def submit73():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 74
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search74')
def search74():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit74', methods=['POST'])
def submit74():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 75
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search75')
def search75():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit75', methods=['POST'])
def submit75():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 76
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search76')
def search76():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit76', methods=['POST'])
def submit76():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 77
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search77')
def search77():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit77', methods=['POST'])
def submit77():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 78
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search78')
def search78():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit78', methods=['POST'])
def submit78():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 79
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search79')
def search79():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit79', methods=['POST'])
def submit79():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 80
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search80')
def search80():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit80', methods=['POST'])
def submit80():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 81
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search81')
def search81():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit81', methods=['POST'])
def submit81():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 82
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search82')
def search82():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit82', methods=['POST'])
def submit82():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 83
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search83')
def search83():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit83', methods=['POST'])
def submit83():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 84
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search84')
def search84():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit84', methods=['POST'])
def submit84():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 85
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search85')
def search85():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit85', methods=['POST'])
def submit85():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 86
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search86')
def search86():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit86', methods=['POST'])
def submit86():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 87
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search87')
def search87():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit87', methods=['POST'])
def submit87():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 88
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search88')
def search88():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit88', methods=['POST'])
def submit88():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 89
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search89')
def search89():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit89', methods=['POST'])
def submit89():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 90
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search90')
def search90():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit90', methods=['POST'])
def submit90():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 91
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search91')
def search91():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit91', methods=['POST'])
def submit91():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 92
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search92')
def search92():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit92', methods=['POST'])
def submit92():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 93
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search93')
def search93():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit93', methods=['POST'])
def submit93():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 94
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search94')
def search94():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit94', methods=['POST'])
def submit94():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 95
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search95')
def search95():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit95', methods=['POST'])
def submit95():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 96
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search96')
def search96():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit96', methods=['POST'])
def submit96():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 97
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search97')
def search97():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit97', methods=['POST'])
def submit97():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 98
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search98')
def search98():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit98', methods=['POST'])
def submit98():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 99
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search99')
def search99():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit99', methods=['POST'])
def submit99():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"


# Example 100
from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route('/search100')
def search100():
    query = request.args.get('q')
    # SQL Injection Vulnerability
    conn = sqlite3.connect('example.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE name = '%s'" % query)
    results = cursor.fetchall()

    # XSS Vulnerability
    return "<html><body>User query: %s</body></html>" % query

@app.route('/submit100', methods=['POST'])
def submit100():
    # CSRF Vulnerability: No CSRF protection
    username = request.form['username']
    comment = request.form['comment']
    with open('comments.txt', 'a') as f:
        f.write(f"{username}: {comment}\n")
    return "Comment submitted"
