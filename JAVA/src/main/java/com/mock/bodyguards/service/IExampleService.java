package com.mock.bodyguards.service;

import com.mock.bodyguards.dto.example.ExampleRequest;
import com.mock.bodyguards.dto.example.ExampleResponse;

public interface IExampleService {

    /**
     * @param exampleRequest
     */
    ExampleResponse createExample(ExampleRequest exampleRequest);


    /**
     * @param mobileNumber
     * @return
     */
    ExampleResponse fetchExample(String mobileNumber);

    /**
     * @param customerDto
     * @return
     */
    boolean updateExample(ExampleRequest customerDto);


    /**
     * @param mobileNumber
     * @return
     */
    boolean deleteExample(String mobileNumber);
}
