package com.example.springCloudAlibaba.demo.abstractdemo;//package com.example.springCloudAlibaba.demo.abstractdemo;
//
//import java.io.IOException;
//import java.net.URISyntaxException;
//import java.net.URL;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
///**
// * @author kangdongyang
// * @version 1.0
// * @description:
// * @date 2024/3/4 17:03
// */
//public class FileReaderTest {
//    public static void main(String[] args) throws URISyntaxException, IOException {
//        URL location = FileReaderTest.class.getClassLoader().getResource("hello.txt");
//        Path path = Paths.get(location.toURI());
//        BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);
//        BaseFileReader uppercaseFileReader = new UppercaseFileReader(path);
//        System.out.println(lowercaseFileReader.readFile());
//        System.out.println(uppercaseFileReader.readFile());
//    }
//}
