import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Rememory {

   public static int rememory(HashMap<String,User> map) throws IOException {
       int yes=0;
       System.out.println("请输入用户名：");
       BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
       while(true){
       String username=r.readLine();
       if(!map.containsKey(username)){
           System.out.println("您还未注册，请先注册");break;}
       else {
           System.out.println("请输入身份证号码：");
           String idnumber=r.readLine();
           System.out.println("请输入手机号码：");
           String phonenumber=r.readLine();
           if(map.get(username).getIdcard().equals(idnumber)||map.get(username).getPhonenumber().equals(phonenumber))
           { System.out.println("账号信息不匹配，修改失败");break;}
           else {
               System.out.println("请输入密码：");
               String password=r.readLine();
               map.get(username).setPassword(password);
               System.out.println("修改成功。");
               yes=1;
               break;
           }
       }

       }
       return yes;
    }
}
