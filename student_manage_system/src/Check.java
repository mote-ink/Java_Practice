import java.util.ArrayList;
import java.util.Scanner;

public class Check {
    public static void check(ArrayList<Student> list) {
        Scanner r = new Scanner(System.in);
        
        looper: while (true) {
            System.out.println("请输入要查询的学生ID：");
            int id = r.nextInt();
            
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    System.out.println("学号\t姓名\t年龄\t地址");
                    System.out.print(list.get(i).getId() + "\t");
                    System.out.print(list.get(i).getName() + "\t");
                    System.out.print(list.get(i).getAge() + "\t");
                    System.out.print(list.get(i).getLocation() + "\t");
                    System.out.println();
                    break looper;
                }
            }
            System.out.println("该学生无信息，请添加后输入：");
        }
    }
}
