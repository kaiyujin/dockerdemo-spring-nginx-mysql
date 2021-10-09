package jp.co.jiyuseki.dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sample")
public class SampleController {

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    final SampleService sampleService;

    @RequestMapping(method = RequestMethod.GET)
    List<Sample> getSamples() {
        return sampleService.getSamples();
    }
}