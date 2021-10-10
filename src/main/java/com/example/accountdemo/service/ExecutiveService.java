package com.example.accountdemo.service;

import com.example.accountdemo.dto.ExecutiveDto;
import org.springframework.ui.Model;

public interface ExecutiveService {
    String getExecutive(long id, Model model);

    String addExecutive(ExecutiveDto executiveDto, Model model);
}
