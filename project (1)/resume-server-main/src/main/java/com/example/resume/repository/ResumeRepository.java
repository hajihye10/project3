package com.example.resume.repository;

import com.example.resume.dto.Resume;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ResumeRepository {

    /**
     * ID로 이력서를 조회합니다.
     * @param id 조회할 이력서 ID
     * @return 이력서 정보
     */
    Optional<Resume> findById(Integer id);

    Optional<Resume> findByUserName(String userName);

    /**
     * 모든 이력서를 조회합니다.
     * @return 이력서 목록
     */
    List<Resume> findAll();

    /**
     * 이력서를 저장합니다.
     * @param resume 저장할 이력서 정보
     */
    void save(Resume resume);

    /**
     * 이력서를 수정합니다.
     * @param resume 수정할 이력서 정보
     */
    void update(Resume resume);

    /**
     * ID로 이력서를 삭제합니다.
     * @param id 삭제할 이력서 ID
     */
    void deleteById(Integer id);
    
}
