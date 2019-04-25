package org.fresh.gd.commons.consts.utils;


import org.apache.commons.codec.digest.DigestUtils;
import org.fresh.gd.commons.consts.api.qcloudsms.CloudMdSmsServe;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CloudMdSms implements CloudMdSmsServe {

    public String mdSms(String phone) {
        /**
         * 生成随机验证码
         */
        int s = (int) ((Math.random() * 9 + 1) * 100000);
        /**
         * 模板
         */
        String name = "【格调生鲜】您的验证码为" + s + "，请于5分钟内正确输入，如非本人操作，请忽略此短信。";
        String time = getDateContent(new Date());
        //自己  MD5格式加密 (ID+密匙+时间戳)
        String sig = DigestUtils.md5Hex(Consts.MdSms.ACCOUNT_SID + Consts.MdSms.TOKEN + time);
        //赋值
        String params = "accountSid={accountSid}" + //密匙id
                "&smsContent={smsContent}" + //短信内容
                "&to={to}" + // 发送到的手机号
                "&timestamp={time}" + //时间戳
                "&sig={sig}" +  //经过加密后的签名
                "&respDataType=JSON"; // 返回值类型
        params = params.replace("{accountSid}", Consts.MdSms.ACCOUNT_SID);
        params = params.replace("{smsContent}", name);
        params = params.replace("{to}", phone);
        params = params.replace("{time}", time);
        params = params.replace("{sig}", sig);
        System.out.println(params);

        try {
            URL url = new URL(Consts.MdSms.path);

            HttpURLConnection http = (HttpURLConnection) url.openConnection();

            http.setRequestMethod("POST");
            // http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            // 设置连接参数
            http.setDoOutput(true);
            http.setDoInput(true);

            http.setConnectTimeout(5000);//超时时间
            http.setReadTimeout(20000);
            // http.connect();  读取socket发送的信息  接收信息
            OutputStream os = http.getOutputStream();
            os.write(params.getBytes("UTF-8"));// 发送数据
            os.flush();
            os.close();

            // 获取返回信息
            InputStream is = http.getInputStream();
            int size = is.available();
            byte[] jsonBytes = new byte[size];
            is.read(jsonBytes);
            String message = new String(jsonBytes, "UTF-8");
            // {"respCode":"00000","respDesc":"请求成功。","failCount":"0","failList":[],"smsId":"2e1c571f6c134784a0081c4bf6768703"}
            System.out.println("返回信息：" + message);
            return s + "";

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getDateContent(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String timestamp = sdf.format(date);
        return timestamp;
    }

}
