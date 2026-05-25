import java.util.ArrayList;
import java.util.Scanner;

public class Add {

    public static void add(ArrayList<Student> list) {
        Scanner r = new Scanner(System.in);
        
        while (true) {
            System.out.println("请输入学生ID：");
            int id = r.nextInt();
            
            boolean idExists = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    System.out.println("ID已存在，请检查后重新输入。");
                    idExists = true;
                    break;
                }
            }
            
            if (!idExists) {
                Student one = new Student();
                one.setId(id);
                
                System.out.println("请输入学生姓名：");
                one.setName(r.next());
                
                System.out.println("请输入学生年龄：");
                one.setAge(r.nextInt());
                
                System.out.println("请输入学生地址：");
                one.setLocation(r.next());
                
                list.add(one);
                System.out.println("添加成功！");
                break;
            }
        }
    }
}
