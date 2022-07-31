public abstract class Prize {

    /**
     * 奖品唯一标识
     */
    private Long uid;

    /**
     * 奖品类型
     */
    private PrizeType type;

    /**
     * 奖品名称
     */
    private String name;

    /**
     * 奖品图片
     */
    private String picUrl;

    /**
     * 云存储
     */
    private String fileId;

    /**
     * 奖品详情
     * 未中奖跳转地址
     */
    private String config;

}
