import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Enter {
    public static int log(HashMap<String,User> map) throws IOException {
        int yes=0;
        while(true) {
            System.out.println("请输入用户名：");
            BufferedReader l = new BufferedReader(new InputStreamReader(System.in));
            String username = l.readLine();
            System.out.println("请输入密码：");
            String password = l.readLine();
            while(true){
            String number1=numb();
            System.out.println("请输入验证码：  ("+number1+")");
            String number=l.readLine();
            if(!number.equalsIgnoreCase(number1)){
                System.out.println("验证码错误，请重新输入。");
                continue;
            }
            else{break;}}

            if(map.get(username)==null){
                System.out.println("该用户未注册");
                break;
            }
            else if (map.get(username).toString().equals(password))break;
            else{
                System.out.println("密码错误,请重新输入:(共3次机会)");
                for(int i=2;i>=0;i--){
                    String password2 = l.readLine();
                    if (map.get(username).toString().equals(password2)){yes=1;break;}
                    else System.out.println("您还有"+(i)+"次机会");
                }
            }
        }
        return yes;
    }
    public static String numb(){
        Random r = new Random();
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder proof = new StringBuilder();
        for(int i = 0; i < 4; i++){
            int index = r.nextInt(chars.length());
            proof.append(chars.charAt(index));
        }
        return proof.toString();
    }
}
