package com.project.oneshot.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ContractVO { //계약가격 테이블(DB기준)

    private Integer productNo; //상품번호
    private Integer employeeNo; //사원번호
    private Integer clientNo; //고객사번호
    private Date contractSdate; //계약시작일
    private Date contractEdate; //계약종료일
    private Integer contractPrice; //책정거래가


}