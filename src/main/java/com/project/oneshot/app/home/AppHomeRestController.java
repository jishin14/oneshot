package com.project.oneshot.app.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/homeApp")
public class AppHomeRestController {

    @Autowired
    AppHomeService appHomeService;

    // 오늘 계약 건수 조회
    @GetMapping("/contractCount")
    @CrossOrigin(origins = "*")
    public int getContractCount() {
        int contractCount = appHomeService.getContractCount();
        return contractCount;
    }

    // 오늘 판매 건수 조회
    @GetMapping("/salesCount")
    @CrossOrigin(origins = "*")
    public int getSalesCount() {
        int salesCount = appHomeService.getSalesCount();
        System.out.println("판매건수: " + salesCount);
        return salesCount;
    }

    // 분기별 판매 총액
    @GetMapping("/getQuarterlyOrderAmount")
    public List<Map<String, Object>> getQuarterlyOrderAmount() {
        return appHomeService.getQuarterlyOrderAmount();
    }

}
