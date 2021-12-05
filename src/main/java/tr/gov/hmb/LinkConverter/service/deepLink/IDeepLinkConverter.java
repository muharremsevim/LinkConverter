package tr.gov.hmb.LinkConverter.service.deepLink;

public interface IDeepLinkConverter {

    Boolean check(String deepLink);

    String createLink(String deepLink);
}
