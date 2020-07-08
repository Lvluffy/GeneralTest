package com.luffy.test.android.base;

/**
 * TSMClient使用的错误码，用于向用户展示的，SP或TSM的错误码需要转一下与此错误码保持一致
 */
public class ErrorCode {

    /**
     * 请求成功.所有接口调用成返回值都为0,非0表示失败.
     */
    public static final int SUCCESS = 0;

    /**
     * 所有未被赋值的默认返回值
     */
    public static final int DEFAULT_VALUE = -1;

    //通用错误 1000以下.
    /**
     * 非法参数。方法调用前，都会进行参数合法性校验，失败抛出此错误。
     */
    public static final int ERROR_CLIENT_INVALID_PARAM = 1;
    /**
     * 网络错误。
     */
    public static final int ERROR_NETWORK = 2;
    /**
     * 无法获取服务*
     */
    public static final int ERROR_NOT_GET_SERVICE = 3;
    /**
     * 远程调用错误*
     */
    public static final int ERROR_REMOTE_FAILED = 4;
    /**
     * 登录失败。
     */
    public static final int ERROR_LOGIN_FAILED = 5;
    /**
     * 强制中断，可能发生于ondestory时强制回收资源。
     */
    public static final int ERROR_CLIENT_FORCE_INTERRUPT = 6;
    /**
     * 小米server api执行失败
     */
    public static final int ERROR_AUTH_FAILED = 7;

    /**
     * APDU指令执行错误
     */
    public static final int ERROR_TRANSMIT_APDU = 8;

    /**
     * 当前操作的应用冲突
     */
    public static final int ERROR_CONFLICT_APP = 9;
    /**
     * NFC相关错误
     */
    public static final int ERROR_NFC = 10;

    /**
     * 执行线程被中断
     */
    public static final int ERROR_INTERRUPTED = 11;

    /**
     * 网络，读写操作等发生的IO异常
     */
    public static final int ERROR_IO_EXCEPTION = 12;

    /**
     * 获取cplc失败
     */
    public static final int ERROR_GET_CPLC = 13;

    /**
     * 获取账号信息失败
     */
    public static final int ERROR_GET_ACCOUNT = 14;

    /**
     * 获取设备信息时失败，例如 IMEI DEVICE_MODEL
     */
    public static final int ERROR_GET_DEVICE_INFO = 15;

    /**
     * 服务器应答错误
     */
    public static final int ERROR_SERVER_RESPONSE = 16;

    /**
     * 操作不支持
     */
    public static final int ERROR_OPERATION_NOT_SUPPORT = 17;

    /**
     * 没有权限
     */
    public static final int ERROR_NO_PERMISSION = 20;

    public static final int ERROR_NFC_DISABLED = 31;
    public static final int ERROR_SE_RESTRICTED = 32;
    public static final int ERROR_ESE_ROUTE_DISABLED = 33;

    //支付相关错误码。code区间在1000-2000.
    /**
     * 重复支付。
     */
    public static final int ERROR_DUPLICATE_PAY = 1000;
    /**
     * 充值失败。
     */
    public static final int ERROR_RECHARGE_FAILED = 1001;
    /**
     * 活动资源已用尽。
     */
    public static final int ERROR_HAS_NO_PROMOTION_RESOURCE = 1002;
    /**
     * 处理未决交易失败。
     */
    public static final int ERROR_HANDLE_UNSOLVED_ORDER_FAILED = 1003;
    /**
     * 订单状态待确认。
     */
    public static final int ERROR_ORDER_STATE_NEED_CONFIRM = 1004;
    /**
     * 插件未安装。
     */
    public static final int ERROR_PLUGIN_NOT_FOUND = 1005;
    /**
     * 支付金额低于最低充值金额
     */
    public static final int ERROR_PAY_AMOUNT_TOO_SMALL = 1006;
    /**
     * 支付金额超出最高充值金额
     */
    public static final int ERROR_PAY_AMOUNT_TOO_LARGE = 1007;
    /**
     * 支付后的余额超出卡片允许的最高金额
     */
    public static final int ERROR_AMOUNT_LARGER_THAN_TOTAL_AMOUNT = 1008;
    /**
     * 当前账户被锁定,暂时不能操作.
     */
    public static final int ERROR_ACCOUNT_LOCKED = 1009;
    /**
     * 订单处理未完成,此时可能需要重新查询订单再进一步处理.
     */
    public static final int ERROR_ORDER_HANDLE_UNFINISH = 1010;

    /**
     * 圈存失败,需自动退款.
     */
    public static final int ERROR_RECHARGE_FAILED_AND_REFUND = 1012;
    /**
     * 支付后的余额低于最低余额.
     */
    public static final int ERROR_BALANCE_SMALLER_THAN_MIN_BALANCE = 1013;

    /**
     * 用户卡号不存在
     */
    public static final int ERROR_CARD_NUMBER_NOT_EXIST = 1136;
    /**
     * 用户卡号已禁用
     */
    public static final int ERROR_CARD_NUMBER_HAS_BEEN_DISABLED = 1137;
    /**
     * 卡片已退卡
     */
    public static final int ERROR_CARD_HAS_BEEN_REFUNDED = 1138;
    /**
     * 卡片有效期超限
     */
    public static final int ERROR_CARD_OUT_VALIDITY = 1139;
    /**
     * 卡片超过最大宕账额
     */
    public static final int ERROR_CARD_EXCEED_MAXIMUM_AMOUNT = 1140;
    /**
     * 备用金不足
     */
    public static final int ERROR_DEPOSIT_INSUFFICIENT = 1141;

    //卡片相关。code值区间在2000~3000.
    /**
     * 卡片冲突，米3手机同时只能开一张公交卡。
     */
    public static final int ERROR_CARD_CONFLICT = 2000;

    /**
     * 无效的卡片。外卡充值时，如果充值操作已经绑定了卡A，此时拿卡B去操作，会返回此错误。
     */
    public static final int ERROR_CARD_INVALID = 2002;

    public static final int ERROR_CARD_NOT_EXIST = 2003;

    public static final int ERROR_APPLET_NEED_UPGRADE = 7007;

    //3000开始是银行卡相关的错误码

    /**
     * 卡片信息验证错误
     */
    public static final int CARD_VERIFY_FAILED = 3001;

    /**
     * 账户过期
     */
    public static final int USER_ACCOUNT_EXPIRE = 3002;

    /**
     * 用户未预留电话号码
     */
    public static final int USER_NOT_RESERVE_PHONE_NUM = 3003;

    /**
     * 验证码验证失败
     */
    public static final int OTP_INFO_VERIFY_FAILED = 3004;

    /**
     * 验证码过期
     */
    public static final int OTP_INFO_EXPIRE = 3005;

    /**
     * 数据尚未准备好
     */
    public static final int DATA_NOT_READY = 3007;


    /**
     * 用户当日申请次数超出限制
     */
    public static final int APPLY_TIMES_EXCEED_LIMIT = 3008;

    /**
     * 用户当日失败次数超出限制
     */
    public static final int FAILED_TIME_EXCEED_LIMIT = 3009;

    /**
     * 用户帐户信息无业务申请权限
     */
    public static final int USER_ACCOUNT_NO_APPLY_PRIVILEGE = 3010;

    /**
     * 重复验证，用户OTP验证已通过
     */
    public static final int OTP_INFO_REVERIFY = 3011;

    /**
     * 用户账户信息不存在
     */
    public static final int USER_ACCOUNT_NOT_EXIST = 3012;

    /**
     * 该卡不支持开通闪付功能
     */
    public static final int BANK_CARD_NOT_SUPPORTED = 3013;

    /**
     * 用户身份信息校验失败
     */
    public static final int USER_IDENTITY_VERIFY_FAILED = 3014;

    /**
     * 输入的关键信息为空
     */
    public static final int NULL_KEY_INFOMATION = 3015;

    /**
     * 账户信息被列为黑名单
     */
    public static final int USER_ACCOUNT_IN_BLANK_LIST = 3016;

    /**
     * fpan重复加载，手机上已经有一张此fpan申请下载的卡
     */
    public static final int FPAN_DUPLICATED_APPLY = 3017;

    /**
     * 超过最大发卡量
     */
    public static final int TOTAL_APPLY_NUM_EXCEED_LIMIT = 3018;

    /**
     * 卡片状态不支持开通闪付功能
     */
    public static final int CARD_STATUS_ERROR = 3019;

    /**
     * 卡片类型不支持开通闪付功能
     */
    public static final int CARD_TYPE_ERROR = 3020;

    /**
     * 银行类系统错误，可重试
     */
    public static final int RETRY_OR_CONTACT_CUSTOMER_SERVICE = 3021;

    /**
     * 银行类系统错误，不可重试
     */
    public static final int CONTACT_CUSTOMER_SERVICE = 3022;

    /**
     * 客户没有权限申请业务
     */
    public static final int USER_NO_APPLY_PRIVILEGE = 3023;

    /**
     * 用户绑定银行卡，雪球Applet需要升级错误码提示
     */
    public static final int BIND_CARD_APPLET_UPDATE = 3024;

    /**
     * 验证银行卡交易要素，银行通道人数超限提示
     */
    public static final int BANK_SYSTEM_BUSYING = 3025;

    /**
     * 请求解锁eSE被拒绝
     */
    // TODO XLN 预留，尚未用
    public static final int REJECT_UNRESTRICT_ESE = 3026;

    /**
     * 短信验证码超时
     */
    public static final int SMS_CODE_TIME_OUT = 4021;

    /**
     * 短信验证码错误
     */
    public static final int SMS_CODE_FAIL = 4022;

    /**
     * 服务器异常
     */
    public static final int SERVICE_ERROR = 9001;

    /**
     * 未知错误.
     */
    public static final int ERROR_UNKNOWN = -2;

    /**
     * SE应用未找到
     */
    public static final int SE_APP_NOT_FOUND = 10021;

    /**
     * 卡不支持当前操作
     */
    public static final int CARD_NOT_SUPPORT_CURRENT_OPERATION = 505;

    /**
     * 库存不足。
     */
    public static final int ERROR_CARD_NO_STOCK = 205;

    /**
     * 某个miui版本被禁用了,无法下单.
     */
    public static final int ERROR_MIUI_VERSION_RESTRICTED = 211;

    public static boolean isSuccess(int resultCode) {
        return resultCode == ErrorCode.SUCCESS;
    }
}
