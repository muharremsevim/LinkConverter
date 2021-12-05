package tr.gov.hmb.LinkConverter.constants;

public class Constants {

    public static final String PRODUCT_URL_REGEX = "^https://(www.)?hmb\\.gov\\.tr/([\\wdğüşöçıİĞÜŞÖÇ]+)-p-([\\wdğüşöçıİĞÜŞÖÇ]+)(\\?[\\wdğüşöçıİĞÜŞÖÇ]+=[\\wdğüşöçıİĞÜŞÖÇ]+(\\&[\\wdğüşöçıİĞÜŞÖÇ]+=[\\wdğüşıöçİĞÜŞÖÇ]+)?)?$";
    public static final String SEARCH_URL_REGEX = "^https://(www.)?hmb\\.gov\\.tr/sr\\?q=([\\wdğüşöçıİĞÜŞÖÇ]+)$";

    public static final String SEARCH_DL_REGEX = "^ty://\\?Page=Search&Query=([\\wdğüşöçıİĞÜŞÖÇ]+)$";
    public static final String PRODUCT_DL_REGEX = "^ty://\\?Page=[Unit|Product]+(&([\\wdğüşöçıİĞÜŞÖÇ]+)=([\\wdğüşöçıİĞÜŞÖÇ]+))*$";

    public static final String DEFAULT_DL = "ty://?Page=Home";
    public static final String DEFAULT_URL = "https://www.hmb.gov.tr/";

    public static final String PRODUCT_URL_TEMPLATE = "https://www.hmb.gov.tr/btgm-p-%s";
    public static final String SEARCH_URL_TEMPLATE = "https://www.hmb.gov.tr/sr?q=%s";

    public static final String PRODUCT_DL_TEMPLATE = "ty://?Page=%s&ContentId=%s";
    public static final String SEARCH_DL_TEMPLATE = "ty://?Page=Search&Query=%s";

    public static final String BTGM = "btgm";
    public static final String TEAMID = "teamId";
    public static final String BRANCH = "branch";

    public static final String UNIT = "Unit";
    public static final String PRODUCT = "Product";

    public static final String CAMPAIGN_ID = "CampaignId";
    public static final String TEAM_ID = "TeamId";
    public static final String CONTENT_ID = "ContentId";
    public static final String QUERY = "Query";
}