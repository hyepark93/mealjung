package com.mealjung.file.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UploadFileRequest {
    private String uuid;
    private String fileType;
    private String uploadFileName; // 업로드한 파일명
    private String storeFileName; // 저장된 파일명
    private String storeFilePath; // 파일 저장 경로

    public UploadFileRequest(String uuid, String fileType, String uploadFileName, String storeFileName, String storeFilePath) {
        this.uuid = uuid;
        this.fileType = fileType;
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
        this.storeFilePath = storeFilePath;
    }
}
