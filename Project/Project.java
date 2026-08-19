import java.util.Scanner;

// console Based ERP Portal for managing student records 

public class Project{
    public static void main(String a[]){
        

        Scanner sc = new Scanner(System.in);
        //lets first make the landing page of the project where we will have to do signin signup and forget password functionality

        String username;
        String password;
        if (a.length >= 2) {
            username = a[0];
            password = a[1];
        } else {
            System.out.print("Username: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            password = sc.nextLine();
        }

        User user = new User(username, password);

        //i want to take the user input and check if the user is valid or not

        if(user.getUsername().equals("admin") && user.getPassword().equals("password")){

            System.out.println("Login Successful");

            System.out.println("Welcome to the Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Course");
            System.out.println("6. View Course");
            System.out.println("7. Update Course");
            System.out.println("8. Delete Course");
            System.out.println("9. Add Faculty");
            System.out.println("10. View Faculty");
            System.out.println("11. Update Faculty");
            System.out.println("12. Delete Faculty");
            System.out.println("13. View Student Details");
            System.out.println("14. View Faculty Details");
            System.out.println("15. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            if(choice>15 || choice<1){
                System.out.println("Please Select Again between 1 to 15 only");
            }
            else{

            switch(choice){

                case 1: 
                    System.out.println("Adding Student...");

                    System.out.println("Enter the name of the student");
                    String studentName = sc.nextLine(); // why it isnt reading it

                    System.err.println("Student name: " + studentName);
                    
                    System.out.println("Enter the course selected by student");

                    System.out.println("List of the courses: ");
                    System.out.println("1. B.Tech Computer Science & Engineering");
                    System.out.println("2. Bachelors of Science ");
                    System.out.println("3. LLB ");

                    int course = sc.nextInt();
                    switch(course){
                        
                        case 1: 
                            System.out.println("Assigned B.Tech Computer Science & Engineering");
                            break;

                        case 2: 
                            System.out.println("Assigned Bachelors of Science");
                            break;

                        case 3: 
                            System.out.println("Assigned LLB ");
                            break;

                        default: 
                            System.out.println("Please Select the correct course");
                    }

                    

                    break;
                    
            }

            }
        }

        



    }
}