package com.example.resume.ctl;

import com.example.resume.dto.Account;
import com.example.resume.dto.Resume;
import com.example.resume.service.AccountService;
import com.example.resume.service.ResumeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class resumeCtl {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/home")
    public String resumeHome(Model model) {
        // 임시로 ID 1번 이력서를 조회하여 모델에 추가합니다.
        Optional<Resume> resumeOptional = resumeService.getResumeByUserName("admin");
        System.out.println("resume db data: " + resumeOptional.get().toString());
        if (resumeOptional.isPresent()) {
            model.addAttribute("resume", resumeOptional.get());
        } else {
            // 이력서가 없을 경우, 비어있는 Resume 객체를 전달하여 타임리프 에러 방지
            model.addAttribute("resume", new Resume());
        }
        return "resume";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        // 임시로 ID 1번 이력서를 조회하여 모델에 추가합니다.
        Optional<Resume> resumeOptional = resumeService.getResumeById(1);
        if (resumeOptional.isPresent()) {
            model.addAttribute("resume", resumeOptional.get());
        } else {
            // 이력서가 없을 경우, 비어있는 Resume 객체를 전달하여 타임리프 에러 방지
            model.addAttribute("resume", new Resume());
        }
        return "admin";
    }

    @PostMapping("/admin/update")
    public String updateResume(@ModelAttribute Resume resume) {
        resumeService.updateResume(resume);
        return "redirect:/home";
    }

    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        return "portfolio";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/join")
    public String joinForm(Model model) {
        model.addAttribute("account", new Account());
        return "join";
    }

    @PostMapping("/join")
    public String joinProcess(Account account) {
        accountService.join(account);
        return "redirect:/login";
    }

}
