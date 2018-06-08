package com.king.bookstore.common.variable;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
        // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
        public static String app_id = "2016091500520675";

        // 商户私钥，您的PKCS8格式RSA2私钥
        public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCalszXgItN6oUg20vU3PFwSjAf5qvLNI/mKwo8Vv5ehvWmiVhTMkZXTJDvHwmFisfpGYpRgWLppX5JWZGMSdL4ZKWwLDLiYK8X3wfaU/BeNI6NiIRAWJDUkjw2a8bFhtof6fG2FnI76eSp0oQLjUvuUVIfARSJ9TbCCsXV+/CLovrwm6dSlwuM1MP754RNxr/VhQhcEWXMQXF0fGSnHA5RGPl9yebCW/n7t1FhrTDwV/J0b+3Vjx9FOgcVqu8tuItm+OPzzJm/p8PKZbkbtbdAswThtV7j5F3MX3nfGyRelJc5WmvkW4KO0zTAY9Mve49VaPDdcqlN7SabOJ+FIuFdAgMBAAECggEACBOY4Cl3HbsC+ZR7gcOJWbSGjyQeFZ/JZN0ay8w/vfCPJQRH+RDHXAhECjo05SU7DJKpB1kbMdnTn0FuuUWiIBgiD/I/NlSW0Uh1wJJiHIniaMKZJkN6TaDWRIGdAPTqsIAogLrrfPXbXIQDIhdfwDO/dp83031cPwcRDvz6tFDabVhZk9uCOMs9/BZLRaRdXWEV+YR82z9gMbxj2/WWfB3ROXKvPoX4rNL21P5ENgl6kHWtU6RID47oRHG2etlMizYpUgdyQ/AybsUt3WTPrjQGroTwgoWq/BiUWR6DPBfCbmqFtEgzOswdxm01ExryZ7l3L9CG5Xo0tWWnu7pcAQKBgQDtt+6SMGXfndSU2RZYUH0LqruvHlsjqm9cqsD57QYDKKIZIege+2Meb3uBcjXhbUpdR5jeKh8BFX9zcKlRhj1lPtPbxN1Ti3/69/EA48umQ2YfoQeQ++xUrxHMSx+untRWn+iayog6mV2cAeyHm8UDW0QP4lkTihJ18q/fEUMuSQKBgQCmekNLP7flCE/TrBE4QYCByzOQrC6arN5idj/Im3kmi26zjdUq+gV6cQuwPNeFBZ5JEU7aVmIVhojx5g31PQfBVWZ8zfrqb8jNrzH7BEZlstriq3k9y/40DEoOWSbMSH/DufivsehAjqE3qBy3N5lsrLIefhysC4wr5ylD8CDqdQKBgGJvocjDZcv9TUP9yPT1D3K/Vkyjo1XXg5m504MqlSzFrKn/kmER8+9sdpYZtxoL6ZlKxpBonMIUJtyksFhj4BSGua/ti0DHKU3BUfjuWywUCLvcMIfm6ev/Or1/9jSW7JKaUPWYHGU3kL3DRjC5XhGPv1Vcg0pGCHLy9cTHHyyRAoGAUxXJ6BBQ8xmG3ZmOrojiXeTQQ2/rgn6sLm/dvXz6peYIxcwPi3dkrIsmzjpPRbBcIxNkS0u5gAy45CFw7egbqr24fKlAhShtC1pYk3K6v57X5zC1PcZFhCxt+WM9Hc9BFKoIF4eu5ilJBMH+MuKoy7gU3WsLXEIXHwIrciCyDNECgYAHnEMBaqG2X4rPFXe5vGaBT2c0I5FP0DWXc0RymJuqnOZyFJFGIMUGeATGrik9W1LWvckdKatpQaGAjLD0L79ONiCnBs6XbP19Aak4s81OoH0IX71WIIDEiouGos0Y1o+63NlU2CZzCcglRcPDi8FBY7O9TfKs38eYN/8DOLe8EQ==";

        // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
        public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAusya5Ov+B9qeYXHsAKemTt7WGOayR8uj9019LW+91seEMsZfG4Bn2SKCbnMTyifJqsWUM5V/6MBlRP2KlQtWfJ6K2EV5vTeZmiJ2pSlD2L/h0kpJx+Cw7cLGeILZ7aJZWvk7CwHabHft0Dqa64z7yoqbpWXOFwNRZdO6hMMDvxEWz7rGhxrMVOcUxH2q3G01At0n04p5tOUA5T9IJIdg/MAiKu66D6PxChXU2N2fH6MFMaaU2QK9dB0CimfcdBUojbjuciwd0DjPdeU4BuLSjpLU0pV14jJVKPcjz0PoQAQbCrT8ZHmYJM2mqMfWcHTYknGkE9APmIdDrATGnhNhhQIDAQAB";

        // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        public static String notify_url = "http://localhost/notify_url.jsp";

        // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        public static String return_url = "http://localhost/afterPay";

        // 签名方式
        public static String sign_type = "RSA2";

        // 字符编码格式
        public static String charset = "utf-8";

        // 支付宝网关
        public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

        // 支付宝网关
        public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

        /**
         * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
         * @param sWord 要写入日志里的文本内容
         */
        public static void logResult(String sWord) {
            FileWriter writer = null;
            try {
                writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
                writer.write(sWord);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

