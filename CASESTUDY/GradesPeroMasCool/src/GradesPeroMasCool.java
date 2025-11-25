import java.util.Scanner;

public class GradesPeroMasCool {
    static Scanner sc = new Scanner(System.in);
    static int[][] grades = {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
    };
    static String[] names = {
            "____", "____", "____", "____", "____",
            "____", "____", "____", "____", "____"
    };

    public static void main(String[] args) {

        String choices;
        boolean mainRuntime = true;
        int x = 0;

        while (mainRuntime == true && x == 0) {
            welcomeMenu();

            choices = sc.nextLine();

            switch (choices) {
                case "1" -> {
                    students();
                }
                case "2" -> {
                    grades();
                }
                case "3" -> {
                    result();
                }
                case "x" -> {
                    System.out.println("Exiting...");
                    mainRuntime = false;
                }
                case "X" -> {
                    System.out.println("Exiting...");
                    mainRuntime = false;
                }

                default -> System.out.println("Invalid choice");
            }
        }

    }

    static void welcomeMenu() {
        System.out.println("Grade input for teachers \n");
        System.out.println("1. Students");
        System.out.println("2. Grades");
        System.out.println("3. Result");
        System.out.println("\nEnter X to exit");
    }

    static void students() {

        String studentChoice;
        String name;
        boolean studentsRuntime = true;

        while (studentsRuntime == true) {

            System.out.println("Record the names of your students: \n");
            System.out.println("1. " + names[0]);
            System.out.println("2. " + names[1]);
            System.out.println("3. " + names[2]);
            System.out.println("4. " + names[3]);
            System.out.println("5. " + names[4]);
            System.out.println("6. " + names[5]);
            System.out.println("7. " + names[6]);
            System.out.println("8. " + names[7]);
            System.out.println("9. " + names[8]);
            System.out.println("10. " + names[9]);

            System.out.println("\nEnter the number to modify that record space");
            System.out.println("\nEnter X to exit");

            studentChoice = sc.nextLine();
            switch (studentChoice) {
                case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> {
                    Names(studentChoice);
                }
                case "x" -> {
                    return;
                }
                case "X" -> {
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }

    }

    static public void Names(String a) {
        boolean namesRuntime = true;
        String container = "";
        int index = Integer.parseInt(a) - 1;
        int i;
        String navigation = "";

        while (namesRuntime == true) {
            for (i = 0; i <= 9; i++) {
                if (i == 0 && index == 0) {
                    while (i == index) {
                        System.out.println("\nCurrent name: " + names[i]);
                        System.out.println("\n1. Go to the next student");
                        System.out.println("Enter 0 to go to the grades menu");
                        System.out.println("\nPress X to exit");

                        System.out.println("Please enter a name for this record: ");
                        navigation = sc.nextLine();

                        switch (navigation) {
                            case "1" -> {
                                i++;
                                index++;
                            }
                            case "x" -> {
                                return;
                            }
                            case "X" -> {
                                return;
                            }
                            case "0" -> {
                                grades();
                            }
                            default -> {
                                names[i] = navigation;
                            }
                        }
                    }
                }
                if (i != 0 && index != 0) {
                    while (i == index) {
                        System.out.println("\nCurrent name: " + names[i]);
                        System.out.println("\n1. Go to the next student");
                        System.out.println("2. Go to the previous stundent");
                        System.out.println("\nPress X to exit");

                        System.out.println("Please enter a name for this record: ");
                        navigation = sc.nextLine();

                        switch (navigation) {
                            case "1" -> {
                                i++;
                                index++;
                            }
                            case "2" -> {
                                i--;
                                index--;
                            }
                            case "x" -> {
                                return;
                            }
                            case "X" -> {
                                return;
                            }
                            default -> {
                                names[i] = navigation;
                            }
                        }
                    }
                }

            }
        }
    }

    static void grades() {
        String gradesChoice;
        boolean gradesRuntime = true;

        while (gradesRuntime = true) {

            System.out.println("Record the Grades of your student: \n");
            System.out.println("1. " + names[0]);
            System.out.println("2. " + names[1]);
            System.out.println("3. " + names[2]);
            System.out.println("4. " + names[3]);
            System.out.println("5. " + names[4]);
            System.out.println("6. " + names[5]);
            System.out.println("7. " + names[6]);
            System.out.println("8. " + names[7]);
            System.out.println("9. " + names[8]);
            System.out.println("10. " + names[9]);

            System.out.println("\nEnter the number of the name to change the grade's of that name");
            System.out.println("\nEnter X to exit");

            gradesChoice = sc.nextLine();
            switch (gradesChoice) {
                case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> {
                    specificGrades(gradesChoice);
                }
                case "x" -> {
                    return;
                }
                case "X" -> {
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static public void specificGrades(String a) {
        int index = Integer.parseInt(a) - 1;
        String gradeChoice = "";
        String control = a;
        boolean gradesRuntime = true;

        while (gradesRuntime == true) {
            int i = 0;
            if (index <= 0) {
                System.out.println("Name of student: " + names[index]);

                System.out.println("\n1. Science Final Grade: " + grades[index][0]);
                System.out.println("2. Science Final Grade: " + grades[index][1]);
                System.out.println("3. Science Final Grade: " + grades[index][2]);
                System.out.println("4. Science Final Grade: " + grades[index][3]);
                System.out.println("5. Go to the next student");
                System.out.println("\nEnter the corresponding number to enter Final Grade");
                System.out.println("or press 0 to consecutively assign each Quarterly Grades from Science to Comprog");

                gradeChoice = sc.nextLine();

                switch (gradeChoice) {
                    case "1", "2", "3", "4" -> {
                        gradeInput(control, gradeChoice);
                    }
                    case "5" -> {
                        index++;
                    }
                    case "0" -> {
                        consecutiveGrades(index, i);
                    }
                    case "x", "X" -> {
                        return;
                    }
                }
            }
            if (index > 0) {
                System.out.println("Name of student: " + names[index]);

                System.out.println("\n1. Science Final Grade: " + grades[index][0]);
                System.out.println("2. Math Final Grade: " + grades[index][1]);
                System.out.println("3. English Final Grade: " + grades[index][2]);
                System.out.println("4. Computer Programming Final Grade: " + grades[index][3]);
                System.out.println("5. Go to the next student");
                System.out.println("6. Go to the previous student");
                System.out.println("Press X to exit");
                System.out.println("\nEnter the corresponding number to enter Final Grade");
                System.out.println("or press 0 to consecutively assign each Quarterly Grades from Science to Comprog");

                gradeChoice = sc.nextLine();

                switch (gradeChoice) {
                    case "1", "2", "3", "4" -> {
                        gradeInput(control, gradeChoice);
                    }
                    case "5" -> {
                        index++;
                    }
                    case "0" -> {
                        consecutiveGrades(index, i);
                    }
                    case "6" -> {
                        index--;
                    }
                    case "x", "X" -> {
                        return;
                    }
                }
            }
        }
    }

    static public void gradeInput(String a, String b) {
        int row = Integer.parseInt(a);
        int col = Integer.parseInt(b);

        int grade;
        int rowindex = row - 1;
        int colindex = col - 1;

        System.out.println("Enter the grade: ");
        grade = sc.nextInt();
        grades[rowindex][colindex] = grade;
    }

    static public void consecutiveGrades(int a, int b) {
        int index = a;
        int grade = 0;

        for (b = 0; b < 4; b++){
        System.out.println("Enter the grade: ");
        grade = sc.nextInt();
        grades[index][b] = grade;
        }
    }

    static void result(){

        boolean resultRuntime = true;
        String resultNameChoice = "";

        while (resultRuntime = true) {

        System.out.println("Enter the number to see the result of that student\n");
        System.out.println("1. " + names[0]);
        System.out.println("2. " + names[1]);
        System.out.println("3. " + names[2]);
        System.out.println("4. " + names[3]);
        System.out.println("5. " + names[4]);
        System.out.println("6. " + names[5]);
        System.out.println("7. " + names[6]);
        System.out.println("8. " + names[7]);
        System.out.println("9. " + names[8]);
        System.out.println("10. " + names[9]);

        resultNameChoice = sc.nextLine();

            switch (resultNameChoice){
                case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> {
                    nameResult(resultNameChoice);
                }
                case "x", "X" -> {
                    return;
                }
            }
        }
    } 

    static public void nameResult(String a){
        int name = Integer.parseInt(a) - 1;
        double average;
        int sum = 0;
        boolean nameResultRuntime = true;
        String nameResultChoice = "";
        int grade;

        while (nameResultRuntime == true){
        if (name == 0){
        System.out.println("NAME: " + names[name]);

        System.out.println("\nScience Grade: " + grades[name][0]);
        System.out.println("English Grade: " + grades[name][1]);
        System.out.println("Math Grade: " + grades[name][2]);
        System.out.println("ComProg Grade: "+ grades[name][3]);
        
        sum = 0;
        for (int i = 0; i <= 3; i++){
            sum += grades[name][i];
        }

        average = sum/4.0;
        System.out.println("Average: " + average);

        if (average > 100 || average < 0){
            System.out.println("Grade is invalid, kindly change it");
        } else if (average >= 75){
            System.out.println("\nI am so incredibly proud of you for passing! All your hard work, late nights, determination, and perseverance have truly paid off, and this achievement is a testament to your dedication and resilience. You faced challenges, pushed through moments of doubt, and never gave up—even when things felt tough—and now you’re reaping the rewards of your effort.\n" + //
                                "\n" + 
                                "This milestone isn’t just about passing; it’s about the growth, patience, and discipline you’ve shown along the way. Take a moment to celebrate yourself because you deserve every bit of recognition and joy that comes with this success. Remember, this is only one step in your journey, and if this accomplishment is any indication, the future holds even greater things for you.\n" + //
                                "\n" + 
                                "May this success inspire you to reach for even higher goals, embrace new challenges, and continue believing in yourself. Keep shining, keep learning, and never underestimate what you’re capable of. You’ve proven to yourself—and everyone around you—that dedication and perseverance always lead to success.\n" + //
                                "\n" +
                                "Once again, congratulations! May this be the first of many amazing achievements in your life.");
        } else {
            System.out.println("\nBat ka kasi nalate, yan tuloy bagsak midterms mo ulit sa GEFIL");
        }

        System.out.println("\n1. Submit this record to the official record? (Will delete this record");
        System.out.println("2. Modify the grades");
        System.out.println("3. Go to the next record");
        System.out.println("0. Delete this record");
        System.out.println("\nEnter X to exit");
        nameResultChoice = sc.nextLine();
            switch(nameResultChoice){
                case "1" ->{
                    names[name] = "____";
                    grades[name][0] = 0;
                    grades[name][1] = 0;
                    grades[name][2] = 0;
                    grades[name][3] = 0;
                    average = 0;
                }
                case "2" -> {
                    for(int i = 0; i <= 3; i++){
                        System.out.println("Enter the grade: ");
                        grade = sc.nextInt();
                        grades[name][i] = grade;
                    }
                }
                case "3" -> {
                    name++;
                }
                case "0" -> {
                    names[name] = "____";
                    grades[name][0] = 0;
                    grades[name][1] = 0;
                    grades[name][2] = 0;
                    grades[name][3] = 0;
                    average = 0;
                }
                case "x", "X" -> {
                    return;
                }
            }
        }
        if (name > 0){
        System.out.println("NAME: " + names[name]);

        System.out.println("\nScience Grade: " + grades[name][0]);
        System.out.println("English Grade: " + grades[name][1]);
        System.out.println("Math Grade: " + grades[name][2]);
        System.out.println("ComProg Grade: "+ grades[name][3]);

        for (int i = 0; i <= 3; i++){
            sum += grades[name][i];
        }

        average = sum/4.0;
        System.out.println("Average: " + average);

        if (average > 100 || average < 0){
            System.out.println("Grade is invalid, kindly change it");
        } else if (average >= 75){
            System.out.println("\nI am so incredibly proud of you for passing! All your hard work, late nights, determination, and perseverance have truly paid off, and this achievement is a testament to your dedication and resilience. You faced challenges, pushed through moments of doubt, and never gave up—even when things felt tough—and now you’re reaping the rewards of your effort.\n" + //
                                "\n" + 
                                "This milestone isn’t just about passing; it’s about the growth, patience, and discipline you’ve shown along the way. Take a moment to celebrate yourself because you deserve every bit of recognition and joy that comes with this success. Remember, this is only one step in your journey, and if this accomplishment is any indication, the future holds even greater things for you.\n" + //
                                "\n" + 
                                "May this success inspire you to reach for even higher goals, embrace new challenges, and continue believing in yourself. Keep shining, keep learning, and never underestimate what you’re capable of. You’ve proven to yourself—and everyone around you—that dedication and perseverance always lead to success.\n" + //
                                "\n" +
                                "Once again, congratulations! May this be the first of many amazing achievements in your life.");
        } else {
            System.out.println("\nBat ka kasi nalate, yan tuloy bagsak midterms mo ulit sa GEFIL");
        }

        System.out.println("\n1. Submit this record to the official record? (Will delete this record");
        System.out.println("2. Modify the grades");
        System.out.println("3. Go to the next record");
        System.out.println("4. Go to the previous record");
        System.out.println("0. Delete this record");
        System.out.println("\nEnter X to exit");
        nameResultChoice = sc.nextLine();
            switch(nameResultChoice){
                case "1" ->{
                    names[name] = "____";
                    grades[name][0] = 0;
                    grades[name][1] = 0;
                    grades[name][2] = 0;
                    grades[name][3] = 0;
                    average = 0;
                }
                case "2" -> {
                    for(int i = 0; i <= 3; i++){
                        System.out.println("Enter the grade: ");
                        grade = sc.nextInt();
                        grades[name][i] = grade;
                    }
                }
                case "3" -> {
                    name++;
                }
                case "4" -> {
                    name--;
                }
                case "0" -> {
                    names[name] = "____";
                    grades[name][0] = 0;
                    grades[name][1] = 0;
                    grades[name][2] = 0;
                    grades[name][3] = 0;
                    average = 0;
                }
                case "x", "X" -> {
                    return;
                }
            }
        }

    }

    }
}
