package com.mealjung.file.component;

import com.mealjung.file.entity.UplodadFile;
import com.mealjung.file.web.dto.UploadFileRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class FileStore {
    @Value("${file.dir}")
    private String fileDir;

    public String getFullPath(String fileName) {
        return fileDir + fileName;
    }

    public List<UplodadFile> storeFiles(List<MultipartFile> multipartFiles) throws IOException {
        List<UplodadFile> stroeFileResult = new ArrayList<>();
        for (MultipartFile multipartFile : multipartFiles) {
            if (!multipartFile.isEmpty()) {
                stroeFileResult.add(storeFile(multipartFile));
            }
        }
        return stroeFileResult;
    }

    public UplodadFile storeFile(MultipartFile multipartFile) throws IOException {
        if (multipartFile.isEmpty()) {
            return null;
        }
        String originalFileName = multipartFile.getOriginalFilename();
        String storeFileName = createStoreFileName(originalFileName);
        multipartFile.transferTo(new File(getFullPath(storeFileName)));
        UploadFileRequest request = new UploadFileRequest();
        return new UplodadFile(request);
    }

    private String createStoreFileName(String originalFileName) {
        String ext = extractExt(originalFileName);
        String uuid = UUID.randomUUID().toString();
        return uuid + "." + ext;
    }

    private String extractExt(String originalFileName) {
        int pos = originalFileName.lastIndexOf(".");
        return originalFileName.substring(pos + 1);
    }
}
