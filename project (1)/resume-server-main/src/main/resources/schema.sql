-- account 테이블 생성
CREATE TABLE IF NOT EXISTS ACCOUNT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50)
);

-- resume 테이블 생성
CREATE TABLE IF NOT EXISTS RESUME (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userName VARCHAR(255) NOT NULL,
    userPhone VARCHAR(255) NOT NULL,
    portfolioUrl VARCHAR(255) NOT NULL,
    userEmail VARCHAR(255) NOT NULL,
    selfIntro TEXT NOT NULL,
    techSkills TEXT NOT NULL,
    academicHist TEXT NOT NULL,
    careerHist TEXT NOT NULL,
    appliedPosition VARCHAR(255) NOT NULL,
    createdUserId INT NOT NULL,
    createdDttm DATETIME NOT NULL DEFAULT NOW(),
    updatedDttm DATETIME NOT NULL DEFAULT NOW()
);
