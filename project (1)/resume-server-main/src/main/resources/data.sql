-- 테스트용 ADMIN 계정 추가 (비밀번호: password)
INSERT IGNORE INTO account (username, password, role) 
VALUES ('admin', '$2a$10$N.x5Y4y3DPxXFghFz.G.GeiVJwL0esvV25Dsjkhd5XyDRTdtVMEo2', 'ADMIN');

-- 테스트용 이력서 데이터 추가 (ID=1)
INSERT IGNORE INTO resume (id, userName, userPhone, portfolioUrl, userEmail, selfIntro, techSkills, academicHist, careerHist, appliedPosition, createdUserId, createdDttm, updatedDttm) 
VALUES (1, '하지혜', '010-9556-4641', 'hajihye1212@naver.com', 'http://my-portfolio.com', '안녕하세요. 끊임없이 배우고 성장하는 개발자 하지혜입니다.', 'Java,Spring Boot,MySQL,JavaScript', 'OO대학교 컴퓨터공학과 졸업', 'XX 프로젝트 참여 경험', '백엔드 신입 개발자', 1, NOW(), NOW());
