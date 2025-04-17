package utils;

import org.apache.commons.io.FileUtils;

public class FileHelper {

    public static void testHelper() {
        System.out.println(FileUtils.getUserDirectory());
        System.out.println(FileUtils.getUserDirectoryPath());

        System.out.println("Call test helper");
    }
}
