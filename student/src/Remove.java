import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void remove(ArrayList<Student> list) {
        Scanner r = new Scanner(System.in);
        
        looper: while (true) {
            System.out.println("请输入要删除的学生ID：");
            int id = r.nextInt();
            
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    list.remove(i);
                    System.out.println("删除成功！");
                    break looper;
                }
            }
            System.out.println("该学生ID不存在，请重新输入：");
        }
    }
}
