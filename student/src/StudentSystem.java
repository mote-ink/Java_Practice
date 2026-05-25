import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) throws IOException {
        HashMap<String,User> map = new HashMap<>();
        ArrayList<Student> list = new ArrayList<>();

       System.out.println("欢迎来到学生管理系统！");
        looper1:while(true) {
       System.out.println("请选择你的操作：1.登录；2.注册；3.忘记密码。");
       Scanner h = new Scanner(System.in);

        int choosefirst=h.nextInt();
        switch (choosefirst){
            case 1:{int a=Enter.log(map);if(a==1)break looper1;else continue looper1;}
            case 2:{int b=Regisster.register(map);if(b==1)break looper1;else continue looper1;}
            case 3:{int c=Rememory.rememory(map);if(c==1)break looper1;else continue looper1;}
            default:
                System.out.println("请重新输入");
        }
   }



        looper: while (true) {
        System.out.println("---------欢迎来到黑马学生管理系统---------");
        System.out.println("1:增加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择：");
            Scanner r = new Scanner(System.in);
            int choose = r.nextInt();
            
            switch (choose) {
                case 1: {
                    Add.add(list);
                    break;
                }
                case 2: {
                    Remove.remove(list);
                    break;
                }
                case 3: {
                    Set.set(list);
                    break;
                }
                case 4: {
                    Check.check(list);
                    break;
                }
                case 5: {
                    System.out.println("已退出");
                    break looper;
                }
                default: {
                    System.out.println("输入有误，请重新输入");
                    break;
                }
            }
        }
    }
}
