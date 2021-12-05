package tr.gov.hmb.LinkConverter.service.webLink;

public interface ILinkConverter {

    Boolean check(String url);

    String createLink(String url);
}
