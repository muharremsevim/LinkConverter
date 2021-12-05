package tr.gov.hmb.LinkConverter.constants;

public class Constants {

    public static final String PRODUCT_URL_REGEX = "^https://(www.)?hmb\\.gov\\.tr/([\\wdğüşöçıİĞÜŞÖÇ]+)-p-([\\wdğüşöçıİĞÜŞÖÇ]+)(\\?[\\wdğüşöçıİĞÜŞÖÇ]+=[\\wdğüşöçıİĞÜŞÖÇ]+(\\&[\\wdğüşöçıİĞÜŞÖÇ]+=[\\wdğüşıöçİĞÜŞÖÇ]+)?)?$";
    public static final String SEARCH_URL_REGEX = "^https://(www.)?hmb\\.gov\\.tr/sr\\?q=([\\wdğüşöçıİĞÜŞÖÇ]+)$";

    public static final String DEFAULT_DL = "ty://?Page=Home";
    public static final String DEFAULT_URL = "https://hmb.gov.tr/";

    public static final String PRODUCT_DL_TEMPLATE = "ty://?Page=%s&ContentId=%s";
    public static final String SEARCH_DL_TEMPLATE = "ty://?Page=Search&Query=%s";

    //    public static final String BTGM = "btgm";
    public static final String TEAM_ID = "teamId";
    public static final String BRANCH = "branch";

    public static final String UNIT = "Unit";
    public static final String PRODUCT = "Product";
}