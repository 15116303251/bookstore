package com.king.bookstore.common.variable;

public class Const {

    public static double POSTAGE=3;

    public interface Customer{
        //超过最大收货地址数量
        int EXCEEDMAX=100;
        int COUSTOMERMAX=3;
        int DEFAULT=1;
        int UN_DEFAULT=0;

    }

    public interface Cart {
        int CHECKED = 1;// 即购物车选中状态
        int UN_CHECKED = 0;// 购物车中未选中状态
        int CHECKEDPRODUCT = 1;
        int UNCHECKEDPRODUCT = 0;
        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";
    }

    public interface Role {
        int ROLE_CUSTOMER = 0; // 普通用户
        int ROLE_ADMIN = 1;// 管理员
    }

    public interface OrderGet{
        String STAGE_GET="0";//驿站自取
        String HOME_DELIVERY="1";//送货上门
    }

    public enum ProductStatusEnum {
        ON_SALE(1, "在线");
        private String value;
        private int code;

        ProductStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }

    public enum StageCodeEnum {
        UNSELECTED(0, "未选择"), YUELU(1, "岳麓区"), FURONG(2, "芙蓉区"), TIANXING(3,
                "天心区"), KAIFU(4, "开福区"), YUHUA(5, "雨花区"),XINSHA(6, "星沙"), WANGCHENG(7, "望城");

        StageCodeEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static StageCodeEnum codeOf(int code) {
            for (StageCodeEnum stageCodeEnum : values()) {
                if (stageCodeEnum.getCode() == code) {
                    return stageCodeEnum;
                }
            }
            throw new RuntimeException("么有找到对应的枚举");
        }

        public static int getCode(String value){
            for(StageCodeEnum stageCodeEnum : values()){
                if(stageCodeEnum.getValue().equals(value)){
                    return stageCodeEnum.getCode();
                }
            }
            return 0;
        }
    }

    public enum OrderStatusEnum {
        CANCELED(0, "已取消"), NO_PAY(10, "未支付"), PAID(20, "已付款"), SHIPPED(40,
                "已发货"),UNSHIPPED(30, "未发货"), ORDER_SUCCESS(50, "订单完成"), ORDER_CLOSE(60, "订单关闭");

        OrderStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static OrderStatusEnum codeOf(int code) {
            for (OrderStatusEnum orderStatusEnum : values()) {
                if (orderStatusEnum.getCode() == code) {
                    return orderStatusEnum;
                }
            }
            throw new RuntimeException("么有找到对应的枚举");
        }

    }
}
