package com.project.oneshot.entity.mybatis;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankVO {
    private int bankNo;
    private String bankName;
}