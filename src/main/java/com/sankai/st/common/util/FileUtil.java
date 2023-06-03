package com.sankai.st.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.util.StringUtils;

/**
 * 文件工具类
 *
 * @author sankai
 * @since 2023-06-02 23:06:59
 */
public class FileUtil {
    private FileUtil() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * 将给定文件内容流写入磁盘
     * @param outfile
     * @param content
     * @throws IOException
     */
    public static void writeToDisk(String outfile, byte[] content) throws IOException {
        if(null == content || StringUtils.isEmpty(outfile) || content.length < 1) {
            return;
        }

        FileOutputStream fos = null;
        try {
            File outFile = new File(outfile);
            if(!outFile.getParentFile().exists()){
                outFile.getParentFile().mkdirs();
            }
            if(!outFile.exists()){
                outFile.createNewFile();
            }

            fos = new FileOutputStream(outfile);
            fos.write(content);
        } catch (IOException e) {
            throw e;
        } finally {
            if(null != fos){
                try {
                    fos.flush();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 将给定文件流写入磁盘
     *
     * @param outfile
     * @param in
     * @throws IOException
     */
    public static void writeToDisk(String outfile, InputStream in) throws IOException {
        if(null == in || StringUtils.isEmpty(outfile)) {
            return;
        }

        FileOutputStream fos = null;
        try {
            File outFile = new File(outfile);
            if(!outFile.getParentFile().exists()){
                outFile.getParentFile().mkdirs();
            }
            if(!outFile.exists()){
                outFile.createNewFile();
            }

            fos = new FileOutputStream(outfile);
            byte[] buf = new byte[40960];
            int len = -1;
            while((len = in.read(buf)) != -1){
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if(null != in) {
                in.close();
            }
            if(null != fos){
                try {
                    fos.flush();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 写文本到文件
     * @param outfile 目标文件
     * @param content 文本内容
     * @param isAppend 是否追加方式
     * @author goofus
     */
    public static void writeStr(String outfile, String content, boolean isAppend){
        FileWriter writer = null;
        try {
            File outFile = new File(outfile);
            if(!outFile.getParentFile().exists()){
                outFile.getParentFile().mkdirs();
            }
            if(!outFile.exists()){
                outFile.createNewFile();
            }

            writer = new FileWriter(outFile, isAppend);
            writer.write(content);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(null != writer){
                try {
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
