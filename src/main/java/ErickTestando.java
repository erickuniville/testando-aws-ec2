import com.amazonaws.util.EC2MetadataUtils;

import java.util.Scanner;

public class ErickTestando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("id / ip");
        while(true) {
            try {
                String option = input.nextLine().toLowerCase();
                String result;
                if (option.equals("id")) {
                    result = EC2MetadataUtils.getInstanceId();
                } else if (option.equals("ip")) {
                    result = EC2MetadataUtils.getInstanceInfo().getPrivateIp();
                } else {
                    result = "ERROR";
                }

                System.out.println("RESULT: " + result);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
