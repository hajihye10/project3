package com.example.resume.dto;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Alias("Resume")
public class Resume {
    private Integer id;
    
    // 2. 문자열 필드 (VARCHAR, TEXT -> String)
    private String userName;
    private String userPhone;
    private String portfolioUrl;
    private String userEmail;
    
    // 긴 텍스트 필드 (TEXT 타입)
    private String selfIntro;
    private String techSkills;
    
    // 이전 답변에서 추천해 드린 변수명을 적용했습니다.
    private String academicHist;     // DDL의 academicHist
    private String careerHist;    // DDL의 careerHist
    private String appliedPosition;      // DDL의 appliedPosition
    
    // 3. 외래 키 및 시스템 필드 (INT, DATETIME)
    private String createdUserId;
    
    // DATETIME 타입은 Java 8 이후 표준인 LocalDateTime을 사용합니다.
    private String createdDttm;
    private String updatedDttm;
}
