package com.example.resume.service;

import com.example.resume.dto.Resume;
import com.example.resume.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    public Optional<Resume> getResumeById(Integer id) {
        return resumeRepository.findById(id);
    }

    public Optional<Resume> getResumeByUserName(String username) {
        return resumeRepository.findByUserName(username);
    }

    public List<Resume> getAllResumes() {
        return resumeRepository.findAll();
    }

    public void saveResume(Resume resume) {
        // TODO: createdUserId를 현재 로그인한 사용자 ID로 설정하는 로직 추가 필요
        resumeRepository.save(resume);
    }

    public void updateResume(Resume resume) {
        resumeRepository.update(resume);
    }

    public void deleteResume(Integer id) {
        resumeRepository.deleteById(id);
    }
}
