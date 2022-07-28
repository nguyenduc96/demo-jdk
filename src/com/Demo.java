package com;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws IOException {

//        String[] arr1 = {"1", "2", "3", "4", "5"};
//        String[] arr2 = {"6", "7", "8", "9", "10"};
//        List<String[]> strings = new ArrayList<>();
//
//        String[] output = new String[arr1.length + arr2.length];
//        int s = 0;
//        while (s < 10) {
//            for (int i = 0; i < output.length; i++) {
//                if (i < (int) ((0.7) * output.length)) {
//                    output[i] = random(arr1);
//                } else {
//                    output[i] = random(arr2);
//                }
//            }
//            System.out.println(Arrays.toString(output));
//            if (check(strings, output)) {
//                strings.add(output);
//            }
//            System.out.println(strings.size());
//            s++;
//        }
//
//        Map map = new HashMap();
//        map.put("cd", "Css");
//        map.replace("cd", "CsG");
//        System.out.println(map.get("cd"));

//        testStr("Duc");
//        Scanner scanner = new Scanner(System.in);
//
//        int bxL = 3, k, n;
//        System.out.println("nhap so luong xe:");
//        n = scanner.nextInt();
//        System.out.println("nhap so luong banh xe:");
//        k = scanner.nextInt();
//
//        if (k < bxL * n) {
//            System.out.println("Khong dem duoc so xe");
//        } else {
//            int tx = (k - 3*n);
//            System.out.println("Taxi : " + tx);
//            System.out.println("Xe lam: " + (n - tx));
//        }

//        URL url = new URL("http://localhost:8080/api/test");
//        String s = "Nguyen huynh duc";
////        Reader reader = new InputStreamReader(new FileInputStream("test.txt"), StandardCharsets.UTF_8);
////
////        FileReader fileReader = new FileReader("test.txt");
////        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//        httpURLConnection.setDoOutput(true);
//        httpURLConnection.setInstanceFollowRedirects( false );
//        httpURLConnection.setRequestMethod("POST");
//        httpURLConnection.setRequestProperty( "Content-Type", "multipart/form-data");
////        httpURLConnection.setRequestProperty("Accept", "application/json");
//
//        DataOutputStream out = new DataOutputStream(httpURLConnection.getOutputStream());
////        String str = bufferedReader.readLine();
//
////        out.write(str.getBytes(StandardCharsets.UTF_8));
////        out.write(s.getBytes(StandardCharsets.UTF_8));
////        out.flush();
//
//        File file = new File("test.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        byte[] bytes = new byte[(int)file.length()];
//
//        ByteBuffer byteBuffer = ByteBuffer.allocate(14 + file.getName().length());
//        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
//        byteBuffer.put("HTTPSTREAM".getBytes());
//        byteBuffer.putInt(file.getName().length());
//        byteBuffer.put(file.getName().getBytes());
////        out.write(new String(byteBuffer.array()));
//        PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8), true);
//
//        writer.append(new String(byteBuffer.array()));
//        fileInputStream.read(bytes);
//        fileInputStream.close();
//        writer.append(new String(bytes));
//        writer.flush();
//        writer.close();
//
//        if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//            try (BufferedReader bufferedRead = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
//                String line;
//                while ((line = bufferedRead.readLine()) != null) {
//                    System.out.println(line);
//                }
//            }
//        }
//        if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_SERVER_ERROR) {
//            try (BufferedReader bufferedRead = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
//                String line;
//                while ((line = bufferedRead.readLine()) != null) {
//                    System.out.println(line);
//                }
//            }
//        }

        String xml = "<records>" +
                "<record>" +
                "<orderStatus>Accepted</orderStatus>" +
                "<ref>Test</ref>" +
                "<payRef>16461</payRef>" +
                "<amt>10</amt>" +
                "<cur>764</cur>" +
                "<prc>0</prc>" +
                "<src>0</src>" +
                "<ord>00004295104</ord>" +
                "<holder>Holder Name</holder>" +
                "<authId>016461</authId>" +
                "<eci>06</eci>" +
                "<payerAuth>A</payerAuth>" +
                "<sourceIp>192.168.77.10</sourceIp>" +
                "<ipCountry>202.64.244.233</ipCountry>" +
                "<cc0104>4918</cc0104>" +
                "<cc1316>5005</cc1316>" +
                "<remark />" +
                "<settle>F</settle>" +
                "<settleTime />" +
                "<settleBatchId />" +
                "<txTime>2013-10-28 08:51:26.0</txTime>" +
                "<errMsg>Query Successfully</errMsg>" +
                "</record>" +
                "</records>";

//        Testtt testtt = new Testtt();
//        Field[] fields = testtt.getClass().getDeclaredFields();
//        Map map = JSONObject.parseObject(JSONObject.toJSONString(testtt), Map.class);
//        Map data = new HashMap<>();
//        ArrayList strings = new ArrayList<>();
//        for (int i = 0; i < fields.length; i++) {
//            strings.add(fields[i].getName());
//        }
//        for (Object str : strings) {
//        data.put(str, deleteTags(str, xml));
//        }
//        System.out.println(JSONObject.toJSONString(data));


//        Class11 c = new Class11(23322.23323);
//        System.out.println(c.getA());


//       String s = ac();
//        System.out.println(s);
//String amount = "9.122";
//        System.out.println(checkAmount(amount));
//if (checkAmount(amount)) {
//    throw new RuntimeException("Ex");
//}

//        int a[] = {-2,1, 2, -3, 4, -5, -6, -7, -8, 11, - 12, -12, -13, -14, -15, -16,1,1,1,1,-1,-1,-1,-1,-1};
//        long st = System.currentTimeMillis();
//        System.out.println(Arrays.toString(swaps(a, a.length)));
//        long end = System.currentTimeMillis();
//        System.out.println(end-st);
//        String n = "5";
//        System.out.println(BigDecimal.valueOf(Long.valueOf(n), 2));
//        try {
//            Testtt testtt = convertToObject(Testtt.class , xml);
//
//            System.out.println(JSONObject.toJSONString(testtt));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("End");
//        }
//        String a = "400 Bad Request: [{\"Result\":{\"returnCode\": \"400.01\", \"returnMes\": \"empty data\"}}]";
//        String b = a.substring(a.indexOf('[') + 1, a.indexOf(']'));
//        System.out.println(b);
//        Map<String, String> map = JSONObject.parseObject(b, Map.class);
//        Map<String, String> map2 = JSONObject.parseObject(map.get("Result"), Map.class);
//        System.out.println(map2.get("returnMes"));
//        String json = "{'blur_detection_score': '0.011942336', 'blur_detection_result': False}";
//        Gson gson = new Gson();
////        var test = gson.fromJson(json.replaceAll("'", "\""), Test.class);
//
//        var test = JSONObject.parseObject(json.toLowerCase(), Test.class);
//        System.out.println(test.blurDetectionResult);
//        System.out.println(test.blurDetectionScore);
        System.out.println(new Date());
        System.out.println(new Date());
        System.out.println(new java.sql.Date(new Date().getTime()).toLocalDate());
        System.out.println(LocalDateTime.now());
    }
    public static class Test {
        @JsonProperty("blur_detection_score")
        public String blurDetectionScore;

        @JsonProperty("blur_detection_score")
        public String blurDetectionResult;

        public Test() {
        }

        public String getBlurDetectionScore() {
            return blurDetectionScore;
        }

        public void setBlurDetectionScore(String blurDetectionScore) {
            this.blurDetectionScore = blurDetectionScore;
        }

        public String getBlurDetectionResult() {
            return blurDetectionResult;
        }

        public void setBlurDetectionResult(String blurDetectionResult) {
            this.blurDetectionResult = blurDetectionResult;
        }

        public Test(String blurDetectionScore, String blurDetectionResult) {
            this.blurDetectionScore = blurDetectionScore;
            this.blurDetectionResult = blurDetectionResult;
        }
    }

//    static int dQ(int n) {
//        int rs = 0;
//        if (n < 0) {
//            throw new RuntimeException("Unsupported");
//        } else if (n == 0) {
//            return rs += 1;
//        } else {
//
//        }
//    }

    static int[] swaps(int[] a, int n) {
        int right, temp;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0 && i % 2 == 0) continue;
            right = n - 1;
            if (a[i] >= 0 && i % 2 != 0) {
                while (a[right] >= 0) {
                    if (right < i) break;
                    right--;
                }
                temp = a[i];
                a[i] = a[right];
                a[right] = temp;
            }
            if (a[i] < 0 && i % 2 ==0) {
                while (a[right] < 0) {
                    if (right < i) break;
                    right--;
                }
                temp = a[i];
                a[i] = a[right];
                a[right] = temp;
            }
        }
        return a;
    }

    static int indexOf(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                return i;
            }
        }
        return -1;
    }

    static boolean checkAmount(String amount) {
        return !amount.matches("^\\d*.\\d{0,2}");
    }

    public static String ac() {
        try {
            return "Hello";
        }catch (Exception e) {
            return e.getMessage();
        } finally {
            System.out.println("Block finally");
        }
    }

    static <T>  T convertToObject(Class<T> t, String xml) throws RuntimeException {
        Field[] fields = t.getDeclaredFields();
        Map data = new HashMap();
        for (int i = 0; i < fields.length; i++) {
            data.put(fields[i].getName(), deleteTags(fields[i].getName(), xml));
        }
        if (1==1) {
            throw new RuntimeException("");
        }
        return JSONObject.parseObject(JSONObject.toJSONString(data), t);
    }


    static String deleteTags(Object key, String xml) {
        String result = null , key0 = "<" + key + " />";
        if (xml.toLowerCase(Locale.ROOT).contains(key0.toLowerCase(Locale.ROOT))) {
            result = "";
        }
        String key1 = ("<"+key+">").toLowerCase(Locale.ROOT), key2 = ("</"+key+">").toLowerCase(Locale.ROOT);
        if (xml.toLowerCase(Locale.ROOT).contains(key1) && xml.toLowerCase(Locale.ROOT).contains(key2)) {
            result = xml.substring(xml.toLowerCase(Locale.ROOT).indexOf(key1) + key1.length(), xml.toLowerCase(Locale.ROOT).indexOf(key2));
        }
        return result;
    }

    static void testStr(String name, int... ars) {
        System.out.println(name);
        System.out.println(Arrays.toString(ars));
    }

    static boolean check(List<String[]> strings, String[] strs) {
        for (String[] str: strings) {
            for (int i = 0; i < str.length; i++) {
                if (!Objects.equals(str[i], strs[i])) {
                    return false;
                }
            }
        }
        return true;
    }


    static String random(String[] arr) {
       return arr[(int) (Math.random() * (arr.length - 1))];
    }
}
