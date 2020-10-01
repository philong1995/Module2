package Demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String File_Name = "/Users/macbookpro/Desktop/Module2/_15_IO_Text_file/src/Demo/Stundents.csv";
    public static final String COMMA = ", ";

    public static void main(String[] args) {

//        OUTPUT FILE

//        Students student1 = new Students(1,"Nguyen Van A","01/04/1995");
//        Students student2 = new Students(2,"Nguyen Van B","02/05/1996");
//        Students student3 = new Students(3,"Nguyen Van C","03/06/1997");
//
//        List<Students> studentsList = new ArrayList<>();
//        studentsList.add(student1);
//        studentsList.add(student2);
//        studentsList.add(student3);
//
//        String line = null;
//
//        for (Students students : studentsList){
//            line = students.getId() + COMMA + students.getName() + COMMA + students.getDateOfBirth()+"\n";
//            FileUtils.writeFile(File_Name,line);
//        }

//        INPUT FILE

        List<String> listLine = FileUtils.readFile(File_Name);
        System.out.println(listLine);

    }
}
