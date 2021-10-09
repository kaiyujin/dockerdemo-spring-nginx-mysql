package jp.co.jiyuseki.dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SampleService {

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    final SampleRepository sampleRepository;

    public List<Sample> getSamples() {
        return sampleRepository.findAll();
    }
}


