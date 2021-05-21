package com.project.workout.configration;

import com.project.workout.vo.ResponseVO;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean("modelMapper")
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    @Bean("responseVO")
    public ResponseVO getResponseVO(){
        return new ResponseVO();
    }

}
