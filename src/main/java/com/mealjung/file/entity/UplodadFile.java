package com.mealjung.file.entity;

import com.mealjung.common.entity.BaseTimeEntity;
import com.mealjung.common.utils.converter.statics.EnumConverterUtils;
import com.mealjung.file.web.dto.UploadFileRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UplodadFile extends BaseTimeEntity {
    @Id
    private UUID uuid;
    private FileType fileType;
    private String uploadFileName; // 업로드한 파일명
    private String storeFileName; // 저장된 파일명
    private String storeFilePath; // 파일 저장 경로

    public UplodadFile(UploadFileRequest request) {
        this.uuid = UUID.fromString(request.getUuid());
        this.fileType = EnumConverterUtils.ofEnum(FileType.class, request.getFileType());
        this.uploadFileName = request.getUploadFileName();
        this.storeFileName = request.getStoreFileName();
        this.storeFilePath = request.getStoreFilePath();
    }
}
