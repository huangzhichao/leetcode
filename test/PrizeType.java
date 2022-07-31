public enum PrizeType {

    /**
     * 文本话术
     */
    TEXT,

    /**
     * 优惠券
     */
    COUPON(""),

    /**
     * 积分
     */
    POINT("6"),

    /**
     * 实物//线下商品
     */
    ITEM,

    /**
     * 虚拟商品
     */
    VIRTUAL_ITEM,

    /**
     * 谢谢参与
     */
    THANKS,

    /**
     * 成长值
     */
    GROWTH;

    private final boolean isJdPrize;

    private final String jdValue;

    PrizeType(String jdValue) {
        this.isJdPrize = true;
        this.jdValue = jdValue;
    }

    PrizeType() {
        this.isJdPrize = false;
        this.jdValue = "";
    }

}
