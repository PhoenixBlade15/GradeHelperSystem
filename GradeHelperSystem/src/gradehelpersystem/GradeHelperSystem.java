package gradehelpersystem;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class GradeHelperSystem {
    
    public static String dirS = System.getProperty("user.dir") + "\\GradeHelperFiles";
    
    public static void main(String[] args) {
        
        // Sets up the courses file for later use
        try{
            File dir = new File(dirS);
            File courses = new File(dir + "\\Courses.txt");
            if ( !courses.exists() ){
                try {
                    dir.mkdir();
                    try (FileWriter fWriter = new FileWriter( courses );PrintWriter output = new PrintWriter( fWriter )) {
                        output.println("EXAMPLE");
                        output.println("Yes");
                        output.println("A");
                        output.println("3");
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    System.exit(2);
                }
            }
        } catch ( Exception e ){
            System.exit(1);
        }
        
        MainMenu MM = new MainMenu();
        MM.createGradeFile("EXAMPLE");
        MM.createCategoryFile("EXAMPLE");
        MM.setVisible(true);
        
    }
    
}
