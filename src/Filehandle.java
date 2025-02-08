import org.json.JSONObject;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filehandle {

    public static void main(String[] args) {

//        new

        try {
            File file = new File("C:\\Users\\91721\\Desktop\\Student Management System\\file.json");
            Scanner sc = new Scanner(file);
            StringBuilder jsondata = new StringBuilder();
            while (sc.hasNextLine()) {
                jsondata.append(sc.nextLine());
            }
            sc.close();
                JSONObject jsonobject = new JSONObject(jsondata.toString());

                String name = jsonobject.getString("name");
                int age = jsonobject.getInt("age");
                String city = jsonobject.getString("city");
                System.out.println("Name : "+name);
                System.out.println("Age : "+age);
                System.out.println("City : "+city);

        } catch (FileNotFoundException e) {
            System.out.println("File not found..");
        }



    }


}



