package com.example.springCloudAlibaba.demo.abstractdemo;//package com.example.springCloudAlibaba.demo.abstractdemo;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author kangdongyang
// * @version 1.0
// * @description:
// * @date 2024/3/4 17:01
// */
//abstract  class BaseFileReader {
//
//    protected Path filePath; // 定义一个 protected 的 Path 对象，表示读取的文件路径
//
//    /**
//     * 构造方法，传入读取的文件路径
//     * @param filePath 读取的文件路径
//     */
//    protected BaseFileReader(Path filePath) {
//        this.filePath = filePath;
//    }
//    /**
//     * 读取文件的方法，返回一个字符串列表
//     * @return 字符串列表，表示文件的内容
//     * @throws IOException 如果文件读取出错，抛出该异常
//     */
//    public List<String> readFile() throws IOException {
//        return Files.lines(filePath) // 使用 Files 类的 lines 方法，读取文件的每一行
//                .map(this::mapFileLine) // 对每一行应用 mapFileLine 方法，将其转化为指定的格式
//                .collect(Collectors.toList()); // 将处理后的每一行收集到一个字符串列表中，返回
//    }
//
//    /**
//     * 抽象方法，子类需要实现该方法，将文件中的每一行转化为指定的格式
//     * @param line 文件中的每一行
//     * @return 转化后的字符串
//     */
//    protected abstract String mapFileLine(String line);
//    protected abstract String say();
//
//
//
//}
