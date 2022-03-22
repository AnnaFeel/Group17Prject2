package Group17Project2;

public class Task4 {
    public static void main(String[] args) {
        Registration obj = new Registration();
        obj.setEmail("hello@yahoo.com");
        obj.setUserName("fahitas");
        obj.setPassword("fahitas123");
        System.out.println(obj.getEmail() + " " + obj.getUserName() + " " + obj.getPassword());
    }
}

class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if (email.contains("@yahoo")) {
            this.email = email;
        } else {
            System.out.println("Email is invalid");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Username has to be more than 6 characters");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Password has to be more than 6 characters and cannot contain the User Name");
        }
    }
}
