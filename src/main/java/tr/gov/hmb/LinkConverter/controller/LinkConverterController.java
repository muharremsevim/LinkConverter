package tr.gov.hmb.LinkConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;
import tr.gov.hmb.LinkConverter.service.impl.DeepLinkConverterService;
import tr.gov.hmb.LinkConverter.service.impl.WebUrlConverterService;

@EnableAsync
@RestController
@RequestMapping("/api/links")
public class LinkConverterController {

    @Autowired
    private WebUrlConverterService webUrlConverterService;

    @Autowired
    private DeepLinkConverterService deepLinkConverterService;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping("/urlToDeeplink")
    public String fromUrl(@RequestParam String url) {
        return webUrlConverterService.convertUrlAction(url);
    }

    @PostMapping("/deeplinkToUrl")
    public String fromDeepLink(@RequestParam String deepLink) {
        return deepLinkConverterService.convertUrlAction(deepLink);
    }

}
