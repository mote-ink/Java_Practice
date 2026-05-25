import java.util.ArrayList;
import java.util.Scanner;

public class Set {

    public static void set(ArrayList<Student> list) {
        Scanner r = new Scanner(System.in);
        
        looper: while (true) {
            System.out.println("请输入要修改的学生ID：");
            int id = r.nextInt();
            
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    System.out.println("请输入新姓名：");
                    list.get(i).setName(r.next());
                    
                    System.out.println("请输入新年龄：");
                    list.get(i).setAge(r.nextInt());
                    
                    System.out.println("请输入新地址：");
                    list.get(i).setLocation(r.next());
                    
                    System.out.println("修改成功！");
                    break looper;
                }
            }
            System.out.println("该学生ID不存在，请重新输入：");
        }
    }
}
