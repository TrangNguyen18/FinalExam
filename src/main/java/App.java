import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {

        List<Students> studentList = new ArrayList<>();
        String fileIn = "C:\\Users\\trang.nguyen18_onemo\\Desktop\\data.csv";
        String fileOut = "Question4orderedList.csv";
        String line = null;

        //Đọc danh sách sinh viên từ file csv
        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            String[] temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            String email = temp[2];
            float bonus = Float.parseFloat(temp[3]);
            float report = Float.parseFloat(temp[4]);
            float app = Float.parseFloat(temp[5]);
            float lt = Float.parseFloat(temp[6]);
            studentList.add(new Students(id, name, email, bonus,report,app,lt));
        }
        bufferedReader.close();

// Sắp xếp 10 sinh vien theo điểm lý thuyết cao nhất
        Collections.sort(studentList, new Comparator<Students>() {
            public int compare(Students o1, Students o2) {
                return Float.compare(o1.getLt(), o2.getLt());
            }
        });
        Collections.reverse(studentList);
        System.out.println("\n");
        System.out.println("Danh sách sinh vien sau khi sort theo điểm lt\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(studentList.get(i));
        }
        // Sắp xếp 10 sinh viên theo tổng điểm thấp nhất
        Collections.sort(studentList, new Comparator<Students>() {
            @Override
                public int compare(Students o1, Students o2) {
                    return Float.compare(o1.getGpa(), o2.getGpa());
                }
            });
        System.out.println("\n");
        System.out.println("Danh sách sinh vien sau khi sort theo điểm gpa\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(studentList.get(i));
        }
// Ghi các sinh viên vào file
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < studentList.size(); i++) {
                oos.writeObject(studentList.get(i));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Ghi file thanh cong");
    }


}