import java.util.Scanner;

public class PostRunner {
    public static void main(String [] args){
        Scanner mesg = new Scanner(System.in);
        System.out.print("Msg Test 1 uname-mesg: ");
        String msg1 = mesg.nextLine();
        System.out.println(msg1);
        if (msg1.indexOf("jpg") == 0){
            MessagePost mp1 = new MessagePost(msg1.substring(0,msg1.indexOf("-") + 1) ,"text");
        }
        System.out.print("Msg Test 2 uname-mesg: ");
        String msg2 = mesg.nextLine();
        MessagePost mp1 = new MessagePost("author", "text");

    }
}
