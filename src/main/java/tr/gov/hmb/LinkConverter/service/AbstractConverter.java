package tr.gov.hmb.LinkConverter.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractConverter {

    public boolean urlMatchesRegex(String url, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

}
