package com.mounacode.Upload_Image.bucket;

public enum BucketName {
    PROFILE_IMAGE("mounacode-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {

        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
