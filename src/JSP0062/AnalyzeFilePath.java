/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0062;

import java.io.File;

/**
 *
 * @author PHONG VU
 */
public class AnalyzeFilePath {

    public String getPath(String path) {
        int pos = path.lastIndexOf("\\");
        return path.substring(0, pos);
    }

    public String getFileName(String path) {
        int from = path.lastIndexOf("\\");
        int to = path.lastIndexOf(".");
        return path.substring(from + 1, to);
    }

    public String getExtension(String path) {
        int pos = path.lastIndexOf(".");
        return path.substring(pos + 1, path.length());
    }
//sqlit
//    public void getFolders(String path) {
//        String[] folder = path.split("\\\\");
//        System.out.print("Folder: ");
//        for (int i = 1; i < folder.length - 1; i++) {
//            System.out.print("[" + folder[i] + "]");
//        }
//        System.out.println("");
//   }
//substring
    public void getFolders(String path) {
        int head = path.indexOf("\\");
        int end = path.lastIndexOf("\\");
        System.out.print("Folder: ");
        if (head == end) {
            System.out.println("");
            return;
        } else {
            do {
                path = path.substring(head + 1, end);
                if (!path.contains("\\")) {
                    System.out.print("[" + path + "]");
                } else {
                    System.out.print("[" + path.substring(0, path.indexOf("\\")) + "]");
                    System.out.println("");
                    head = path.indexOf("\\");
                    end = path.length();
                }
            } while (path.contains("\\"));
        }
    }

    public void inputURL() {
        System.out.println("Please input Path: ");
        String path = CheckInput.checkString();
        System.out.println("Disk: " + path.substring(0, 2));
        System.out.println("Extension: " + getExtension(path));
        System.out.println("File Name: " + getFileName(path));
        System.out.println("Path: " + getPath(path));
        getFolders(path);

    }

}
