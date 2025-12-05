import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentFileStream {
    public void printData (Student student) {
        System.out.println( "Student name" + student.name);
        System.out.println( "Student index: " + student.indexNum);
        System.out.println(" Student record num:" +student.recordNum);


        public void writeToFile(Student student, String fileName)

        FileOutputStream fileOutputStream = new FileOutputStream(fileN)ame;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(FileOutputStream)
                    Student result = student objectOutputStream.readObject();
            System.out.println( "After deserialization:");
            printData(result);




            catch (IOException e) {
                e.printStackTrace();
            }
            catch (IOException | ClassNotFoundException e ) {
                e.printStackTrace();

                return result;

            }

                    )
        }
    }
}
