package org.fresh.gd.commons.consts.consts;


import java.util.Random;

public class Consts {

    public static String getStringRandom(int length) {

        String val = "";
        Random random = new Random();

        //参数length，表示生成几位随机数
        for(int i = 0; i < length; i++) {

            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if( "char".equalsIgnoreCase(charOrNum) ) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char)(random.nextInt(26) + temp);
            } else if( "num".equalsIgnoreCase(charOrNum) ) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }



    /**
     * 基于毫秒的换算单位
     */
    public static class Time {
        /**
         * 用于表示秒
         */
        public static final long SECONDS = 1000;

        /**
         * 分钟
         */
        public static final long MINUTES = SECONDS * 60;
        /**
         * 小时
         */

        public static final long HOUR = MINUTES * 60;
        /**
         * 一天
         */
        public static final long DAY = HOUR * 24;

        /**
         * yyyyMMdd HHmmss
         */
        public static final String TIME_PARTTRN_ONE = "yyyyMMddHHmmss";
    }

    public enum Role {

        /**
         * 超级管理员
         */
        SUPER_ADMIN("SUPER_ADMIN", "店长"),

        /**
         * 收银员
         */
        CASHIER("CASHIER", "收银员");

        private String code;
        private String name;

        public String   getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        Role(String code, String name) {
            this.code = code;
            this.name = name;
        }
    }


    public static class Department {

        public static final String DEPARTMENT_CODE_PATTERN = "00000";

        public static final String DEPARTMENT_PREFIX = "MD";


    }

    public static class Promotion {
        public static final int PROMOTION_STAT_ENABLED = 1;
    }


    public static class User {
        /**
         * 用户为激活状态
         */
        public static final int USER_STAT_ACTIVE = 1;


    }

    public static class Order {
        public static final String ORDER_NO_PATTERN = "000000";
        /**
         * 已经支付
         */
        public static final int ORDER_PAYMENTED = 1;

        /**
         * 已扣库存
         */
        public static final int ORDER_REDUCE_STOCK = 1;
        /**
         * 未扣库存
         */
        public static final int ORDER_NOT_REDUCE_STOCK = 0;

        public static final int ORDER_MAX_SEQ = 999999;

        /**
         * 超市门店收银订单
         */
        public static final int ORDER_TYPE_STORE = 1;

        /**
         * 余额消费
         */
        public static final int PAY_CHANNEL_BALANCE = 4;


        public static final String ORDER_DELAYED_QUEUE = "order:delayed:queue";
    }


    public static class Dic {


        public static final String DIC_CODE_PREFIX = "ZD";

        public static final String DIC_CODE_PATTERN = "00000";

    }

    public enum DicType {
        DIC_BRAND(100, "品牌"),
        DIC_UNIT(101, "单位"),
        DIC_VIP_CARD_INTERVAL(201, "VIP续期卡");

        private int type;
        private String name;

        public int getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        DicType(int type, String name) {
            this.type = type;
            this.name = name;
        }
    }


    public static class Org {


        public static final String ORG_CODE_PATTERN = "00000";

        public static final String ORG_CODE_PREFIX = "SH";
    }


    public static class Supplier {
        public static final String SUPPLIER_CODE_PATTERN = "00000";

        public static final String SUPPLIER_CODE_PREFIX = "GYS";
    }


    /**
     * 功能描述
     *    前缀 表名：属性：ID
     * @param
     * @author zgw
     * @return
     */
    public static class RedisPrefix {

        public static final String PREFFIX_USER_IMEI = "User:imie";

        public static final String PREFFIX_USER_ID = "User:tk";

        public static final String PREFFIX_COMMONS_SEQ = "commons:seq";

        public static final String PREFIX_ORDER_SEQ = "order:seq";

        public static final String PREFIX_PAY_RECORD_SEQ = "pay:record:seq";


        public static final String PREFFIX_GOODS_GCODE_SEQ = "goods:gcode:seq";


    }


    public static class Settlement {

        public static final int QIAN_KUAN = 1;

        public static final int HUI_KUAN = 2;


    }

    /**
     * 支付模块常量
     */
    public static class Payment {
        public static final String PREFIX_PAYMENT_RECORD = "62";
        public static final String PAYMENT_RECORD_PATTERN = "00000";

        /**
         * 支付记录：收入
         */
        public static final int PAYMENT_RECORD_SHOURU = 1;

        /**
         * 收银的支付渠道
         */
        public static final int PAYMENT_CHANNEL_CASHIER = 1;
        /**
         * 下单业务模型
         */
        public static final int PAYMENT_BIZ_TYPE_ORDER = 1;

        /**
         * 充值的业务模型
         */
        public static final int PAYMENT_BIZ_TYPE_CHONG = 2;
    }


    public static class Purchase {

        /**
         * 未入库状态
         */
        public static final int UNREACH_STOCK = 0;

        /**
         * 已经入库状态
         */
        public static final int REACH_STOCK = 1;

        public static final int DISCARD_STOCK = 2;

        public static final String PURCHASE_BATCH_NO_PATTERN = "00000";

        public static final String PUHCHASE_BATCH_NO_PREFIX = "PUR";


    }


    public static class ReturnPurchase {

        public static final String RETURN_PURCHASE_PREFIX = "TUH";

        public static final String RETURN_PURCHASE_PATTERN = "00000";


        public static final int WEI_CHUKU_TYPE = 0;


    }

    public static class MemberCard {
        /**
         * 会员占有状态
         */
        public static final int CARD_OWNER_OCCUPY = 1;
        /**
         * 会员卡处于禁用状态
         */
        public static final int CARD_DISABLE = 0;
    }


    public static class StockIORecord {


        /**
         * 入库类型
         */
        public static final int STOCK_IN_TYPE = 1;

        /**
         * 出库类型
         */
        public static final int STOCK_OUT_TYPE = 2;

        /**
         * 业务类型为采购入库
         */
        public static final int BIZ_TYPE_PURCHASE = 1;


        /**
         * 业务类型为退货
         */
        public static final int BIZ_TYPE_TUIHUO = 2;

        /**
         * 业务类型为零售
         */
        public static final int BIZ_TYPE_LINGSHOU = 3;


    }

    public static class Stock {
        public static final String TOPIC_STOCK_PREFIX_QUEUE = "topic:stock:";
        public static final String STOCK_REDUCE_OPERATE = "stock:reduce:operate:";
        public static final String STOCK_REALEASE_LOCK = "stock:release:operate:";

        public static final int STOCK_ROLLBACK_STAT_DONE = 1;
    }

    public enum GoodsCodeType {
        BAR_CODE(0, "商品条码"),

        AUTO_GENERATE(1, "自动生成"),

        MULTIPLE_CODE(2, "一品多码");


        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        GoodsCodeType(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }


    public enum Result {
        /**
         * 成功
         */
        SUCCESS(0, "处理成功"),

        /**
         * 业务错误
         */
        BIZ_ERROR(101, "业务错误"),
        /**
         * 请求参数错误
         */
        ERROR_PARAM(100, "请求参数错误");


        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        Result(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

    }

}
