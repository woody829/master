package com.shrbank.common;

public interface Constants {

    //系统的返回编码
    public static final String SUCCESS = "00";
    public static final String SUC_MSG = "成功";
    public static final String FAIL = "01";
    public static final String FAIL_MSG = "失败";
    public static final String LARGERTIME = "02";
    public static final String LARGERTIME_MSG = "还不到倒计时时间";
    public static final String SMALLERTIME = "03";
    public static final String SMALLERTIME_MSG = "已经超过参与时间";
    public static final String EXP = "99";
    public static final String EXP_MSG = "程序异常";

    public static String WORD_SEPARATOR = "_";
    public static String ACTIVITY_TICKET_COUNT = WORD_SEPARATOR + "ticketCount";
    public static String ACTIVITY_DATE_START = WORD_SEPARATOR + "dateStart";
    public static String ACTIVITY_DATE_END = WORD_SEPARATOR + "dateEnd";
    public static String ACTIVITY_JOIN_TIME = WORD_SEPARATOR + "joinTime";
    public static String ACTIVITY_GROUP = WORD_SEPARATOR + "group";
    public static String ACTIVITY_UNION_GROUP = WORD_SEPARATOR + "unionGroup";
    public static String ACTIVITY_JSON_OBJECT = WORD_SEPARATOR + "jsonObject";
    public static String NEXT_ACTIVITY = WORD_SEPARATOR + "nextActivity";
    public static String POOL_CODE = WORD_SEPARATOR + "poolCode";

    public static String DATA_RELATION_LIST = WORD_SEPARATOR + "relationList";
    public static String ACTIVITY_PRIZE_LIST = WORD_SEPARATOR + "prizeList";
    public static String ACTIVITY_ALREADY_PRIZED_LIST = WORD_SEPARATOR + "alreadyPrizedList";
    public static String LOTTERY_HAS_HIT_IN_A_RANGE = WORD_SEPARATOR + "hasHitInaRange";
    public static String LOTTERY_RANGE_LIMIT = WORD_SEPARATOR + "rangeLimit";

    public static String STATISTICS = WORD_SEPARATOR + "statistics";
    public static String POLICY = WORD_SEPARATOR + "policy";

    public static String ACTIVITY_TYPE_SECKILL = "0";
    public static String ACTIVITY_TYPE_SHARE = "1";


    public static final String WINNER_MSG = "恭喜，您获得电影票一张";
    public static final String FAILURE_MSG = "很遗憾，离中奖只有那么一点点";
    public static final int ONE_DAY_SECONDS = 24 * 60 * 60;

    public static String SHARE_SUCCESS_LIST = WORD_SEPARATOR + "shareSuccessList";
    public static String URLDECODER_ENCODING = "UTF-8";
    public static String ACTIVITY_START_TIME = "startTime";
    public static String ACTIVITY_END_TIME = "endTime";
    public static String WINNER_LIST = "winnerList";
    public static String CHANNEL_SUCCESS = "1";
    public static String CHANNEL_FALIL = "0";

    public static final String EXCEL_XLS = ".xls";
    public static final String EXCEL_XLSX = ".xlsx";
    public static final String NO_INPORT_DATA = "400";//无导入数据
    public static final String NO_INPORT_DATA_MSG = "无导入数据";//无导入数据
    public static final String CONVERT_ERROR = "401";//解析错误
    public static final String FILE_NAME_EMPTY = "402";//文件名为空错误码
    public static final String FILE_NAME_EMPTY_MSG = "文件名为空";
    public static final String PRIZE_DUPLICATEKEY = "403";//导入的数据与数据库中存在重复错误码
    public static final String PRIZE_DUPLICATEKEY_MSG = "导入的数据与数据库中存在重复";

    public static final int HTTP_TIMEOUT = 10000;//10秒
}
