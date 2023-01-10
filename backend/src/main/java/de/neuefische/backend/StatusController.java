package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
@RequiredArgsConstructor
public class StatusController {
    private final TestRecordRepository testRecordRepository;

    @GetMapping
    public String get () {
        return "OK";
    }

    @GetMapping("/db")
    public String testRecordDb () {
        testRecordRepository.save(new TestRecord());
        return "DONE";
    }
}
