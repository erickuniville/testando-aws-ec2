import com.amazonaws.util.EC2MetadataUtils;
import static com.amazonaws.util.EC2MetadataUtils.InstanceInfo;

import java.util.Scanner;

public class ErickTestando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============= TESTANDO INSTANCE-ID =============");
        System.out.println("id / ip / inf");
        while(true) {
            try {
                String option = input.nextLine().toLowerCase();
                String result = "";
                if (option.equals("id")) {
                    result = EC2MetadataUtils.getInstanceId();
                } else if (option.equals("ip")) {
                    result = EC2MetadataUtils.getInstanceInfo().getPrivateIp();
                } else if (option.equals("inf")) {
                    InstanceInfo instanceInfo = EC2MetadataUtils.getInstanceInfo();
                    result += "privateIp: " + instanceInfo.getPrivateIp() + "\n" +
                              "instanceId: " + instanceInfo.getInstanceId() + "\n" +
                              "accountId: " + instanceInfo.getAccountId() + "\n" +
                              "architecture: " + instanceInfo.getArchitecture() + "\n" +
                              "availabilityZone: " + instanceInfo.getAvailabilityZone() + "\n" +
                              "imageId: " + instanceInfo.getImageId() + "\n" +
                              "instanceType: " + instanceInfo.getInstanceType() + "\n" +
                              "kernelId: " + instanceInfo.getKernelId() + "\n" +
                              "pendingTime: " + instanceInfo.getPendingTime() + "\n" +
                              "ramdiskId: " + instanceInfo.getRamdiskId() + "\n" +
                              "region: " + instanceInfo.getRegion() + "\n" +
                              "version: " + instanceInfo.getVersion() + "\n";
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
