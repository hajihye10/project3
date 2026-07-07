package com.example.resume.repository;

import com.example.resume.dto.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserRepository {

    /**
     * username으로 사용자를 조회합니다.
     *
     * @param username 사용자 이름
     * @return 사용자 계정 정보
     */
    Optional<Account> findByUsername(String username);

    /**
     * 사용자 계정을 저장합니다.
     *
     * @param account 저장할 계정 정보
     */
    void save(Account account);

}
