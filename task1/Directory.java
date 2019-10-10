/*
 * 5.Simple Classes
 * Task 1
 *
 * Создать объект класса Текстовый файл, используя классы Файл,
 * Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 *
 * Artsiom Barodka
 *
 */
package basics_of_OOP.Task1;

import java.util.ArrayList;

public class Directory{

    private ArrayList<File> files;
    private String path;

    public Directory(String path){
        this.path = path;
        files = new ArrayList<>();
    }

    public String getPath() {
        return path;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File file){
        if(getFile(file.getName()) != null){
            deleteFile(file);
        }
        files.add(file);
    }

    public void deleteFile(File file){
        files.removeIf((File f)->f.getName().equals(file.getName()));
    }

    public File getFile(String name){
        File file = null;
        for (File f:files) {
            if(f.getName().equals(name)){
                file = f;
            }
        }
        return file;
    }
}
