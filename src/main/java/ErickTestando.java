import com.amazonaws.util.EC2MetadataUtils;

import java.util.List;
import java.util.Scanner;

import static com.amazonaws.util.EC2MetadataUtils.InstanceInfo;
import static com.amazonaws.util.EC2MetadataUtils.NetworkInterface;

public class ErickTestando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============= TESTANDO INSTANCE-ID =============");
        System.out.println("id / ip / inf");
        while(true) {
            try {
                String option = input.nextLine().toLowerCase();
                if (option.equals("id")) {
                    System.out.println(EC2MetadataUtils.getInstanceId());
                } else if (option.equals("ip")) {
                    System.out.println(EC2MetadataUtils.getInstanceInfo().getPrivateIp());
                } else if (option.equals("inf")) {
                    InstanceInfo instanceInfo = EC2MetadataUtils.getInstanceInfo();
                    System.out.println("privateIp: " + instanceInfo.getPrivateIp());
                    System.out.println("instanceId: " + instanceInfo.getInstanceId());
                    System.out.println("accountId: " + instanceInfo.getAccountId());
                    System.out.println("architecture: " + instanceInfo.getArchitecture());
                    System.out.println("availabilityZone: " + instanceInfo.getAvailabilityZone());
                    System.out.println("imageId: " + instanceInfo.getImageId());
                    System.out.println("pendingTime: " + instanceInfo.getPendingTime());
                    System.out.println("ramdiskId: " + instanceInfo.getRamdiskId());
                    System.out.println("region: " + instanceInfo.getRegion());
                    System.out.println("version: " + instanceInfo.getVersion());
                    System.out.println("version: " + instanceInfo.getVersion());
                    for (String billingProduct : instanceInfo.getBillingProducts()) {
                        System.out.println("    billingProduct: " + billingProduct);
                    }
                    for (String devProductCode : instanceInfo.getDevpayProductCodes()) {
                        System.out.println("    devProductCode: " + devProductCode);
                    }
                } else if (option.equals("net")) {
                    List<NetworkInterface> networkInterces = EC2MetadataUtils.getNetworkInterfaces();
                    for (NetworkInterface net : networkInterces) {
                        System.out.println("hostname: " + net.getHostname());
                        System.out.println("macAdress: " + net.getMacAddress());
                        System.out.println("ownerId: " + net.getOwnerId());
                        System.out.println("profile: " + net.getProfile());
                        System.out.println("publicHostname: " + net.getPublicHostname());
                        System.out.println("subnetId: " + net.getSubnetId());
                        System.out.println("subnetIPv4CidrBlock: " + net.getSubnetIPv4CidrBlock());
                        System.out.println("vpcId: " + net.getVpcId());
                        System.out.println("vpcIPv4CidrBlock: " + net.getVpcIPv4CidrBlock());
                        for (String ipV4 : net.getLocalIPv4s()) {
                            System.out.println("    localIPv4: " + ipV4);
                        }
                        for (String securityGroup : net.getSecurityGroups()) {
                            System.out.println("    securityGroup: " + securityGroup);
                        }
                    }
                } else {
                    System.out.println("Esse comando não existe!");
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
