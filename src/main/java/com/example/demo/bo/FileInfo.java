package com.example.demo.bo;

/**
 * Created by dell on 2018/5/7.
 * 文件上传和下载
 * 编写一个实体类，用于封装返回信息
 */
public class FileInfo {
    private String path;

    public FileInfo(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
