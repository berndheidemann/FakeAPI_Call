package com.example.fakeapi_call;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeApiService {

    private final RestTemplate restTemplate;
    private String url = "https://jsonplaceholder.typicode.com/posts";

    public FakeApiService() {
        this.restTemplate = new RestTemplate();
    }

    public String getPostsAsJSON(){
        return this.restTemplate.getForObject(url, String.class);
    }

    public FakePostDto[] getPostsAsObject(){
        return this.restTemplate.getForObject(url, FakePostDto[].class);
    }

    public FakePostDto getPostById(int id){
        return this.restTemplate.getForObject(this.url+"/{id}", FakePostDto.class, id);
    }

    public FakePostDto getPostByIdWithResponseHandling(int id) {
        ResponseEntity<FakePostDto> response = this.restTemplate.getForEntity(this.url+"/{id}",
                FakePostDto.class, id);
        System.out.println(("Fetched Time: " + response.getHeaders().getDate()));
        System.out.println("Http-Statuscode: "+response.getStatusCode());
        System.out.println("Header: \n"+ response.getHeaders());
        if(response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            return null;
        }
    }


}
