import com.amazonaws.util.EC2MetadataUtils;

import java.util.Scanner;

public class ErickTestando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============= TESTANDO INSTANCE-ID =============");
        while (true) {
            try {
                input.nextLine();
                System.out.println(EC2MetadataUtils.getInstanceId());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
