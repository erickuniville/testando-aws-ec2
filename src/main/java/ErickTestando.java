import com.amazonaws.util.EC2MetadataUtils;

import java.util.Scanner;

public class ErickTestando {
    public static void main(String[] args) {
        System.out.println("============= TESTANDO INSTANCE-ID =============");

        while (true) {
            new Scanner(System.in).nextLine();
            System.out.println(EC2MetadataUtils.getInstanceId());
        }
    }
}
