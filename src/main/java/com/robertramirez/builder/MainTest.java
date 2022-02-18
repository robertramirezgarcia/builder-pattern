package com.robertramirez.builder;

public class MainTest {
    public static void main(String[] args) {

        //using builder lombok
        LombokBuilder lb = LombokBuilder.builder()
                .name("Peter")
                .id(Long.valueOf(1))
                .build();

        System.out.println("id -> " + lb.getId());
        System.out.println("name -> " + lb.getName());
    }
}
