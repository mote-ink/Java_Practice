import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Regisster {
 public static int register(HashMap<String, User> map) throws IOException {
     int yes=0;
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      
      while(true){
       User username = new User();
         System.out.println("请输入用户名：");
          String input = r.readLine();
          
     if(map.containsKey(input)){
         System.out.println("该用户已存在，请重新注册用户名");
         continue;
     }

     if(input.length()>15 || input.length()<3){
         System.out.println("用户名长度必须在3和15之间。");
         continue;
     }
     
     if(!input.matches(".*[a-zA-Z].*") || !input.matches(".*[0-9].*")){
         System.out.println("用户名必须同时包含字母和数字。");
         continue;
     }
     
     username.setUsername(input);
     
     while(true){
         System.out.println("请输入密码：");
         String password1 = r.readLine();
         System.out.println("请再次输入密码：");
         String password2 = r.readLine();
         
         if(!password1.equals(password2)){
             System.out.println("两次输入的密码不一致，请重新输入！");
             continue;
         } else {
             username.setPassword(password1);
             break;
         }
     }
     while(true){
     System.out.println("请输入身份证：");
     String id=r.readLine();
            if(id.length()!=18){System.out.println("格式错误.");continue;}
     int cow=0;
         for(int i=0;i<18;i++){if(id.charAt(i)>'9'||id.charAt(i)<'0')cow=1;}
         int count=0;
         if(id.charAt(17)=='x'||id.charAt(17)=='X')count=1;
         else
         if(id.charAt(17)<='9'&&id.charAt(17)>='0')count=1;
              if(count==0||cow==1||id.startsWith("0"))System.out.println("格式错误.");
           else  {username.setIdcard(id);break;}
     }
    while(true){
        int step=0;
        System.out.println("请输入手机号码：");
        String number=r.readLine();
        if(number.length()!=11){System.out.println("格式错误.");continue;}
        for(int i=0;i<11;i++){if(number.charAt(i)>'9'||number.charAt(i)<'0')step=1;}
        if(number.startsWith("0")||step==1)System.out.println("格式错误.");
        else {username.setPhonenumber(number);break;}
    }
     
     map.put(input, username);
     System.out.println("注册成功！");
     yes=1;
     break;
     }
      return yes;
    }
}
