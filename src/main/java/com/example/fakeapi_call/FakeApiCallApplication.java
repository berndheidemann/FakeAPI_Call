package com.example.fakeapi_call;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakeApiCallApplication {

    public static void main(String[] args) {

        // erzeuge ein Objekt der Klasse SpringApplication
        // App laufen lassen
        SpringApplication.run(FakeApiCallApplication.class, args);


        FakeApiService fakeApiService = new FakeApiService();
        System.out.println(fakeApiService.getPostsAsJSON());




        FakePostDto[] result = fakeApiService.getPostsAsObject();
        for (var postDto : result) {
            System.out.println(postDto);
        }

        System.out.println("Post mit der Id 10: ");
        FakePostDto postDto = fakeApiService.getPostById(10);
        System.out.println(postDto);


        System.out.println("\nPost Nr. 1 mit der Id 1 und Responsehandling: ");
        FakePostDto postDto2 = fakeApiService.getPostByIdWithResponseHandling(1);
        System.out.println(postDto2);
    }

}
