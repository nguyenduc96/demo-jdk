package test;

public class Main {
    public static void main(String[] args) {
        String data = "header=Header(version=2.0.2, platformToken=null, terminalToken=null, signature=null," +
                " appType=A, appVersion=F2.9.0, uuid=null, status=Status(responseCode=0000, message=Approved), " +
                "mcpTerminalId=null, jwt=null, appName=null, appOS=null), obj=ShopeePayAccountLinkResData(gatewayResponseCode=00, " +
                "gatewayResponseDate=null, hostResponseMessage=success, " +
                "redirectUrlWeb=https://mall.uat.shopee.sg/s/browser/payment/linking/agreement?__mobile__=1&ticket=gxeqgMmBZEHeGSpOvldetN3tA5lIBphi), " +
                "data={hostResponseMessage=success, redirectUrlWeb=https://mall.uat.shopee.sg/s/browser/payment/linking/agreement?__mobile__=1&ticket=gxeqgMmBZEHeGSpOvldetN3tA5lIBphi, " +
                "gatewayResponseCode=00}";
        System.out.println(covertJSON(data));
    }

    private static String covertJSON(String data) {
        return data.replace('=', ':').replace('(', '{')
                .replace(')', '}');
    }
}
